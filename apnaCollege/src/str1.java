public class str1 {
    public boolean isPalindrome(String s) {
    String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    // Check if the cleaned string is a palindrome
    int left = 0, right = cleanedString.length() - 1;
    while (left < right) {
        if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

}
