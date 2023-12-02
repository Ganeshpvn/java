import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a non-negative integer (n): ");
        int n = scanner.nextInt();

        // Checking if the input is non-negative
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Calling the method to calculate factorial and printing the result
            long factorialResult = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is: " + factorialResult);
        }

        // Closing the scanner
        scanner.close();
    }

    // Function to calculate factorial
    static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}
