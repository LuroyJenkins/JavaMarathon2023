package day6;

import java.util.concurrent.ThreadLocalRandom;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void evaluate(Student student){
        int grade = ThreadLocalRandom.current().nextInt(2, 6);
        String gradeString = "";
        switch (grade){
            case 2:
                gradeString = "неудовлетворительно";
                break;
            case 3:
                gradeString = "удовлетворительно";
                break;
            case 4:
                gradeString = "хорошо";
                break;
            case 5:
                gradeString = "отлично";
        }

        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName()
                + " по предмету "+ subject + " на оценку " + gradeString + ".");
    }

}
