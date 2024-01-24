//chocolate distribution problem

import java.util.Arrays;

public class arr5 {

    public static int choco(int []a, int n, int m){
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i<n-1; i++){
            int diff = a[i+n-1]- a[i];
            if(diff<min)
                min=diff;


        }
        return min;

    }




    public static void main(String args[]){
        int [] a={3,4,1,9,56,7,9,12};
        int n= a.length;
        int m = 5;
        System.out.println(choco(a,n,m));



    }
}
