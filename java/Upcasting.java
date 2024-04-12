// example of upcasting 
//



/* 
 *upcasting -  Assigning a derived class object to a base class reference variable.
 * 
 * Parent p = new Child();
 *
 *  a reference variable of the parent class is assigned to an object of the child class.
 *
 * method called is based on the actual type of the object, not the reference type.
 *
 * So, while the reference type limits direct access to only the superclass's methods and variables, dynamic dispatch ensures that the correct overridden method from the subclass is executed based on the actual object type, allowing for polymorphic behavior in Java.
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
        System.out.println("Woof!");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        animal.makeSound(); // Prints "Woof!" (dynamic dispatch)
    }
}



