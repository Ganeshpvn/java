import java.util.Scanner;

public class UserCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the total number of users: ");
        int totalUsers = scanner.nextInt();

        System.out.print("Enter the number of staff users: ");
        int staffUsers = scanner.nextInt();

        // Calculate number of student users
        int studentUsers = totalUsers - staffUsers;

        // Calculate number of non-teaching staff users
        int nonTeachingStaff = staffUsers / 3;

        // Output
        System.out.println("Number of student users: " + studentUsers);
        System.out.println("Number of staff users: " + staffUsers);
        System.out.println("Number of non-teaching staff: " + nonTeachingStaff);
    }
}
