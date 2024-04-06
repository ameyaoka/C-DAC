


// Polymorphism in java .
// 2 types of polymorphism in java 

// 1. compile-time polymorphism , 2. run-time polymorphism .

// below is the example of compile time polymorphism .
// It is also known as method overloading .

//  achieved using same name but different signatures ( parameters )
// Compile-time polymorphism is useful for creating methods that perform similar operations but with different types of data. 

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum of 5 and 10 (integers): " + calculator.add(5, 10));
        System.out.println("Sum of 2.5 and 3.7 (doubles): " + calculator.add(2.5, 3.7));
    }
}

