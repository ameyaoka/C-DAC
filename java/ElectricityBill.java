// 3. Electricity Bill Calculation
// Create a class named "ElectricityBill" that has the following instance variables:
// a. customerName (String)
// b. unitsConsumed (double)
// c. billAmount (double)
// Create a constructor that initializes the customerName and unitsConsumed instance variables.

// Define a method named "calculateBillAmount" that calculates the bill amount based on the number of units consumed. The formula for calculating the bill amount is:
// a. For the first 100 units: Rs. 5 per unit
// b. For the next 200 units: Rs. 7 per unit
// c. For the remaining units: Rs. 10 per unit
// Implement the "calculateBillAmount" method in the "ElectricityBill" class.

// Define a main method that creates an object of the "ElectricityBill" class and sets the customerName and unitsConsumed instance variables. Then, call the
// "calculateBillAmount" method to calculate the bill amount and display the customerName, unitsConsumed, and billAmount.

public class ElectricityBill {
    // Instance variables
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    // Constructor
    public ElectricityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    // Method to calculate bill amount
    public void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = (100 * 5) + (unitsConsumed - 100) * 7;
        } else {
            billAmount = (100 * 5) + (200 * 7) + (unitsConsumed - 300) * 10;
        }
    }

    // Getter method for customerName
    public String getCustomerName() {
        return customerName;
    }

    // Getter method for unitsConsumed
    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    // Getter method for billAmount
    public double getBillAmount() {
        return billAmount;
    }

    public static void main(String[] args) {
        // Create an ElectricityBill object
        ElectricityBill bill = new ElectricityBill("John Doe", 250);

        // Calculate the bill amount
        bill.calculateBillAmount();

        // Display customer details and bill amount
        System.out.println("Customer Name: " + bill.getCustomerName());
        System.out.println("Units Consumed: " + bill.getUnitsConsumed());
        System.out.println("Bill Amount: Rs. " + bill.getBillAmount());
    }
}
