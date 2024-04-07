import java.util.Scanner;

public class Perform_Cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double sum = add(num1, num2);
        double difference = subtract(num1, num2);
        double product = multiply(num1, num2);
        double quotient = divide(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        System.out.println("The quotient of " + num1 + " and " + num2 + " is: " + quotient);
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}

