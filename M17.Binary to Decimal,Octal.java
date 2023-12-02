import java.util.Scanner;

public class BinaryToDecimalOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input binary number
        System.out.print("Enter the binary number: ");
        String binaryNumber = scanner.nextLine();

        // Convert binary to decimal
        int decimalNumber = binaryToDecimal(binaryNumber);

        // Convert decimal to octal
        String octalNumber = decimalToOctal(decimalNumber);

        // Display the results
        System.out.println("Decimal Number: " + decimalNumber);
        System.out.println("Octal: " + octalNumber);

        scanner.close();
    }

    // Function to convert binary to decimal
    static int binaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return decimal;
    }

    // Function to convert decimal to octal
    static String decimalToOctal(int decimal) {
        String octal = Integer.toOctalString(decimal);
        return octal;
    }
}

