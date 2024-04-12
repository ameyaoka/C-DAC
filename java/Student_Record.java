


// Crud operations - Create , Retrieve , Update , delete
// Exception handling  
// deleting the object is job of garbage collector . 
// you can call garbage collector by setting obj to null ; 
//
import java.util.Scanner;

// Define a Student class with name, age, and course attributes
class Student {
    String name;
    int age;
    String course;

    // Constructor to initialize the Student object with given name, age, and course
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

// Define the main class for the Student Array CRUD operations
public class Student_Record {

    // Main method to run the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create an array of Student objects with length 5
        Student[] students = new Student[5];

        // Variables to store user choice and other temporary values
        int choice, i, index;
        String name, course;
        int age;

        // Display the main menu and get user choice
        do {
            System.out.println("\nStudent Array CRUD Operations");
            System.out.println("1. Add Record");
            System.out.println("2. Display Records");
            System.out.println("3. Update Record");
            System.out.println("4. Delete Record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Switch statement to handle different user choices
            switch (choice) {
                case 1:
                    // Add Record option
                    System.out.print("Enter Student Name: ");
                    name = scanner.next();
                    System.out.print("Enter Student Age: ");
                    age = scanner.nextInt();
                    System.out.print("Enter Student Course: ");
                    scanner.nextLine(); // consume newline
                    course = scanner.nextLine();

                    // Loop through the array to find an empty slot
                    for (i = 0; i < students.length; i++) {
                        if (students[i] == null) {
                            // Create a new Student object and add it to the array
                            students[i] = new Student(name, age, course);
                            break;
                        }
                    }

                    // If the array is full, print a message
                    if (i == students.length) {
                        System.out.println("Array is full");
                    }
                    break;

                case 2:
                    // Display Records option
                    System.out.println("\nStudent Records:");
                    for (i = 0; i < students.length; i++) {
                        if (students[i] != null) {
                            // Print the details of each non-null Student object
                            System.out.println((i + 1) + ". " + students[i].name + " - " + students[i].age + " - " + students[i].course);
                        }
                    }
                    break;

                case 3:
                    // Update Record option
                    System.out.print("Enter index of record to update: ");
                    index = scanner.nextInt();

                    // Check if the index is valid
                    if (index < 1 || index > students.length || students[index - 1] == null) {
                        System.out.println("Invalid index");
                        break;
                    }

                    System.out.print("Enter new Student Name: ");
                    name = scanner.next();
                    System.out.print("Enter new Student Age: ");
                    age = scanner.nextInt();
                    System.out.print("Enter new Student Course: ");
                    scanner.nextLine(); // consume newline
                    course = scanner.nextLine();

                    // Create a new Student object with updated values and replace the old one
                    students[index - 1] = new Student(name, age, course);
                    break;

                case 4:
                    // Delete Record option
                    System.out.print("Enter index of record to delete: ");
                    index = scanner.nextInt();

                    // Check if the index is valid
                    if (index < 1 || index > students.length || students[index - 1] == null) {
                        System.out.println("Invalid index");
                        break;
                    }

                    // Set the Student object at the given index to null to delete it
                    students[index - 1] = null;
                    break;

                case 5:
                    // Exit option
                    System.out.println("Exiting...");
                    break;

                default:
                    // Invalid choice option
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        // Close the Scanner object
        scanner.close();
    }
}

