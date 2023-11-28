import java.util.Scanner;

public class LCMGCDCalculator {

    // Function to calculate GCD of two numbers
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to calculate LCM of two numbers
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Function to calculate GCD of an array of numbers
    static int findGCD(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
        }
        return result;
    }

    // Function to calculate LCM of an array of numbers
    static int findLCM(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int gcdResult = findGCD(numbers);
        int lcmResult = findLCM(numbers);

        System.out.println("GCD of the numbers: " + gcdResult);
        System.out.println("LCM of the numbers: " + lcmResult);

        scanner.close();
    }
}
OUTPUT:
Enter the number of elements: 3 
Enter the elements:
12
25
30
GCD of the numbers: 1
LCM of the numbers: 60