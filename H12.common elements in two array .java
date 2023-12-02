import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsFinder {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 4, 5, 6, 7};

        int[] commonElements = findCommonElements(array1, array2);

        System.out.println("Common elements: " + Arrays.toString(commonElements));
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();

        // Add elements of array1 to set1
        for (int num : array1) {
            set1.add(num);
        }

        // Check for common elements in array2 and add them to commonSet
        for (int num : array2) {
            if (set1.contains(num)) {
                commonSet.add(num);
            }
        }

        // Convert commonSet to an array
        int[] commonElements = new int[commonSet.size()];
        int index = 0;
        for (int num : commonSet) {
            commonElements[index++] = num;
        }

        return commonElements;
    }
}
