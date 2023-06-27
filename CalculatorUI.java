package test2;

import java.util.Scanner;

public class CalculatorUI {

    private Scanner scanner;
    private Calculator calculator;

    public CalculatorUI(Scanner scanner, Calculator calculator) {
        this.scanner = scanner;
        this.calculator = calculator;
    }

    public void run() {
    	
        while (true) {
            try {
                System.out.println("Choose an operation:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");

                int choice = scanner.nextInt();

                if (choice == 1) {
                    performAddition();
                } else if (choice == 2) {
                    performSubtraction();
                } else if (choice == 3) {
                    performMultiplication();
                } else if (choice == 4) {
                    performDivision();
                } else if (choice == 5) {
                    System.out.println("Thank you for using The Gueye Calculator Program. Goodbye!");
                    break;
                } else {
                    System.out.println("Invalid choice. Try again!");
                }

                System.out.println();
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please try again.");
                scanner.nextLine();
            }
        }
    }

    private void performAddition() {
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int result = calculator.addition(num1, num2);
        System.out.println("Result: " + result);
    }

    private void performSubtraction() {
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int result = calculator.subtraction(num1, num2);
        System.out.println("Result: " + result);
    }

    private void performMultiplication() {
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int result = calculator.multiplication(num1, num2);
        System.out.println("Result: " + result);
    }

    private void performDivision() {
        System.out.println("Enter the dividend:");
        int dividend = scanner.nextInt();
        System.out.println("Enter the divisor:");
        int divisor = scanner.nextInt();

        if (divisor != 0) {
            int result = calculator.division(dividend, divisor);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero is not possible.");
        }
    }
}