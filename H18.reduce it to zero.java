public class ReduceToZero {

    public static void main(String[] args) {
        int num1 = 14;
        System.out.println(numberOfSteps(num1));  // Output: 6

        int num2 = 8;
        System.out.println(numberOfSteps(num2));  // Output: 4
    }

    public static int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }

        return steps;
    }
}
