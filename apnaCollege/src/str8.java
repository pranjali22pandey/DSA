import java.util.HashMap;
public class str8 {



        public int lengthOfLongestSubstring(String s) {
            // Check if the input string is null or empty
            if (s == null || s.length() == 0) {
                return 0;
            }

            // HashMap to store the index of each character's last occurrence
            HashMap<Character, Integer> charIndexMap = new HashMap<>();

            // Variable to store the length of the longest substring
            int maxLength = 0;

            // Variable to mark the start index of the current substring
            int start = 0;

            // Iterate through the string using two pointers, start and end
            for (int end = 0; end < s.length(); end++) {
                // Get the current character at the end pointer
                char currentChar = s.charAt(end);

                // If the character is already present in the charIndexMap
                if (charIndexMap.containsKey(currentChar)) {
                    // Update the start pointer to the next index after the last occurrence of the character
                    start = Math.max(start, charIndexMap.get(currentChar) + 1);
                }

                // Update the index of the current character in the charIndexMap
                charIndexMap.put(currentChar, end);

                // Update maxLength based on the length of the current substring
                maxLength = Math.max(maxLength, end - start + 1);
            }

            // Return the final length of the longest substring without repeating characters
            return maxLength;
        }


}
