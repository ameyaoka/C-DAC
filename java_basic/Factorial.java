import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int num = scanner.nextInt();
        long result = factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}

