import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number to be printed: ");
        int num = scanner.nextInt();
        System.out.print("Max Number of times to be printed: ");
        int maxTimes = scanner.nextInt();

        // Calling the method to print the pattern
        printPattern(num, maxTimes);

        // Closing the scanner
        scanner.close();
    }

    // Function to print the pattern
    static void printPattern(int num, int maxTimes) {
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }

        for (int i = maxTimes - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }

        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= maxTimes - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
OUTPUT:
Enter the number to be printed: 1
Max Number of times to be printed: 5
1
11
111
1111
11111
1111
111
11
1
    1
   11
  111
 1111
11111