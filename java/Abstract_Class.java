// Abstract class
/*
- An abstract class cannot be instantiated directly, but it can be subclassed by another class.

- An abstract class may have both abstract and non-abstract methods.

- Abstract methods are declared without an implementation, using the "abstract" keyword. 

- An abstract class can have constructors, data members, and methods, including abstract methods, method bodies, and static methods.



- 
*/
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();

    // Regular method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Subclass class 
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method to calculate area for a circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method to calculate area for a rectangle
    public double calculateArea() {
        return length * width;
    }
}

	  }


// Main class
public class Abstract_Class {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        circle.display();
        rectangle.display();
    }
}



