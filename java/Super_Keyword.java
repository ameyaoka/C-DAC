// Define the parent class with a method 
class Parent {
  // This is the parent class's method
  public void myMethod() {
    // Print a message to the console
    System.out.println("Parent's method");
  }
}

// Define the child class that extends the parent class
class Child extends Parent {
  // This is the child class's method with the same name as the parent class's method
  public void myMethod() {
    // Call the parent class's method using the super keyword
    super.myMethod();

    // Print a message to the console
    System.out.println("Child's method");
  }
}

// Define the main class
public class Super_Keyword  {
  // Define the main method
  public static void main(String[] args) {
    // Create an instance of the child class
    Child obj = new Child();

    // Call the child class's method, which in turn calls the parent class's method
    obj.myMethod();
  }
}

