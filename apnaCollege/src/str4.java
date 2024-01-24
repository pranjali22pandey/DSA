public class str4 {
    class Solution{
        public String removeConsecutiveCharacter(String S){


            // Create a StringBuilder to store the result
            StringBuilder result = new StringBuilder();

            // Iterate through the string
            for (int i = 0; i < S.length(); i++) {
                // Append the current character to the result
                result.append(S.charAt(i));

                // Check if the next character is equal to the current character
                // If yes, skip the next character
                while (i + 1 < S.length() && S.charAt(i) == S.charAt(i + 1)) {
                    i++;
                }
            }

            // Convert StringBuilder to String and return the result
            return result.toString();


        }
    }
}
