

//min and max out of arr

import java.util.Arrays;

public class arr1 {
    public static int min(int arr[]){
         Arrays.sort(arr);
          int min = arr[0];
           return min ;

    }
    public static int max(int arr[]){
        Arrays.sort(arr);
        int max = arr[arr.length - 1] ;
        return max ;

    }
public static void main (String args[]){
    int[] arr = {1132,35456,673,243,575};

    System.out.println("the minimum no is: "+ min(arr) );
    System.out.println("the minimum no is: "+ max(arr) );
}



}
