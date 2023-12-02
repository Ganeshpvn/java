import java.util.Scanner;

public class CompositeNumberPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the range
        System.out.print("Enter the lower bound (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the upper bound (b): ");
        int b = scanner.nextInt();

        // Calling the method to print composite numbers
        printCompositeNumbers(a, b);

        // Closing the scanner
        scanner.close();
    }

    // Function to check if a number is composite
    static boolean isComposite(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }

        return false;
    }

    // Function to print composite numbers in a given range
    static void printCompositeNumbers(int lowerBound, int upperBound) {
        System.out.println("Composite numbers between " + lowerBound + " and " + upperBound + ":");
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isComposite(i)) {
                System.out.println(i);
            }
        }
    }
}
