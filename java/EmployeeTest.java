


// Crud operations - Create , Retrieve , Update , delete
// Exception handling  
//
//
import java.util.Scanner;

class Student {
    String name;
    int age;
    String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

public class Student_Record {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];
        int choice, i, index;

        do {
            System.out.println("\nStudent Array CRUD Operations");
            System.out.println("1. Add Record");
            System.out.println("2. Display Records");
            System.out.println("3. Update Record");
            System.out.println("4. Delete Record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Student Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter Student Course: ");
                    scanner.nextLine(); // consume newline
                    String course = scanner.nextLine();
                    for (i = 0; i < students.length; i++) {
                        if (students[i] == null) {
                            students[i] = new Student(name, age, course);
                            break;
                        }
                    }
                    if (i == students.length) {
                        System.out.println("Array is full");
                    }
                    break;

                case 2:
                    System.out.println("\nStudent Records:");
                    for (i = 0; i < students.length; i++) {
                        if (students[i] != null) {
                            System.out.println((i + 1) + ". " + students[i].name + " - " + students[i].age + " - " + students[i].course);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter index of record to update: ");
                    index = scanner.nextInt();
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
                    students[index - 1] = new Student(name, age, course);
                    break;

                case 4:
                    System.out.print("Enter index of record to delete: ");
                    index = scanner.nextInt();
                    if (index < 1 || index > students.length || students[index - 1] == null) {
                        System.out.println("Invalid index");
                        break;
                    }
                    students[index - 1] = null;
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        scanner.close();
    }
}

