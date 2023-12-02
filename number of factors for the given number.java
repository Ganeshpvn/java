import java.util.Scanner;

public class FactorCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate that the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Output: Display the number of factors
            int numberOfFactors = countFactors(number);
            System.out.println("The number of factors for " + number + " is: " + numberOfFactors);
        }

        scanner.close();
    }

    // Function to count the number of factors
    private static int countFactors(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        return count;
    }
}