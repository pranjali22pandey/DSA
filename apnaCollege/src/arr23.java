import java.util.Arrays;

public class arr23 {

    public static String LargestNumberArrange(int[]arr){

        int n = arr.length;
        String[] s = new String[n];
        for(int i = 0; i<n; i++){
            s[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(s,(a,b) -> (b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();

        for(String str :s){
            sb.append(str);

        }
        String result = sb.toString();
        return result.startsWith("0")? "0" : result;


    }
}
