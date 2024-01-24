import java.util.Arrays;
public class str2 {
public class AnagramCheck {
    public static boolean isAnagram(String s, String t) {
        // Check if lengths are different
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare sorted char arrays
        return Arrays.equals(sArray, tArray);
    }



}}