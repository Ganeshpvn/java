import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);

        if (tax == 0) {
            System.out.println("No tax.");
        } else {
            System.out.println("Tax to be paid: " + tax);
        }

        scanner.close();
    }

    // Helper method to calculate tax based on income
    private static double calculateTax(double income) {
        if (income <= 150000) {
            return 0; // No tax
        } else if (income <= 300000) {
            return 0.10 * (income - 150000);
        } else if (income <= 500000) {
            return 0.20 * (income - 300000) + 0.10 * (300000 - 150000);
        } else {
            return 0.30 * (income - 500000) + 0.20 * (500000 - 300000) + 0.10 * (300000 - 150000);
        }
    }
}
