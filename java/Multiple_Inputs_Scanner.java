
// read multiple inputs from user




import java.util.Scanner;

public class Multiple_Inputs_Scanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your first name: ");
    String firstName = scanner.nextLine();

    System.out.print("Enter your last name: ");
    String lastName = scanner.nextLine();

    System.out.print("Enter your age: ");
    String age = scanner.nextLine();

    System.out.println("Your name is: " + firstName + " " + lastName);
    System.out.println("Your age is: " + age);

    scanner.close();
  }
}

