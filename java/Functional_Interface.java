




/*
Functional interfaces are interfaces that contain exactly one abstract method.

*  They can have any number of default, static methods but can contain only one abstract method.
*
* Java provides predefined functional interfaces in the java.util.function package, such as Function, Consumer, Predicate, and Supplie

*/ 



@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}

public class Main {
    public static void main(String[] args) {
        // Using a lambda expression to implement the abstract method of the functional interface
        MyFunctionalInterface functionalInterface = () -> System.out.println("Executing myMethod");
        functionalInterface.myMethod();
    }
}




