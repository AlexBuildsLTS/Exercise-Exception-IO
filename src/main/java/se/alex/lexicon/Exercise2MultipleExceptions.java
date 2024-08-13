package se.alex.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2MultipleExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.print("Enter a divisor: ");
            int divisor = scanner.nextInt();

            int result = number / divisor;  // May throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter an integer.");
        } finally {
            System.out.println("Operation completed.");
            scanner.close();  // Closing the scanner
        }
    }
}
