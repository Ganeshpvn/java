import java.util.Scanner;

public class SkipNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values M, N, and K
        System.out.print("Enter the starting number (M): ");
        int M = scanner.nextInt();

        System.out.print("Enter the ending number (N): ");
        int N = scanner.nextInt();

        System.out.print("Enter the number of steps to skip (K): ");
        int K = scanner.nextInt();

        // Validate input
        if (M > N || K <= 0) {
            System.out.println("Invalid input. Please ensure M <= N and K > 0.");
            return;
        }

        // Print numbers from M to N, skipping K numbers in between
        System.out.println("Numbers from " + M + " to " + N + " with a step of " + K + ":");

        for (int i = M; i <= N; i += K) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}

OUTPUT:
Enter the starting number (M): 50
Enter the ending number (N): 100
Enter the number of steps to skip (K): 7
Numbers from 50 to 100 with a step of 7:
50 57 64 71 78 85 92 99 