import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversedString = reverseWord(input);

        // Display the reversed string
        System.out.println("Reverse String: " + reversedString);

        // Close the scanner
        scanner.close();
    }

    // Function to reverse a word using a loop
    private static String reverseWord(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize variables for looping
        int start = 0;
        int end = charArray.length - 1;

        // Loop to reverse the string
        while (start < end) {
            // Swap characters at start and end positions
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move towards the center
            start++;
            end--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}
OUTPUT:
Enter a string: goodmorning
Reverse String: gninromdoog