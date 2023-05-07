package day14;

import java.io.File;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/people.txt");
        System.out.println(Person.parseFileToObjList(file));
    }
}
