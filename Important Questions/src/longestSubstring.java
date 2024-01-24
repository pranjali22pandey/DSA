import java.util.HashSet;

public class longestSubstring {

    public static int longest(String str) {
        int left = 0;
        int right = 0;
        int max = 0;
        HashSet<Character> seen = new HashSet<>();

        while (right < str.length()) {
            char c = str.charAt(right);
            if (seen.add(c)) {
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                while (str.charAt(left) != c) {
                    seen.remove(str.charAt(left));
                    left++;
                }
                seen.remove(c);
                left++;
            }
        }

        return max;
    }

    public static void main(String args[]) {
        String str = "abcdab";
        System.out.println("Length of the longest substring without repeating characters: " + longest(str));
    }
}
