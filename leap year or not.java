import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Checking if the year is a leap year and printing the result
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Closing the scanner
        scanner.close();
    }

    // Function to check if a year is a leap year
    static boolean isLeapYear(int year) {
        // Leap year is divisible by 4, but not divisible by 100 unless it is divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}