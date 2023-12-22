package Assignment_2;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        double value1, value2, result;
        int choice;

        System.out.print("Enter the first value: ");
        value1 = scanner.nextDouble();

        System.out.print("Enter the second value: ");
        value2 = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                result = value1 + value2;
                break;
            case 2:
                result = value1 - value2;
                break;
            case 3:
                result = value1 * value2;
                break;
            case 4:

            	if (value2 != 0) {
                    result = value1 / value2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; 
                }
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 4.");
                return; 
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
