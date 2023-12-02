mport java.util.Scanner;

public class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers (enter a non-number to stop):");

        int primeCount = 0;
        int compositeCount = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (isPrime(number)) {
                primeCount++;
            } else {
                compositeCount++;
            }
        }

        System.out.println("Prime numbers: " + primeCount);
        System.out.println("Composite numbers: " + compositeCount);
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
