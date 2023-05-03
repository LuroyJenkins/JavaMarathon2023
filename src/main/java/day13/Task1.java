package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("nikita_starkov");
        User user2 = new User("bogdanka_polina");
        User user3 = new User("sid");

        user1.sendMessage(user2,"Раз-раз, привет!");
        user1.sendMessage(user2, "Ауууу");

        user2.sendMessage(user1, "И тебе привет!");
        user2.sendMessage(user1, "У меня все отлично, ты как?");
        user2.sendMessage(user1, "Как настроение?");

        user3.sendMessage(user1, "Не могу найти тебя.");
        user3.sendMessage(user1, "Перезвони");
        user3.sendMessage(user1, "Это срочно");

        user1.sendMessage(user3, "Звоню, возьми трубку!");
        user1.sendMessage(user3, "И что это значит?)");
        user1.sendMessage(user3, "Что за прикол?");

        user3.sendMessage(user1, "Извини, не мог взять трубку.");

        MessageDatabase.showDialog(user1, user3);
        System.out.println();
        MessageDatabase.showDialog(user3, user1);
    }
}
