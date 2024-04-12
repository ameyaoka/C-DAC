
// Abstract class

/*
 * Abstract class is a class 
 * It cannot be instantiated directly .
 * It is used as a base class for other classes .
 * It can contain methods  1. abstract 2. concrete 
 * 			 
 * Abstract method : 
 *
 * Abstract methods are methods without a body 
 * They are denoted by abstract keyword .
 * Abstract methods can be declared with any access modifier
 * By defining this method as abstract, the Shape class specifies what behavior subclasses must implement, but it does not provide an implementation itself.

*/ 


// Define an abstract class representing a shape
abstract class Shape {
    // Abstract method to calculate the area of the shape
    // This method must be implemented by concrete subclasses
    abstract double calculateArea();

    // Concrete method to display a message about the shape
    void displayMessage() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass representing a rectangle
class Rectangle extends Shape {
    // Fields to store the dimensions of the rectangle
    private double length;
    private double width;

    // Constructor to initialize the length and width of the rectangle
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the abstract method to calculate the area of the rectangle
    double calculateArea() {
        return length * width;
    }
}

// Concrete subclass representing a circle
class Circle extends Shape {
    // Field to store the radius of the circle
    private double radius;

    // Constructor to initialize the radius of the circle
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method to calculate the area of the circle
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}


// Main class to demonstrate the usage of abstract class and subclasses
public class AbstractClassExample {
    public static void main(String[] args) {
        // Create an object of Rectangle class
        Rectangle rectangle = new Rectangle(5, 3);
        // Call the calculateArea method of Rectangle class
        double rectangleArea = rectangle.calculateArea();
        // Print the calculated area of the rectangle
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Create an object of Circle class
        Circle circle = new Circle(2);
        // Call the calculateArea method of Circle class
        double circleArea = circle.calculateArea();
        // Print the calculated area of the circle
        System.out.println("Area of Circle: " + circleArea);
    }
}

