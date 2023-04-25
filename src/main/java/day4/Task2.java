package day4;

import java.util.Random;

/**
 * @author Neil Alishev
 * @student Nikita Starkov
 *
 * Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Затем, используя цикл for each вывести в консоль:
 * наибольший элемент массива
 * наименьший элемент массива
 * количество элементов массива, оканчивающихся на 0
 * сумму элементов массива, оканчивающихся на 0
 *
 * Использовать сортировку запрещено.
 */

public class Task2 {
    public static void main(String[] args) {
        int min_value = Integer.MAX_VALUE;
        int max_value = Integer.MIN_VALUE;
        int decadesCounter = 0;
        int sumDecades = 0;

        Random rand = new Random();

        int[] array = new int[100];

        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(10000);
            if(array[i] > max_value)
                max_value = array[i];
            if (array[i] < min_value)
                min_value = array[i];
            if (array[i] % 10 == 0){
                decadesCounter++;
                sumDecades += array[i];
            }
        }

        System.out.println(max_value);
        System.out.println(min_value);
        System.out.println(decadesCounter);
        System.out.println(sumDecades);
    }
}
