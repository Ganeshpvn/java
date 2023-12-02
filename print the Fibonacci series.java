import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number of terms from the user
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int terms = scanner.nextInt();

        // Output: Display the Fibonacci series
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        printFibonacciSeries(terms);

        scanner.close();
    }

    // Function to print the Fibonacci series
    private static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}