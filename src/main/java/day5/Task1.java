package day5;

/**
 * @author Neil Alishev
 * @student Nikita Starkov
 *
 * Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
 * Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
 * Задать значение для каждого поля, используя set методы.
 * Вывести в консоль значение каждого из полей, используя get методы.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */

public class Task1 {
    public static void main(String[] args) {
        Car honda = new Car();
        honda.setColor("black");
        honda.setModel("Civic");
        honda.setReleaseYear(2008);

        System.out.println(honda.getColor());
        System.out.println(honda.getModel());
        System.out.println(honda.getReleaseYear());
    }
}
