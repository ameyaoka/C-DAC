

/* 
- getter and setter is used  as accessor and mutator 

- used to protect data and make your code more secure .

- They are used to retrieve and update the value of a private variable in a class.

- setter is used to set value of the private variable .

- getter is used to fetch value of the user ( print value in this example )

- . By making instance variables private, you can prevent direct access to them from outside the class, and instead provide controlled access through getter and setter methods.

-  Getters and setters allow you to validate the given value in the setter before actually setting the value. 

*/ 




import java.util.Scanner;

public class Getter_Setter {
    // Declare a private variable to hold the person's age
    private int age;

    // Getter method to retrieve the value of the age variable
    public int getAge() {
        // Return the value of the age variable
        return age;
    }

    // Setter method to update the value of the age variable
    public void setAge(int age) {
        // Check if the input is valid
        if (age >= 0) {
            // If the input is valid, update the value of the age variable
            this.age = age;
        } else {
            // If the input is invalid, print an error message
            System.err.println("Error: Invalid age input");
        }
    }

    // Main method to take user input and test the Getter_Setter class
    public static void main(String[] args) {
        // Create a new Getter_Setter object
        Getter_Setter person = new Getter_Setter();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the age
        System.out.print("Enter the age: ");
        String input = scanner.nextLine();

        // Try to parse the user input as an integer
        try {
            int age = Integer.parseInt(input);
            // Set the age using the setter method
            person.setAge(age);
        } catch (NumberFormatException e) {
            // If the input is not a valid integer, print an error message
            System.err.println("Error: Invalid input");
        }

        // Get the age of the person using the getter method
        int age = person.getAge();

        // Print the age of the person
        System.out.println("Age: " + age);

        // Close the Scanner object
        scanner.close();
    }
}

