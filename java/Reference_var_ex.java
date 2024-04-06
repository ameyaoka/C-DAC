// reference variable 




class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void printDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class Reference_var_ex {
    public static void main(String[] args) {
        // Declare a reference variable of type Car
        Car myCar;

        // Create a new Car object and assign its reference to myCar
        myCar = new Car("Toyota", 2021);

        // Use the reference variable to access and manipulate the object's properties and methods
        myCar.printDetails(); // Output: Brand: Toyota, Year: 2021
    }
}

