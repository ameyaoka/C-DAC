

/* Virtual functions 
 * 
 * There is no keyword virtual in java 
 *
 * all non-private instance methods are virtual by default.
 *
 * virtual functions are closely related to method overriding .
 *
 * Virtual functions in Java must have the same name and signature in both the parent and child classes.
 *


*/

// Define the Animal class with a method makeSound
class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Define the Dog class, which extends Animal
class Dog extends Animal {
    // Override the makeSound method to provide a specific implementation for Dog
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Define the Cat class, which extends Animal
class Cat extends Animal {
    // Override the makeSound method to provide a specific implementation for Cat
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class to demonstrate dynamic method dispatch
public class VirtualFunctions {
    public static void main(String[] args) {
        // Upcasting a Dog to an Animal
        Animal animal1 = new Dog();
        // Upcasting a Cat to an Animal
        Animal animal2 = new Cat();

        // Calls the overridden makeSound method for Dog
        animal1.makeSound(); // Prints "Woof!" (dynamic method dispatch)
        // Calls the overridden makeSound method for Cat
        animal2.makeSound(); // Prints "Meow!"
    }
}

