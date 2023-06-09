package day2;

import java.util.Scanner;

/**
 * @author Neil Alishev
 * @student Nikita Starkov
 *
 * Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число x. Для этого числа,
 * по формуле выше, необходимо вычислить значение y и вывести его в консоль, используя метод System.out.println().
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y;

        if (x >= 5)
            y = (Math.pow(x, 2) - 10) / (x + 7);
        else if (x > -3 && x < 5)
            y = (x + 3) * (Math.pow(x, 2) - 2);
        else
            y = 420;

        System.out.println(y);
    }
}
