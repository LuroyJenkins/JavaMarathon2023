package day8;

public class Task1 {
    public static void main(String[] args) {
        String string = "";
        long startTime = System.currentTimeMillis();
        for(int i = 0; i <= 20000; i++){
            string = string + i + " ";
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime-startTime));

        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();
        for(int i = 0; i <= 20000; i++){
            sb.append(i + " ");
        }
        stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime-startTime));
    }
}
