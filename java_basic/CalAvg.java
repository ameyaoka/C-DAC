import java.util.Scanner;

public class AvgCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers to calculate their average:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        double average = calculateAverage(num1, num2, num3);
        System.out.println("The average of the three numbers is: " + average);
    }

    public static double calculateAverage(int num1, int num2, int num3) {
        return (double) (num1 + num2 + num3) / 3;
    }
}

