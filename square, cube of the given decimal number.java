import java.util.Scanner;

public class SquareAndCubeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the decimal number from the user
        System.out.print("Enter a decimal number: ");
        double number = scanner.nextDouble();

        // Calculate and print the square and cube
        calculateAndPrintSquareAndCube(number);

        scanner.close();
    }

    // Function to calculate and print the square and cube of a decimal number
    public static void calculateAndPrintSquareAndCube(double number) {
        double square = number * number;
        double cube = Math.pow(number, 3);
        System.out.println("Square Number: " + square);
        System.out.println("Cube Number: " + cube);
    }
}
