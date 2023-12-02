import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of days
        System.out.print("Enter the number of days: ");
        
        // Read the number of days from the user
        int totalDays = scanner.nextInt();

        // Calculate the equivalent years, weeks, and days
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        // Display the result
        System.out.println("No. of years: " + years);
        System.out.println("No. of weeks: " + weeks);
        System.out.println("No. of days: " + days);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
