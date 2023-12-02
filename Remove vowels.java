import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove vowels from the string
        String resultString = removeVowels(inputString);

        // Display the modified string
        System.out.println("String after removing vowels: " + resultString);

        // Close the scanner
        scanner.close();
    }

    // Function to remove vowels from a given string
    private static String removeVowels(String input) {
        // Using regular expression to remove vowels
        return input.replaceAll("[aeiouAEIOU]", "");
    }
}
