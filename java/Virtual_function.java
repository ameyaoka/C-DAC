// In Java, virtual functions are not explicitly defined using a keyword such as 'virtual' as in C++. 
//
// Instead,   all non-private instance methods are considered virtual by default, except for final, static, and private methods. 
//   
//
// 


// 

class Animal {
    public void speak() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("The dog barks");
    }
}

public class Virtual_function {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.speak();
    }
}




