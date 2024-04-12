import java.util.Scanner;

// Define a class for BMI calculator
class BMICalculator {
    // Declare private fields to store height and weight
    private double height;
    private double weight;

    // Constructor to initialize height and weight fields
    public BMICalculator(double height, double weight) {
        this.height = height; // Assign the provided height to the height field
        this.weight = weight; // Assign the provided weight to the weight field
    }

    // Getter method to retrieve the height
    public double getHeight() {
        return height; // Return the value of the height field
    }

    // Setter method to set the height
    public void setHeight(double height) {
        this.height = height; // Set the value of the height field to the provided value
    }

    // Getter method to retrieve the weight
    public double getWeight() {
        return weight; // Return the value of the weight field
    }

    // Setter method to set the weight
    public void setWeight(double weight) {
        this.weight = weight; // Set the value of the weight field to the provided value
    }

    // Method to calculate BMI
    public double calculateBMI() {
        // Calculate BMI using the formula: weight / (height * height)
        return weight / (height * height); // Return the calculated BMI
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        // Prompt user to input height and weight
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble(); // Read user input for height

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble(); // Read user input for weight

        // Create object of BMICalculator class with provided height and weight
        BMICalculator bmiCalculator = new BMICalculator(height, weight);

        // Calculate BMI using the calculateBMI() method
        double bmi = bmiCalculator.calculateBMI();

        // Print calculated BMI
        System.out.println("Your BMI is: " + bmi);

        scanner.close(); // Close the Scanner object to release resources
    }
}

