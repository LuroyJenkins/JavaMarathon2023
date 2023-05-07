package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file){
        List<String> peoples = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] peoplesData = line.split(" ");
                if(peoplesData[1].contains("-"))
                    throw new IllegalArgumentException();
                peoples.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return null;
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
            return null;
        }
        return peoples;
    }
}
