import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks in four subjects
        System.out.print("Enter the marks in Python: ");
        int pythonMarks = scanner.nextInt();
        System.out.print("Enter the marks in C Programming: ");
        int cProgrammingMarks = scanner.nextInt();
        System.out.print("Enter the marks in Mathematics: ");
        int mathematicsMarks = scanner.nextInt();
        System.out.print("Enter the marks in Physics: ");
        int physicsMarks = scanner.nextInt();

        // Calculate total and aggregate
        int totalMarks = pythonMarks + cProgrammingMarks + mathematicsMarks + physicsMarks;
        double aggregate = totalMarks / 4.0;

        // Display total and aggregate
        System.out.println("Total= " + totalMarks);
        System.out.println("Aggregate = " + aggregate);

        // Determine and display the grade
        System.out.print("Grade: ");
        if (aggregate > 75) {
            System.out.println("Distinction");
        } else if (aggregate >= 60 && aggregate < 75) {
            System.out.println("First Division");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("Second Division");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }

        scanner.close();
    }
}

