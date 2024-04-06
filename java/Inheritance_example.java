


// example of inheriance in java .

// The Animal class is the superclass or parent class, and it has a name variable and an eat() method.


class Animal {
    String name;

    public void eat() {
        System.out.println("Animal eats");
    }
}

// dog class is a subclass or animal class . 
// The Dog class inherits the name variable and the eat() method from the Animal class   

class Dog extends Animal{ 
    public void bark() {
        System.out.println("Dog barks");
    }
}

public class Inheritance_example {
    public static void main(String[] args) {

// object is created and assigned to the myDog variable.j

        Dog myDog = new Dog();
        myDog.name = "Rex";

// The eat() method inherited from the Animal class is called on the myDog object, and it prints "Animal eats".

        myDog.eat();
        myDog.bark();
    }
}

