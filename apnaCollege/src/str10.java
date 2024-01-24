import java.util.*;
public class str10{

    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to store anagrams
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            // Sort the characters in the string to identify anagrams
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // If the sorted string is already in the map, add the original string to the list
            if (anagramGroups.containsKey(sortedStr)) {
                anagramGroups.get(sortedStr).add(str);
            } else {
                // If not, create a new list and put it in the map
                List<String> anagramList = new ArrayList<>();
                anagramList.add(str);
                anagramGroups.put(sortedStr, anagramList);
            }
        }

        // Convert the map values to a list of lists
        List<List<String>> result = new ArrayList<>(anagramGroups.values());

        return result;
    }
}