

/* Super keyword 
 * super keyword is used to refer parent class when working with objects 
 *
 * used to call superclass constructor ,methods , field. 
 *
 */






class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound(); // Call the superclass makeSound() first
        System.out.println("Woof!");
    }
}

public class Super_Example {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Prints: Generic animal sound, Woof!
    }
}





/* 
 *
 *  In the below example we use super keyword to access super class constructor


class Animal {
    public Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    public Dog() {
        super(); // Call the default constructor of Animal
        System.out.println("Dog constructor");
    }

    public Dog(String name) {
        super(name); // Call a specific constructor of Animal that takes a name
        System.out.println("Dog constructor with name");
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); // Prints: Animal constructor, Dog constructor
        Dog dog2 = new Dog("Buddy"); // Prints: Animal constructor (with name), Dog constructor with name
    }
}



*/
