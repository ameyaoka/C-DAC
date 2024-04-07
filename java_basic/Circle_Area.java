import java.util.Scanner;

public class Circle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle to calculate its area:");
        double radius = scanner.nextDouble();

        double area = calculateCircleArea(radius);
        System.out.println("The area of the circle with a radius of " + radius + " is: " + area);
    }

    public static double calculateCircleArea(double radius) {
        final double PI = 3.14159;
        return PI * radius * radius;
    }
}

