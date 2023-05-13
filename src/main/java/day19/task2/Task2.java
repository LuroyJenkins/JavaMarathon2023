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
        Map<String, Point> taxiMap = readFile(file);
        searchTaxiInSquare(taxiMap);


    }

    public static Map<String, Point> readFile(File file) {
        Map<String, Point> map = new HashMap<>();
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            while (scanner.hasNext()) {
                map.put(scanner.next(), new Point(scanner.nextInt(), scanner.nextInt()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
        return map;
    }

    public static void searchTaxiInSquare(Map<String, Point> map) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int counter = 0;

        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            for (Map.Entry<String, Point> entry : map.entrySet()) {
                if (((x1 < entry.getValue().getX() && entry.getValue().getX() < x2)
                        || (x2 < entry.getValue().getX() && entry.getValue().getX() < x1))
                        && ((y2 < entry.getValue().getY() && entry.getValue().getY() < y1)
                        || (y1 < entry.getValue().getY() && entry.getValue().getY() < y2))) {
                    System.out.println(entry.getKey());
                    counter++;
                }
            }
            System.out.println("Общее кол-во машин попавших в квадрат = " + counter);
        } else System.out.println("Вы ввели координаты не для квадрата!");

    }
}

