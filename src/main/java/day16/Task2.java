package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    public static void main(String[] args) {
        String path = "src/main/resources/";
        File file1 = new File(path + "file1.txt");
        File file2 = new File(path + "file2.txt");
        file1.getParentFile().mkdirs();
        file2.getParentFile().mkdirs();

        generateFile1(file1);
        generateFile2(file1, file2);
        printResult(file2);
    }

    public static void generateFile1(File file){
        try {
            PrintWriter pw = new PrintWriter(file);
            for(int i = 0; i < 1000; i++){
                pw.print(ThreadLocalRandom.current().nextInt(0, 101) + " ");
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void generateFile2(File file1, File file2){
        try {
            Scanner scanner = new Scanner(file1);
            PrintWriter pw = new PrintWriter(file2);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int sum = 0;
            int counter = 0;

            for(int i = 0; i < (Math.ceil((double) numbers.length / 20)); i++){
                for(int j = 0; j < 20; j++){
                    sum += Integer.parseInt(numbers[j]);
                    counter++;
                    if(numbers[j+1].isEmpty())
                        break;
                }
                pw.print((double) sum/counter + " ");
                sum = 0;
                counter = 0;
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            double sum = 0;
            for (String number : numbers) {
                sum += Double.parseDouble(number);
            }
            System.out.println((int) sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
