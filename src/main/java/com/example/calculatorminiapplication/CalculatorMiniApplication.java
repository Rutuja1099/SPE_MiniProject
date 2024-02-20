package com.example.calculatorminiapplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication
public class CalculatorMiniApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("\nScientific Calculator Menu:");
        System.out.println("1. Square Root (√x)");
        System.out.println("2. Factorial (x!)");
        System.out.println("3. Natural Logarithm (ln(x))");
        System.out.println("4. Power Function (x^b)");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                double sqrtInput = scanner.nextDouble();
                System.out.println("Square Root of " + sqrtInput + " is: " + squareRoot(sqrtInput));
                break;

            case 2:
                System.out.print("Enter a number: ");
                int factorialInput = scanner.nextInt();
                System.out.println("Factorial of " + factorialInput + " is: " + factorial(factorialInput));
                break;

            case 3:
                System.out.print("Enter a number: ");
                double logInput = scanner.nextDouble();
                System.out.println("Natural Logarithm of " + logInput + " is: " + naturalLog(logInput));
                break;

            case 4:
                System.out.print("Enter base (x): ");
                double base = scanner.nextDouble();
                System.out.print("Enter exponent (b): ");
                double exponent = scanner.nextDouble();
                System.out.println(base + " raised to the power " + exponent + " is: " + power(base, exponent));
                break;

            case 5:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
        }

        scanner.close();
    }

    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static double naturalLog(double x) {
        return Math.log(x);
    }

    public static double power(double x, double b) {
        return Math.pow(x, b);
    }
}