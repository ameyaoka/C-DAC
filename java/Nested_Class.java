


// nested class
//
// Inner class / nested classes are classed defined within another class 
//
// provides a way to group classes together for better organization and encapsulation and access control .
//
// 1. static nested class .
// 2.  non-static nested class .
//
//
//
//


class OuterClass {
    public static int outerField = 10;

    public static class StaticNestedClass {
        public void accessOuterField() {
            System.out.println("Outer field value: " + outerField);
        }
    }

    public static void main(String[] args) {
        OuterClass.StaticNestedClass inner = new OuterClass.StaticNestedClass();
        inner.accessOuterField(); // No outer class object needed
    }
}



class OuterClass {
    public int outerField = 10;

    public class InnerClass {
        public void accessOuterField() {
            System.out.println("Outer field value: " + this.outerField); // Access using 'this'
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass(); // Need outer class object first
        inner.accessOuterField();
    }
}

