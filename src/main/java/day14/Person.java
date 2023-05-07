package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int year;

    public Person(String name, int age) {
        this.name = name;
        this.year = age;
    }

    public static List<Person> parseFileToObjList(File file){
        List<Person> persons = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] peoplesData = line.split(" ");
                if(peoplesData[1].contains("-"))
                    throw new IllegalArgumentException();
                Person person = new Person(peoplesData[0], Integer.parseInt(peoplesData[1]));
                persons.add(person);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return null;
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
            return null;
        }
        return persons;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
