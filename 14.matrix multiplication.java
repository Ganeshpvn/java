import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrices
        System.out.print("Enter the number of rows in the first matrix: ");
        int rows1 = scanner.nextInt();

        System.out.print("Enter the number of columns in the first matrix: ");
        int columns1 = scanner.nextInt();

        System.out.print("Enter the number of columns in the second matrix: ");
        int columns2 = scanner.nextInt();

        // Input the elements of the first matrix
        System.out.println("Enter the elements of the first matrix:");
        int[][] matrix1 = inputMatrix(scanner, rows1, columns1);

        // Input the elements of the second matrix
        System.out.println("Enter the elements of the second matrix:");
        int[][] matrix2 = inputMatrix(scanner, columns1, columns2);

        // Perform matrix multiplication
        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2, rows1, columns1, columns2);

        // Display the result
        System.out.println("Resultant Matrix after multiplication:");
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

    // Function to multiply two matrices
    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int rows1, int columns1, int columns2) {
        int[][] resultMatrix = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
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
C:\Users\VAISHNAVI.R\OneDrive\Desktop>javac MatrixMultiplication.java

C:\Users\VAISHNAVI.R\OneDrive\Desktop>java MatrixMultiplication
Enter the number of rows in the first matrix: 2
Enter the number of columns in the first matrix: 2
Enter the number of columns in the second matrix: 2
Enter the elements of the first matrix:
Enter element at position (1,1): 2
Enter element at position (1,2): 3
Enter element at position (2,1): 4
Enter element at position (2,2): 5
Enter the elements of the second matrix:
Enter element at position (1,1): 6
Enter element at position (1,2): 7
Enter element at position (2,1): 8
Enter element at position (2,2): 9
Resultant Matrix after multiplication:
36 41
64 73