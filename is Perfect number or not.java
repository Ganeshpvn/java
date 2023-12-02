import java.util.Scanner;

public class PerfectNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is perfect
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();
    }

    // Function to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false; // Perfect numbers are positive integers greater than 1
        }

        int sum = 1; // Start with 1 as the sum of proper divisors

        // Find and add the proper divisors
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        // Check if the sum of proper divisors is equal to the number
        return sum == number;
    }
}
