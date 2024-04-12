


/* Polymorphism :  Polymorphism in Java is a fancy way of saying that one thing can behave in multiple ways.
 *
 * two types of polymorphism
 * 1. runtime polymorphism 
 * 2. compile-time Polymorphism
 *
 *
*/ 

// method overloading  : compile time polymorphism 
//
//   This happens when you have multiple methods in the same class with the same name, but different parameter lists. 
//
//   The compiler figures out which method to call based on the arguments you provide. 

class Car {

  public void accelerate() {
    System.out.println("Car is accelerating...");
  }

  // Overloaded method with an integer parameter for speed
  public void accelerate(int targetSpeed) {
    System.out.println("Car is accelerating to " + targetSpeed + " mph.");
  }

  // Overloaded method with a boolean parameter for cruise control
  public void accelerate(boolean useCruiseControl) {
    if (useCruiseControl) {
      System.out.println("Engaging cruise control and accelerating...");
    } else {
      System.out.println("Car is accelerating manually...");
    }
  }

  public static void main(String[] args) {
    Car myCar = new Car();

    // Call base accelerate method
    myCar.accelerate();

    // Call accelerate with target speed
    myCar.accelerate(60);

    // Call accelerate with cruise control
    myCar.accelerate(true);
  }
}


// method 
//
//
class Animal {
  public void makeSound() {
    System.out.println("Generic animal sound");
  }
}

class Dog extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Woof!");
  }
}

class Cat extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Meow!");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal animal1 = new Dog(); // Upcasting a Dog to an Animal
    Animal animal2 = new Cat();

    animal1.makeSound(); // Prints "Woof!" (dynamic method dispatch)
    animal2.makeSound(); // Prints "Meow!"
  }
}

