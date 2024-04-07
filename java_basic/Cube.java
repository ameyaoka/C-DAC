import java.util.Scanner;

public class Cube{ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer to generate the cube of the numbers up to it:");
        int num = scanner.nextInt();

        generateCubes(num);
    }

    public static void generateCubes(int num) {
        for (int i = 1; i <= num; i++) {
            int cube = i * i * i;
            System.out.println("The cube of " + i + " is: " + cube);
        }
    }
}

