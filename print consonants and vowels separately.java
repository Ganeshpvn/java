import java.util.Scanner;

public class SeparateConsonantsAndVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the word from the user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toUpperCase(); // Convert to uppercase for case-insensitivity

        // Separate and print consonants and vowels
        separateConsonantsAndVowels(word);

        scanner.close();
    }

    // Function to separate and print consonants and vowels
    public static void separateConsonantsAndVowels(String word) {
        StringBuilder consonants = new StringBuilder();
        StringBuilder vowels = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the letter is a vowel or consonant
                if (isVowel(ch)) {
                    vowels.append(ch).append(" ");
                } else {
                    consonants.append(ch).append(" ");
                }
            }
        }

        // Print the separated consonants and vowels
        System.out.println("Consonants: " + consonants.toString().trim());
        System.out.println("Vowels: " + vowels.toString().trim());
    }

    // Function to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return "AEIOU".indexOf(ch) != -1;
    }
}
