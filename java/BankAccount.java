// scanner class class to receive input from user.
import java.util.Scanner ;

// create public class BankAccount

public class BankAccount {
    // initialize variable with final to make it immutable 
    // represents total accounts that can be created
    private static final int MAX_ACCOUNTS = 100;

   //  Initialize array to store created accounts.

    private static Account[] accounts = new Account[MAX_ACCOUNTS];

// entry point for our program 

    public static void main(String[] args) {

// creating a scanner object 
        Scanner scanner = new Scanner(System.in);
// menu for our program 
//

        while (true) {
	    // printing options for out menu 
	    
            System.out.println("\nBank Account Management System");
            System.out.println("-------------------------------");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money into an account");
            System.out.println("3. Withdraw money from an account");
            System.out.println("4. Display the account balance");
            System.out.println("5. Display the account holder's information");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
	    System.out.println("-------------------------------");

            int choice = scanner.nextInt();



            if (choice == 1) {
	// execute method CreateAccount 
                createAccount(scanner);
            } else if (choice == 2) {
		    
	// execute method DepositMoney 
                depositMoney(scanner);

            } else if (choice == 3) {
	// execute method withdrawMoney  
                withdrawMoney(scanner);
            } else if (choice == 4) {
		    
	// execute method display Balance  
                displayBalance(scanner);
            } else if (choice == 5) {
	// 
	// execute method displayHolderInfo  
                displayHolderInfo(scanner);
            } else if (choice == 6) {
		// break closes the menu driven program
                break;

            } else {
	//  if all user inputs any number outside scope print error 
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

//	methods are declared as private because private methods are only accessible in the class 
//
//	static methods are  methods  associated  with class rather instance of a class 
//
//	createAccount() method in the provided program is a void method that creates a new bank account with the given name and account number, but it does not return any value to the caller .
//
//

    private static void createAccount(Scanner scanner) {
        for (int i = 0; i < MAX_ACCOUNTS; i++) {
            if (accounts[i] == null) {
                System.out.print("Enter account holder's name: ");
                String name = scanner.next();
                accounts[i] = new Account(name);
                System.out.println("Account created successfully with account number " + i);
                break;
            }
        }
    }

    private static void depositMoney(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        if (accounts[accountNumber] != null) {
            System.out.print("Enter amount to be deposited: ");
            double amount = scanner.nextDouble();
            accounts[accountNumber].deposit(amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        if (accounts[accountNumber] != null) {
            System.out.print("Enter amount to be withdrawn: ");
            double amount = scanner.nextDouble();
            accounts[accountNumber].withdraw(amount);
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void displayBalance(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        if (accounts[accountNumber] != null) {
            System.out.println("Account balance: " + accounts[accountNumber].getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void displayHolderInfo(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        if (accounts[accountNumber] != null) {
            System.out.println("Account holder's name: " + accounts[accountNumber].getName());
            System.out.println("Account balance: " + accounts[accountNumber].getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}

class Account {
    private String name;
    private double balance;

    public Account(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

