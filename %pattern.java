import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the character and the max number of times
        System.out.print("Enter the Character to be printed: ");
        char character = scanner.next().charAt(0);
        System.out.print("Max Number of times printed: ");
        int maxTimes = scanner.nextInt();

        // Calling the method to print the pattern
        printCharacterPattern(character, maxTimes);

        // Closing the scanner
        scanner.close();
    }

    // Function to print the specified character pattern
    static void printCharacterPattern(char ch, int maxTimes) {
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
