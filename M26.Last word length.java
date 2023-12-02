public class LastWordLength {
    public static void main(String[] args) {
        String s = "Hello World";
        int result = lengthOfLastWord(s);
        System.out.println("Output: " + result);
    }

    public static int lengthOfLastWord(String s) {
        // Trim the input string to remove leading and trailing spaces
        s = s.trim();

        // Find the index of the last space in the trimmed string
        int lastSpaceIndex = s.lastIndexOf(' ');

        // Calculate the length of the last word based on the last space index
        return s.length() - lastSpaceIndex - 1;
    }
}
