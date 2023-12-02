import java.util.Scanner;

public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the symbol from the user
        System.out.print("Enter the symbol for the pattern: ");
        char symbol = scanner.next().charAt(0);

        // Input: Get the size of the square from the user
        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();

        // Output: Display the hollow square pattern
        printHollowSquarePattern(symbol, size);

        scanner.close();
    }

    // Function to print the hollow square pattern
    private static void printHollowSquarePattern(char symbol, int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Print the symbol only for the first and last rows, and the first and last columns
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print(symbol + " ");
                } else {
                    System.out.print("  "); // Print two spaces for the hollow part
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}