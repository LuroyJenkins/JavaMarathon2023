package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/D14T1.txt");
        printResult(file);
    }

    public static void printResult(File file){
        int sum = 0;
        int counter = 0;
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            for (String number: numbers) {
                sum += Integer.parseInt(number);
                counter++;
            }
            System.out.print(((double) sum/counter) + " --> ");
            System.out.printf("%.3f", (float) sum/counter);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

