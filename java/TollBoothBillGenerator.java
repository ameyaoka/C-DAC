/**
 * Represents a vehicle with its type, number of axles, and distance travelled.
 */
class Vehicle {
    private String vehicleType; // Type of the vehicle
    private int numberOfAxles; // Number of axles the vehicle has
    private double distanceTravelled; // Distance travelled by the vehicle

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleType, int numberOfAxles, double distanceTravelled) {
        this.vehicleType = vehicleType;
        this.numberOfAxles = numberOfAxles;
        this.distanceTravelled = distanceTravelled;
    }

    // Getter method for vehicle type
    public String getVehicleType() {
        return vehicleType;
    }

    // Getter method for number of axles
    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    // Getter method for distance travelled
    public double getDistanceTravelled() {
        return distanceTravelled;
    }
}

/**
 * Represents a toll booth with its distance travelled and toll fee calculation.
 */
class TollBooth {
    private double distanceTravelled; // Distance travelled by vehicles passing through the toll booth
    private double tollFee; // Toll fee calculation for vehicles passing through the toll booth

    // Constructor to initialize toll booth details
    public TollBooth(double distanceTravelled, double tollFee) {
        this.distanceTravelled = distanceTravelled;
        this.tollFee = tollFee;
    }

    // Getter method for distance travelled
    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    // Getter method for toll fee
    public double getTollFee() {
        return tollFee;
    }
}

/**
 * Represents a Toll Booth Bill Generator which calculates toll fee for each vehicle and generates bill.
 */
public class TollBoothBillGenerator {

    // Method to calculate toll fee based on number of axles and distance travelled
    public static double calculateTollFee(int numberOfAxles, double distanceTravelled) {
        // Logic to calculate toll fee based on number of axles and distance travelled
        // Implement your toll fee calculation logic here
        return 0.0; // Placeholder return value, replace with actual calculation
    }

    // Method to generate bill for each vehicle
    public static void generateBill(Vehicle vehicle, TollBooth tollBooth) {
        // Calculate toll fee for the vehicle based on its number of axles and distance travelled
        double tollFee = calculateTollFee(vehicle.getNumberOfAxles(), vehicle.getDistanceTravelled());
        
        // Generate bill for the vehicle
        System.out.println("Vehicle Type: " + vehicle.getVehicleType());
        System.out.println("Number of Axles: " + vehicle.getNumberOfAxles());
        System.out.println("Distance Travelled: " + vehicle.getDistanceTravelled());
        System.out.println("Toll Fee: " + tollFee);
    }

    // Main method to test the Toll Booth Bill Generator
    public static void main(String[] args) {
        // Example usage:
        // Create a vehicle
        Vehicle vehicle1 = new Vehicle("Car", 2, 50.0); // Example: Car with 2 axles travelled 50.0 miles
        
        // Create a toll booth
        TollBooth tollBooth1 = new TollBooth(50.0, 0.0); // Example: Toll booth with 50.0 miles travelled and toll fee of 0.0
        
        // Generate bill for the vehicle passing through the toll booth
        generateBill(vehicle1, tollBooth1);
    }
}

