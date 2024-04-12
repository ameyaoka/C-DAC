public interface InterfaceA {
    int x = 4;
}

public interface InterfaceB {
    int x = 4;
}

public class Testing implements InterfaceA, InterfaceB {
    public static void main(String[] args) {
        System.out.println(x); // Error: reference to x is ambiguous
    }
}

