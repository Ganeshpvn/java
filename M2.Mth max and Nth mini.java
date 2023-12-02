import java.util.Arrays;

public class MaxMinSumDifference {
    public static void main(String[] args) {
        int[] array = {14, 16, 87, 36, 25, 89, 34};
        int m = 1;
        int n = 3;

        // Sorting the array in ascending order
        Arrays.sort(array);

        // Finding Mth maximum number
        int mthMax = array[array.length - m];

        // Finding Nth minimum number
        int nthMin = array[n - 1];

        // Calculating sum and difference
        int sum = mthMax + nthMin;
        int difference = mthMax - nthMin;

        // Displaying the results
        System.out.println("Array of elements: " + Arrays.toString(array));
        System.out.println(m + "st Maximum Number = " + mthMax);
        System.out.println(n + "th Minimum Number = " + nthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
    }
}
