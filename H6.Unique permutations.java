import java.util.HashSet;
import java.util.Set;

public class UniquePermutations {
    public static void main(String[] args) {
        // Given Number
        int givenNumber = 143;

        // Convert the number to a string to get individual digits
        String numberStr = Integer.toString(givenNumber);

        // Create a set to store unique permutations
        Set<String> permutations = new HashSet<>();

        // Generate permutations
        generatePermutations("", numberStr, permutations);

        // Print the unique permutations
        System.out.println("Unique Permutations are:");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    private static void generatePermutations(String prefix, String remaining, Set<String> permutations) {
        int n = remaining.length();

        // Base case: if the remaining string is empty, add the permutation to the set
        if (n == 0) {
            permutations.add(prefix);
        } else {
            // Recursive case: generate permutations by fixing each character in the remaining string
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1, n), permutations);
            }
        }
    }
}

