public class RansomNote {

    public static void main(String[] args) {
        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println(canConstruct(ransomNote1, magazine1));  // Output: false

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println(canConstruct(ransomNote2, magazine2));  // Output: false

        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println(canConstruct(ransomNote3, magazine3));  // Output: true
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];

        // Count the occurrences of each character in the magazine
        for (char ch : magazine.toCharArray()) {
            charCount[ch - 'a']++;
        }

        // Check if ransomNote can be constructed
        for (char ch : ransomNote.toCharArray()) {
            if (charCount[ch - 'a'] > 0) {
                charCount[ch - 'a']--;
            } else {
                return false;  // If a required character is not available in the magazine
            }
        }

        return true;
    }
}
