import java.util.ArrayList;
import java.util.List;

public class PerfectSquareWithDigitSum {
    public static void main(String[] args) {
        // Define the range
        int startRange = 1;
        int endRange = 100;

        // Create a list to store the numbers
        List<Integer> result = findNumbers(startRange, endRange);

        // Print the result
        System.out.println("Numbers in the range [" + startRange + ", " + endRange + "] that are perfect squares " +
                           "and have a digit sum less than 10:");
        System.out.println(result);
    }

    // Function to find numbers in the range that are perfect squares and have a digit sum less than 10
    private static List<Integer> findNumbers(int start, int end) {
        List<Integer> result = new ArrayList<>();

        for (int num = start; num <= end; num++) {
            if (isPerfectSquare(num) && digitSum(num) < 10) {
                result.add(num);
            }
        }

        return result;
    }

    // Function to check if a number is a perfect square
    private static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    // Function to calculate the sum of digits of a number
    private static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
