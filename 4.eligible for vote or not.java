import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check eligibility for voting
        if (isEligibleForVote(age)) {
            System.out.println("You are eligible to vote!");
        } else {
            int yearsLeft = calculateYearsLeft(age);
            System.out.println("You are not eligible to vote. You can vote in " + yearsLeft + " years.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check eligibility for voting
    private static boolean isEligibleForVote(int age) {
        // Assuming the legal voting age is 18
        return age >= 18;
    }

    // Function to calculate years left to be eligible for voting
    private static int calculateYearsLeft(int age) {
        // Assuming the legal voting age is 18
        return 18 - age;
    }
}
OUTOUT:
C:\Users\VAISHNAVI\Desktop>javac VoteEligibility.java

C:\Users\VAISHNAVI\Desktop>java VoteEligibility
Enter your age: 18
You are eligible to vote!