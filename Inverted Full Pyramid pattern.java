import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of rows
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Calling the method to print the inverted full pyramid pattern
        printInvertedFullPyramid(numRows);

        // Closing the scanner
        scanner.close();
    }

    // Function to print the inverted full pyramid pattern
    static void printInvertedFullPyramid(int numRows) {
        for (int i = numRows; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
    }
}
