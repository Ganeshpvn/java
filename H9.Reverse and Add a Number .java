import java.util.Scanner;

public class ReverseAndAddPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }

        int inputNumber = scanner.nextInt();

        // Check for non-negative input
        if (inputNumber < 0) {
            System.out.println("Invalid input. Please enter a non-negative number.");
            return;
        }

        // Process and output palindrome steps
        processPalindrome(inputNumber);
    }

    // Function to reverse a number
    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    // Function to check if a number is a palindrome
    private static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }

    // Function to process and print palindrome steps
    private static void processPalindrome(int num) {
        int steps = 0;

        while (!isPalindrome(num)) {
            int reversed = reverseNumber(num);
            int sum = num + reversed;

            System.out.println(num + " + " + reversed + " = " + sum);

            num = sum;
            steps++;

            if (steps >= 1000) {
                System.out.println("Exceeded maximum steps. Exiting to prevent infinite loop.");
                break;
            }
        }

        System.out.println("Palindrome reached in " + steps + " steps. Result: " + num);
    }
}
