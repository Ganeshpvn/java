import java.util.Scanner;

public class NthOddNumberAfter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Starting odd number
        System.out.print("Enter the starting odd number: ");
        int startingOddNumber = scanner.nextInt();

        // Input: Value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Find and print the nth odd number after the starting odd number
        int nthOddNumber = findNthOddNumberAfter(startingOddNumber, n);
        System.out.println("The " + n + "th odd number after " + startingOddNumber + " is: " + nthOddNumber);

        scanner.close();
    }

    // Function to find the nth odd number after a given odd number
    private static int findNthOddNumberAfter(int startingOddNumber, int n) {
        // Ensure the starting number is odd
        if (startingOddNumber % 2 == 0) {
            startingOddNumber++; // Increment if it's even
        }

        // Calculate the nth odd number after the starting odd number
        return startingOddNumber + (n - 1) * 2;
    }
}

