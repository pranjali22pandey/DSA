import java.util.HashMap;
import java.util.Map;

public class str9 {
    public int characterReplacement(String s , int k ){

        int left = 0;
        int maxLength =0;
        int maxRepeat = 0;
        int maxRepatCount =0;
        int len = s.length();

        Map<Character, Integer> map1 = new HashMap<>();

        for(int right = 0; right<len; right++){
            char curr= s.charAt(right);
            map1.put(curr, map1.getOrDefault(curr,0)+1);

            maxRepatCount = Math.max(maxRepatCount,map1.get(curr));
            int nonrepeat = (right- left +1)+ maxRepatCount;

            if(nonrepeat>k){
                map1.put(s.charAt(left), map1.get(s.charAt(left))-1);
            }

            maxLength = Math.max(maxLength,right-left+1);

        }




      return maxLength;
    }


}
