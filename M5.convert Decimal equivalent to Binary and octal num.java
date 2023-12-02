import java.util.Scanner;

public class DecimalToBinaryOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int decimalNumber = scanner.nextInt();

        // Convert to Binary
        String binaryNumber = convertToBinary(decimalNumber);

        // Convert to Octal
        String octalNumber = convertToOctal(decimalNumber);

        // Display the results
        System.out.println("Binary Number = " + binaryNumber);
        System.out.println("Octal = " + octalNumber);

        scanner.close();
    }

    // Helper method to convert decimal to binary
    private static String convertToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    // Helper method to convert decimal to octal
    private static String convertToOctal(int decimalNumber) {
        return Integer.toOctalString(decimalNumber);
    }
}
