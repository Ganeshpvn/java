import java.util.Scanner;

public class EvenFibonacciSum {

    // Function to calculate the sum of even Fibonacci numbers up to N
    static long evenFibonacciSum(long n) {
        long a = 0, b = 1, c, sum = 0;

        while (true) {
            c = a + b;
            if (c > n) {
                break;
            }
            if (c % 2 == 0) {
                sum += c;
            }
            a = b;
            b = c;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number N: ");
        long n = scanner.nextLong();

        long sum = evenFibonacciSum(n);
        System.out.println("Sum of even Fibonacci numbers up to " + n + " is: " + sum);

        scanner.close();
    }
}

OUTPUT:
Enter the number N: 32
Sum of even Fibonacci numbers up to 32 is: 10