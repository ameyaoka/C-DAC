




public class BooleanOperations {
    public static void main(String[] args) {
        // a. boolean value into String
        boolean booleanValue = true;
        String booleanValueAsString = String.valueOf(booleanValue);
        System.out.println("a. boolean value into String: " + booleanValueAsString);

        // b. boolean value into Boolean instance
        Boolean booleanInstance = Boolean.valueOf(booleanValue);
        System.out.println("b. boolean value into Boolean instance: " + booleanInstance);

        // c. String value into boolean value
        String stringValue = "true";
        boolean stringValueAsBoolean = Boolean.parseBoolean(stringValue);
        System.out.println("c. String value into boolean value: " + stringValueAsBoolean);

        // d. String value into Boolean instance
        Boolean stringValueAsBooleanInstance = Boolean.valueOf(stringValue);
        System.out.println("d. String value into Boolean instance: " + stringValueAsBooleanInstance);
    }
}

