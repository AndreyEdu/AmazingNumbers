package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a natural number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numString = Integer.toString(number);


        if (naturalNumber(number)) {
            System.out.println("Properties of " + number);
            System.out.println("        even: " + isEven(number));
            System.out.println("        odd: " + isOdd(number));
            System.out.println("        buzz: " + isBuzz(number, numString));
            System.out.println("        duck: " + isDuck(numString));
        } else {
            System.out.println("This number is not natural!");
        }

    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return !(number % 2 == 0);
    }
    public static boolean naturalNumber(int number) {
        return number > 0;
    }

    public static boolean isBuzz(int number, String numString) {
        return number % 7 == 0 || numString.charAt(numString.length() - 1) == '7';
    }

    public static boolean isDuck(String numString) {
        boolean duck = false;
        for (int i = 1; i <= numString.length() - 1; i++) {
            if (numString.charAt(i) == '0') {
                duck = true;
                break;
            }
        }
        return duck;
    }
}
