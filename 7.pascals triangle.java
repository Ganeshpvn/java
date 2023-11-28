import java.util.Scanner;

public class PascalTriangle {

    // Function to calculate and print Pascal's Triangle
    static void printPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            // Print spaces for alignment
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // Calculate and print the values in each row
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + "   ");
                val = val * (i - j) / (j + 1);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        printPascalTriangle(numRows);

        scanner.close();
    }
}
OUTPUT:
Enter the number of rows for Pascal's Triangle: 5
    1  
  1   1   
    1   2   1   
  1   3   3   1   
1   4   6   4   1   