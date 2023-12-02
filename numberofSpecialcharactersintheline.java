import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a line of text: ");
        String inputLine = scanner.nextLine();

        // Calling the method to print special characters and count
        printSpecialCharacters(inputLine);

        // Closing the scanner
        scanner.close();
    }

    // Function to print special characters and count
    static void printSpecialCharacters(String inputLine) {
        int specialCharacterCount = 0;

        System.out.println("Special characters in the line:");

        // Loop through each character in the input line
        for (int i = 0; i < inputLine.length(); i++) {
            char currentChar = inputLine.charAt(i);

            // Check if the character is a special character
            if (!Character.isLetterOrDigit(currentChar) && !Character.isWhitespace(currentChar)) {
                System.out.println(currentChar);
                specialCharacterCount++;
            }
        }

        System.out.println("Number of special characters: " + specialCharacterCount);
    }
}
