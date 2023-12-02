import java.util.Arrays;
import java.util.Scanner;

public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input word from the user
        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();

        // Convert the word to a character array
        char[] charArray = inputWord.toCharArray();

        // Sort the character array in reverse alphabetical order
        Arrays.sort(charArray);
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Print the result
        System.out.println("Word in reverse alphabetical order: " + new String(charArray));

        // Close the scanner
        scanner.close();
    }
}

