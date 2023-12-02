import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Create a HashMap to store the values of Roman numerals
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        // Iterate through the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanValues.get(s.charAt(i));

            // If the value of the current character is less than the value of the next character,
            // subtract it; otherwise, add it to the result
            if (i < s.length() - 1 && value < romanValues.get(s.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "LVIII";
        int result = romanToInt(s);

        System.out.println("Output: " + result);
    }
}

