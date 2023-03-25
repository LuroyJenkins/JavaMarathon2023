package day4;

import java.util.Random;

/**
 * @author Neil Alishev
 * @student Nikita Starkov
 *
 * Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12, n=8
 * (m - размерность по строкам, n - размерность по колонкам).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна.
 * Если таких строк несколько, вывести индекс последней из них.
 * Пример сгенерированной матрицы (для простоты m=3, n=5):
 *
 * 3 2 1 5 7 	// сумма - 18
 * 1 2 5 6 2 	// сумма - 16
 * 3 4 9 6 4	// сумма - 26
 *
 * Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
 */

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[12][8];
        int counter = 0;
        int maxAmount = 0;
        int numberOfLine = 0;

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = rand.nextInt(50);
                    counter += array[i][j];
            }
            if(counter >= maxAmount){
                maxAmount = counter;
                numberOfLine = i;
            }
            counter = 0;
        }

        System.out.println(numberOfLine+1);
    }
}
