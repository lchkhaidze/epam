package epam.learn;

public class ConditionStatements {
    public static void main(String[] args) {
        System.out.println(task1(4));   // Outputs: 16
        System.out.println(task1(-5));  // Outputs: 5
        System.out.println(task1(0));   // Outputs: 0
    }

    public static int task1(int n) {
        if (n > 0) {
            return n * n;
        } else if (n < 0) {
            return Math.abs(n);
        } else {
            return 0;
        }
    }
}