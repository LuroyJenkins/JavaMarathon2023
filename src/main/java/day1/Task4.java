package day1;

/**
 * @author Neil Alishev
 * @student Nikita Starkov
 *
 * Используя цикл while, выведите в столбик строки вида “Олимпиада year года”, где year - это число, которое принимает
 * значения, начиная от 1980 до 2020, с шагом увеличения равным 4.
 * То есть на первой итерации цикла, year равен 1980, а на каждой следующей итерации, значение year увеличивается на 4.
 * Строки такого вида выводятся до тех пор, пока значение year не станет больше 2020
 */

public class Task4 {
    public static void main(String[] args) {
        int year = 1980;
        while (year <= 2020) {
            System.out.printf("Олимпиада %d года\n", year);
            year += 4;
        }
    }
}
