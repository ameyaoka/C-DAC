



class Parent1 {
    void fun() {
        System.out.println("Parent1");
    }
}

class Parent2 {
    void fun() {
        System.out.println("Parent2");
    }
}

class Child extends Parent1 , Parent2 {
    // This class will give a compile-time error due to the Diamond Problem
}

public class Inheritance_mult_error {
    public static void main(String[] args) {
        Child c = new Child(); c.fun();
    }
}

