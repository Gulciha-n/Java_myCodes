package Assignment_2;
import java.util.Scanner;

public class SumCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int num = scanner.nextInt();

        int counter = 0;
        int sum = 0;

        do {
            System.out.print("Enter value " + (counter + 1) + ": ");
            int value = scanner.nextInt();
            sum += value;
            counter++;
        } while (counter < num);

        System.out.println("Sum of entered values: " + sum);

        scanner.close();
    }
}

