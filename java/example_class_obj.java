

// class is a blue print 
// in this example we have a class car 
//  you are essentially creating a new data type. 

public class Car {
    String color; // Declaring a variable to store the color of the car
    String make; // Declaring a variable to store the make of the car
    String model; // Declaring a variable to store the model of the car

    // Method to start the car
    // A method in Java is similar to a function but is associated with an instance of a class (object).
   //  public is access specifier   
   //  method can be accessed from any other class in the application
// void is the return type of the method. In this case, void means that the method does not return any value. 


    public void start() {
        System.out.println("The car has started."); // Output message when the car starts
    }

    // Method to accelerate the car
    public void accelerate() {
        System.out.println("The car is accelerating."); // Output message when the car accelerates
    }

    // Method to stop the car
    public void stop() {
        System.out.println("The car has stopped."); // Output message when the car stops
    }

    // Main method where the program execution starts ( it is an entry point for program. 
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an object of the Car class

        myCar.color = "Red"; // Setting the color of the car object
        myCar.make = "Toyota"; // Setting the make of the car object
        myCar.model = "Camry"; // Setting the model of the car object

        // Displaying the details of the car
        System.out.println("My " + myCar.color + " " + myCar.make + " " + myCar.model);

        myCar.start(); // Calling the start method to start the car
        myCar.accelerate(); // Calling the accelerate method to accelerate the car
        myCar.stop(); // Calling the stop method to stop the car
    }
}

