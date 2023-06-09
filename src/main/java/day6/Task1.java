package day6;

/**
 * @author Neil Alishev
 * @student Nikita Starkov
 *
 * В классах Автомобиль и Мотоцикл реализуйте два метода:
 * void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 * int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год) и возвращает разницу между
 * переданным годом и годом выпуска транспортного средства (возвращаться должно всегда положительное число).
 * Пример: inputYear передан как 2020, поле класса year инициализировано числом 2010 или наоборот,
 * должно быть возвращено одно и тоже положительное число 10. Такого понятия как “некорректный ввод” или любое другое
 * сигнализирующее об ошибке, здесь быть не может
 *
 * В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.
 */
public class Task1 {
    public static void main(String[] args) {
        Motorbike yamaha = new Motorbike("CX5", "Red", 2020);

        yamaha.info();
        System.out.println(yamaha.yearDifference(2023));
    }
}
