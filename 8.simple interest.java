import java.util.Scanner;

public class SimpleInterestCalculator {

    // Function to calculate simple interest
    static double calculateSimpleInterest(double principal, double rate, double time) {
        // Senior citizen interest rate is 12%, others have 10% interest rate
        double interestRate = (principal >= 100000) ? 0.12 : 0.10;

        // Calculate simple interest
        double simpleInterest = (principal * interestRate * time) / 100;

        return simpleInterest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount, time, and check if the customer is a senior citizen
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        System.out.print("Is the customer a senior citizen? (true/false): ");
        boolean isSeniorCitizen = scanner.nextBoolean();

        // Calculate and display simple interest
        double simpleInterest = calculateSimpleInterest(principal, 0, time);
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}

OUTPUT:
Enter the principal amount: 200000
Enter the time (in years): 3
Is the customer a senior citizen? (true/false): false
Simple Interest: 720.0