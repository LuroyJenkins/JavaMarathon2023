package day6;

/**
 * @author Neil Alishev
 * @student Nikita Starkov
 *
 * Создать класс Самолет (Airplane) с полями:
 * manufacturer (изготовитель)
 * year (год выпуска)
 * length (длина)
 * weight (вес)
 * fuel (количество топлива в баке)
 *
 *
 * Для всех полей должны быть реализованы сеттеры, а для поля fuel еще и геттер.
 *
 * Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса
 * (значение поля “количество топлива в баке” установить равным 0). В конструкторе для передачи полям значений
 * использовать ключевое слово this. Помимо этого, в классе необходимо реализовать метод info(),
 * который выводит сообщение в следующем формате:
 * “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
 *
 * Также, необходимо реализовать метод fillUp(int n), который в качестве аргумента принимает число и дозаправляет
 * топливный бак самолета на это значение.
 * Создать новый объект класса Самолет с произвольными данными.
 * Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp(int n) два раза, передав разные значения.
 * Вызвать метод info().
 */

public class Task2 {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("Boeing", 2020, 120, 2000);

        boeing.setYear(2023);
        boeing.setLength(150);
        boeing.fillUp(500);
        boeing.fillUp(250);
        boeing.info();
    }
}
