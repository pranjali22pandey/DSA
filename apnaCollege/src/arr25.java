import java.util.HashMap;
import java.util.Map;

public class arr25 {


       public static  int longSubarrWthSumDivByK(int a[], int n, int k)
        {
            Map<Integer,Integer> mp = new HashMap();
            mp.put(0,-1);
            int sum = 0, ans= 0;
            for(int i = 0;i<n;i++){

                sum+=a[i];
                sum%= k;
                if(sum<0){
                    sum+=k;
                }
                mp.putIfAbsent(sum,i);
                if(mp.containsKey(sum)){
                    ans = Math.max(ans, i-mp.get(sum));
                }

            }
            return ans;

        }

}
