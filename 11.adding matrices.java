import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrices
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Input the first matrix
        System.out.println("Enter the elements of the first matrix:");
        int[][] matrix1 = inputMatrix(scanner, rows, columns);

        // Input the second matrix
        System.out.println("Enter the elements of the second matrix:");
        int[][] matrix2 = inputMatrix(scanner, rows, columns);

        // Perform matrix addition
        int[][] resultMatrix = addMatrices(matrix1, matrix2, rows, columns);

        // Display the result
        System.out.println("Resultant Matrix after addition:");
        displayMatrix(resultMatrix);

        scanner.close();
    }

    // Function to input a matrix
    private static int[][] inputMatrix(Scanner scanner, int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Function to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int rows, int columns) {
        int[][] resultMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultMatrix;
    }

    // Function to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
OUTPUT:
Enter the number of rows: 2
Enter the number of columns: 2
Enter the elements of the first matrix:
Enter element at position (1,1): 2
Enter element at position (1,2): 3
Enter element at position (2,1): 4
Enter element at position (2,2): 5
Enter the elements of the second matrix:
Enter element at position (1,1): 3
Enter element at position (1,2): 2
Enter element at position (2,1): 1
Enter element at position (2,2): 4
Resultant Matrix after addition:
5 5 
5 9 