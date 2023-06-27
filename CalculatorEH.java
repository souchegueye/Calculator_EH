package test2;
import java.util.Scanner;

public class CalculatorEH {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        CalculatorUI calculatorUI = new CalculatorUI(scanner, calculator);
        calculatorUI.run();

        scanner.close();
    }
}