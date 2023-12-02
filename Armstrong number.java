import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number to check
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check and print if the number is Armstrong or not
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    // Function to check if a number is an Armstrong number
    private static boolean isArmstrongNumber(int num) {
        int originalNumber, remainder, result = 0, n = 0;

        // Assign the number to a temporary variable
        originalNumber = num;

        // Count the number of digits in the number
        for (; originalNumber != 0; originalNumber /= 10, ++n);

        // Assign the number to a temporary variable again
        originalNumber = num;

        // Calculate the sum of each digit raised to the power of the number of digits
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Check if the result is equal to the original number
        return result == num;
    }
}

