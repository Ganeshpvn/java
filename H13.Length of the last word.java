public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        // Trim the input string to remove leading and trailing spaces
        s = s.trim();

        // Find the last space in the trimmed string
        int lastSpaceIndex = s.lastIndexOf(' ');

        // If no space is found, the entire string is the last word
        if (lastSpaceIndex == -1) {
            return s.length();
        }

        // Extract the last word and return its length
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        int length = lengthOfLastWord(s);

        System.out.println("Output: " + length);
    }
}

