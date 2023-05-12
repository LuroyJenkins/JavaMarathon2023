package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, numbers.length));

    }

    public static int recursionSum(int[] numbers, int length) {
        if (length == 1)
            return numbers[0];
        return numbers[length - 1] + recursionSum(numbers, length - 1);
    }
}
