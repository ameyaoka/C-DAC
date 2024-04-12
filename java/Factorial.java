


import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("enter a non-zero number ");
        } else {
            long factorial = calculateFactorial(n);
            System.out.println("The factorial of " + n + " is: " + factorial);
        }
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

