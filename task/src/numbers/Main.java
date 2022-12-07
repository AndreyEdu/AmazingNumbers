package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a natural number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numString = Integer.toString(number);


        if (naturalNumber(number)) {
            if (checkOddOrEven(number)) {
                System.out.println("This number is Even.");
            } else {
                System.out.println("This number is Odd.");
            }
            if (!divisibleBy7(number) && !endsBy7(numString)) {
                System.out.printf("It is not a Buzz number.\n" +
                        "Explanation:\n" +
                        number + " is neither divisible by 7 nor does it end with 7.");
            } else if (divisibleBy7(number) && endsBy7(numString)) {
                System.out.printf("It is a Buzz number.\n" +
                        "Explanation:\n" +
                        number + " is divisible by 7 and ends with 7.");
            } else if (divisibleBy7(number)) {
                System.out.printf("It is a Buzz number.\n" +
                        "Explanation:\n" +
                        number + " is divisible by 7.");
            } else if (endsBy7(numString)) {
                System.out.printf("It is a Buzz number.\n" +
                        "Explanation:\n" +
                        number + " ends with 7.");
            }
        } else {
            System.out.println("This number is not natural!");
        }

    }

    public static boolean checkOddOrEven(int number) {
        return number % 2 == 0;
    }

    public static boolean naturalNumber(int number) {
        return number > 0;
    }
    public static boolean divisibleBy7(int number) {
        return number % 7 == 0;
    }

    public static boolean endsBy7(String numString) {
        return numString.charAt(numString.length() - 1) == '7';
    }
}
