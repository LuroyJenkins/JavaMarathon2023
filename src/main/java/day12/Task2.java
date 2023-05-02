package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        listGenerator(0, 30, numbers);
        listGenerator(300, 350, numbers);

        System.out.println(numbers);

    }

    public static void listGenerator(int initialNumber, int finiteNumber, List<Integer> list){
        for(int i = initialNumber; i <= finiteNumber; i++){
            if(i % 2 == 0)
                list.add(i);
        }
    }
}
