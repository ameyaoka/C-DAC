// This interface defines functionalities related to mathematical operations
interface MathUtils {

  // This static method performs addition of two double numbers
  // This method is declared as static. Static methods belong to the interface itself, not to instances of classes implementing the interface.
  static double add(double a, double b) {
    return a + b;
  }

  // This static method performs subtraction of two double numbers
  static double subtract(double a, double b) {
    return a - b;
  }
}

public class Main {
  public static void main(String[] args) {
    // Create a variable to store the result
    double result;

    // Call the static method 'add' from the MathUtils interface directly
    // without needing an object instance since it's static

    result = MathUtils.add(5, 3);

    // Print the result of the addition
    System.out.println(result); // Output: 8.0
  }
}



