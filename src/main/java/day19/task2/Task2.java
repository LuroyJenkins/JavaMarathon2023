package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/taxi_cars.txt");
        Map<Integer, Point> taxiMap = readFile(file);
        searchTaxiInSquare(taxiMap);


    }

    public static Map<Integer, Point> readFile(File file) {
        Map<Integer, Point> map = new HashMap<>();
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            while (scanner.hasNext()) {
                map.put(Integer.parseInt(scanner.next()), new Point(scanner.nextInt(), scanner.nextInt()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
        return map;
    }

    public static void searchTaxiInSquare(Map<Integer, Point> taxiCars) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int[] squareCoordinates = new int[4];
        for (int i = 0; i < squareCoordinates.length; i++){
            squareCoordinates[i] = scanner.nextInt();
        }

        if (isSquare(squareCoordinates)) {
            for (Map.Entry<Integer, Point> taxiCar : taxiCars.entrySet()) {
                if (isInside(taxiCar, squareCoordinates)) {
                    System.out.println(taxiCar.getKey());
                    counter++;
                }
            }
            System.out.println("Общее кол-во машин попавших в квадрат = " + counter);
        } else System.out.println("Вы ввели координаты не для квадрата!");

    }

    private static boolean isInside(Map.Entry<Integer, Point> taxiCar, int[] square){
        int taxiX = taxiCar.getValue().getX();
        int taxiY = taxiCar.getValue().getY();

        return taxiX > square[0] && taxiX < square[2] && taxiY < square[1] && taxiY > square[3];
    }

    private static boolean isSquare(int[] squareCoordinates){
        return Math.abs(squareCoordinates[0]-squareCoordinates[1]) == Math.abs(squareCoordinates[2] - squareCoordinates[3]);
    }
}

