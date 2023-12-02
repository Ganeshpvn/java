import java.util.Scanner;

public class FactorPrinter {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number
        System.out.print("Given Number: ");
        int givenNumber = scanner.nextInt();

        // Prompt the user to enter the value of N
        System.out.print("N = ");
        int n = scanner.nextInt();

        // Calculate the number of factors
        int factorsCount = 0;

        for (int i = 1; i <= givenNumber; i++) {
            if (givenNumber % i == 0) {
                factorsCount++;
            }
        }

        // Print the number of factors
        System.out.println("Number of factors = " + factorsCount);

        // Calculate and print the nth factor
        int nthFactor = 0;
        for (int i = 1; i <= givenNumber; i++) {
            if (givenNumber % i == 0) {
                nthFactor++;
                if (nthFactor == n) {
                    System.out.println(n + "th factor of " + givenNumber + " = " + i);
                    break;
                }
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

