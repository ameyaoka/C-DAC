import java.util.Scanner;

public class Number_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the pattern:");
        int rows = scanner.nextInt();

        printNumberTriangle(rows);
    }

    public static void printNumberTriangle(int rows) {
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}

