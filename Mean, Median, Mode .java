import java.util.*;

public class StatsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Creating an array of size 'n'
        int[] numbers = new int[n];

        // Taking input for the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sorting the array to find median
        Arrays.sort(numbers);

        // Calculating mean, median, and mode
        double mean = calculateMean(numbers);
        double median = calculateMedian(numbers);
        int mode = calculateMode(numbers);

        // Printing the results
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);

        // Closing the scanner
        scanner.close();
    }

    // Function to calculate mean
    static double calculateMean(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    // Function to calculate median
    static double calculateMedian(int[] arr) {
        int length = arr.length;
        if (length % 2 == 0) {
            return (double) (arr[length / 2] + arr[length / 2 - 1]) / 2;
        } else {
            return arr[length / 2];
        }
    }

    // Function to calculate mode
    static int calculateMode(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = 0;

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if (frequencyMap.get(num) > maxFrequency) {
                maxFrequency = frequencyMap.get(num);
                mode = num;
            }
        }
        return mode;
    }
}
