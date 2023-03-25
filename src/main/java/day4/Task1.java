package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Neil Alishev
 * @student Nikita Starkov
 *
 * С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить
 * его случайными числами от 0 до 10 (включительно). Используя цикл for each вывести содержимое массива в консоль,
 * а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int length = scanner.nextInt();
        int counter = 0;

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = rand.nextInt(11);
        }

        System.out.println(Arrays.toString(array));

        System.out.println();
        System.out.println("Длина массива: " + array.length);
        for (int arrays : array) {
            if (arrays > 8)
                counter++;
        }
        System.out.println("Количество чисел больше 8: " + counter);
        counter = 0;

        for (int arrays : array) {
            if (arrays == 1)
                counter++;
        }
        System.out.println("Количество чисел равных 1: " + counter);
        counter = 0;

        for (int arrays : array) {
            if (arrays % 2 == 0)
                counter++;
        }
        System.out.println("Количество четных чисел: " + counter);
        System.out.println("Количество нечетных чисел: " + (array.length - counter));
        counter = 0;

        for (int arrays : array) {
            counter += arrays;
        }
        System.out.println("Сумма всех элементов массива: " + counter);
    }
}
