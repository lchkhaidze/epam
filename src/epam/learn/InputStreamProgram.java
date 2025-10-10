package epam.learn;

import java.util.Scanner;

public class InputStreamProgram {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();
//        System.out.println("Hello " + input);

//        ElectronicWatch();

        System.out.println(ConditionalStatements(4));   // Outputs: 16
        System.out.println(ConditionalStatements(-5));  // Outputs: 5
        System.out.println(ConditionalStatements(0));   // Outputs: 0

    }

    public static void ElectronicWatch() {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds / 60) % 60;
        int secs = seconds % 60;

        System.out.printf("%d:%02d:%02d\n", hours, minutes, secs);
    }

    public static int ConditionalStatements(int n) {
        if (n > 0) {
            return n * n;
        } else if (n < 0) {
            return Math.abs(n);
        } else {
            return 0;
        }
    }
}