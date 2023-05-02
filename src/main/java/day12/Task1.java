package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Toyota");
        cars.add("Honda");

        System.out.println(cars);

        cars.add(3, "Lada");

        cars.remove(0);
        System.out.println(cars);
    }
}
