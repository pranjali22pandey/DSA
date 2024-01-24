
//- Implement a function compressStringLoop that takes a string and compresses it by counting consecutive repeated characters using a loop.
//
//   - Write a function compressStringRecursion to achieve the same string compression using recursion.
public class StringCompression {
    public int compress(char[] chars){
        int index = 0;
        int i =0;
        while(i< chars.length){
            int j = i;
            while(j < chars.length && chars[j]==chars[i]){
                j++;
            }
            chars[index++]= chars[i];
            if(j-i >1){
                String count = j - i +"";
                for(char c : count.toCharArray()){
                    chars[index++]= c;
                }
            }
            i =j;
        }
        return index;
    }


}
