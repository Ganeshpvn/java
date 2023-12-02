import java.util.Arrays;
import java.util.Comparator;

public class KWeakestRows {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        // Create an array to store the strength of each row
        int[] strength = new int[m];

        // Calculate the strength of each row
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            strength[i] = count;
        }

        // Create an array of indices and sort it based on the strength
        Integer[] indices = new Integer[m];
        for (int i = 0; i < m; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, Comparator.comparingInt(a -> strength[a]));

        // Create the result array with the first k indices
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = indices[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}
        };
        int k = 3;

        int[] output = kWeakestRows(mat, k);

        System.out.println("Output: " + Arrays.toString(output));
    }
}

