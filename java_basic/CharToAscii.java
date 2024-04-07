import java.util.Scanner;

public class CharToAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character to convert to ASCII code:");
        char ch = scanner.next().charAt(0);
        int asciiCode = (int) ch;
        System.out.println("ASCII code of " + ch + " is: " + asciiCode);
        System.out.println("Enter an ASCII code to convert to a character:");
        int asciiNum = scanner.nextInt();
        char ch2 = (char) asciiNum;
        System.out.println("Character for ASCII code " + asciiNum + " is: " + ch2);
    }
}

