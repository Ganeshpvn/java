import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the statement from the user
        System.out.print("Enter a statement: ");
        String statement = scanner.nextLine();

        // Output: Display the number of vowels
        int numberOfVowels = countVowels(statement);
        System.out.println("The number of vowels in the statement is: " + numberOfVowels);

        scanner.close();
    }

    // Function to count the number of vowels
    private static int countVowels(String str) {
        int count = 0;

        // Convert the statement to lowercase to handle both uppercase and lowercase vowels
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
