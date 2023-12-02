import java.util.Scanner;

public class SumOfNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements (N): ");
        int N = scanner.nextInt();

        // Initialize an array of size N
        int[] numbers = new int[N];

        // Input N numbers into the array
        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            try {
                numbers[i] = scanner.nextInt();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Exceeded the specified size of the array.");
                System.exit(1);
            }
        }

        // Calculate the sum of the numbers
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += numbers[i];
        }

        // Display the result
        System.out.println("Sum of the numbers: " + sum);

        // Close the scanner
        scanner.close();
    }
}
