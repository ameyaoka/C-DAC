


// we have a superclass Animal with a method move(), and a subclass Dog that overrides the move() method with its own implementation


//a subclass overrides a method with the same signature as that in its superclass. 








class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("Dogs can walk and run");
    }
}

public class TestDog {
    public static void main(String[] args) {
        Animal a = new Animal(); // Animal reference and object
        Animal b = new Dog(); // Animal reference but Dog object

        a.move(); // runs the method in Animal class
        b.move(); // runs the method in Dog class
    }
}

