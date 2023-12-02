import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Print the first n perfect numbers
        System.out.print("First " + n + " perfect numbers are: ");
        int count = 0;
        int number = 1;

        while (count < n) {
            if (isPerfect(number)) {
                System.out.print(number + " , ");
                count++;
            }
            number++;
        }

        scanner.close();
    }

    // Function to check if a number is perfect
    static boolean isPerfect(int num) {
        int sum = 1; // Start with 1 as every number is divisible by 1

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;

                // If the divisors are different, add the other divisor
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}
