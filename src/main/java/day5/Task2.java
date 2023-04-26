package day5;

/**
 * @author Neil Alishev
 * @student Nikita Starkov
 *
 * Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”.
 * Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
 * Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
 * Вывести в консоль значение каждого из полей, используя get методы.
 */

public class Task2 {
    public static void main(String[] args) {
        Motorcycle yamaha = new Motorcycle("ZX4", "Red", 2023);
        System.out.println(yamaha.getColor());
        System.out.println(yamaha.getModel());
        System.out.println(yamaha.getReleaseYear());
    }
}
