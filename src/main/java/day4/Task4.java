package day4;

import java.util.Random;

/**
 * @author Neil Alishev
 * @student Nikita Starkov
 *
 * Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов.
 * Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки
 */

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;
        int count = 0;

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            int sumOfThree;
            array[i] = rand.nextInt(10000);
            if (i > 1) {
                sumOfThree = array[i - 2] + array[i - 1] + array[i];
                if (sum < (sumOfThree)) {
                    sum = sumOfThree;
                    count = i-2;
                }
            }

        }

        System.out.println(sum);
        System.out.println(count);
    }
}
