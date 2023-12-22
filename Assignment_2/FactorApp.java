package Assignment_2;

import java.util.Scanner;

public class FactorApp {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a non-negative integer: ");
            int n = scanner.nextInt();

            long result = FactorCal.calculateFactorial(n);
            System.out.println("The factorial of " + n + " is: " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}