// constructor in java  



// circle class is declared with access specifier public .

public class Circle {
    private double radius;

    // Default constructor if parametrized constructor not used default value is 1.0 
    // constructor is defined using same name as class name . In this case class name is Circle .
   // In this case constructor ie special type of method is overloaded  ( compile time polymorphism. 
   // 
    public Circle() {
        radius = 1.0;
    }

    // Parameterized constructor

    public Circle(double r) {
        radius = r;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Create a Circle object using the default constructor
        Circle c1 = new Circle();
        System.out.println("Area of c1: " + c1.getArea());

        // Create a Circle object using the parameterized constructor
        Circle c2 = new Circle(2.0);
        System.out.println("Area of c2: " + c2.getArea());
    }
}

