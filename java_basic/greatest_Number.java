import java.util.Scanner;

public class Greatest_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble();

        double greatest = findGreatest(num1, num2, num3);
        System.out.println("The greatest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + greatest);
    }

    public static double findGreatest(double num1, double num2, double num3) {
        double greatest = num1;
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        return greatest;
    }
}

