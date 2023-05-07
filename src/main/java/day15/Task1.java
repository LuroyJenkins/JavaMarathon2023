package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "src/main/resources/";
        File fileShoes = new File(path + "shoes.csv");
        File fileMissingShoes = new File(path + "missing_shoes.txt");
        fileMissingShoes.getParentFile().mkdirs();

        List<String> missingShoes = parseFileToStringList(fileShoes);

        writeDataToFile(fileMissingShoes, missingShoes);


    }

    public static List<String> parseFileToStringList(File file) {
        List<String> shoes = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoesData = line.split(";");
                int balance = shoesData.length - 1;
                if (Integer.parseInt(shoesData[balance]) < 0)
                    throw new IllegalArgumentException();
                if (Integer.parseInt(shoesData[balance]) == 0)
                    shoes.add(line);
            }
            scanner.close();
            return shoes;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный формат файла. Убедитесь что кол-во остатков в последнем столбце");
        }
        return null;
    }

    public static void writeDataToFile(File file, List<String> data) {
        try {
            PrintWriter pw = new PrintWriter(file);
            for (String line : data) {
                pw.println(line);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
