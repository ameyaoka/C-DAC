




public class LongOperations {
    public static void main(String[] args) {
        long num1 = 1234567890123L;
        long num2 = 9876543210987L;

        System.out.println("Minimum number: " + Long.min(num1, num2));
        System.out.println("Maximum number: " + Long.max(num1, num2));

        long sum = addLongNumbers(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    public static long addLongNumbers(long num1, long num2) {
        return num1 + num2;
    }
}

