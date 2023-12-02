import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 4, 9, 2, 7, 5};

        // Remove duplicates using HashSet
        int[] resultArray = removeDuplicates(array);

        // Display the result
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array after removing duplicates: " + Arrays.toString(resultArray));
    }

    // Helper method to remove duplicates from an array
    private static int[] removeDuplicates(int[] array) {
        HashSet<Integer> uniqueSet = new HashSet<>();

        // Use HashSet to keep track of unique elements
        for (int value : array) {
            uniqueSet.add(value);
        }

        // Convert the HashSet back to an array
        int[] resultArray = new int[uniqueSet.size()];
        int index = 0;
        for (int value : uniqueSet) {
            resultArray[index++] = value;
        }

        return resultArray;
    }
}
