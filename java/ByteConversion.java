public class ByteConversion {
    public static void main(String[] args) {
        Byte byteInstance = 100;

        // Convert Byte instance to byte
        byte byteValue = byteInstance.byteValue();
        System.out.println("Byte instance to byte: " + byteValue);

        // Convert Byte instance to short
        short shortValue = byteInstance.shortValue();
        System.out.println("Byte instance to short: " + shortValue);

        // Convert Byte instance to int
        int intValue = byteInstance.intValue();
        System.out.println("Byte instance to int: " + intValue);

        // Convert Byte instance to long
        long longValue = byteInstance.longValue();
        System.out.println("Byte instance to long: " + longValue);

        // Convert Byte instance to float
        float floatValue = byteInstance.floatValue();
        System.out.println("Byte instance to float: " + floatValue);

        // Convert Byte instance to double
        double doubleValue = byteInstance.doubleValue();
        System.out.println("Byte instance to double: " + doubleValue);
    }
}

