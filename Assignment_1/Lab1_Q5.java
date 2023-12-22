package Assignment_1;
import java.util.Scanner;
public class Lab1_Q5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the first number : ");
		int number1 = scanner.nextInt();

		System.out.print("Please enter the second number : ");
		int number2 = scanner.nextInt();

		int tripledNumber1 = number1 * 3;
		int doubleNumber2 = number2 * 2;

		boolean isMultiple = tripledNumber1 % doubleNumber2 == 0;

		if (isMultiple) {
			System.out.println(tripledNumber1 + " is a multiple of " + doubleNumber2);
		} else {
			System.out.println(tripledNumber1 + " is a multiple of " + doubleNumber2);
		}
		scanner.close();
	}
}
