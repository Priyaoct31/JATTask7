package jatTask7;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            // Reading integer from user
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // division of two numbers
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handling division by zero
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            scanner.close();
        }
    }

	}


