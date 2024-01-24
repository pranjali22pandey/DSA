
//buy and sell stocks

public class arr8 {
public static int buyAndsell( int arr[]){
    int buyPrice= Integer.MAX_VALUE;
    int maxPrice=0;

    for(int i =0 ; i<arr.length; i++){
        if(buyPrice < arr[i]){
            int profit = arr[i] - buyPrice;
            maxPrice= Math.max(maxPrice, profit);
        }
        else{
            buyPrice=arr[i];
        }




    }
return maxPrice;


}
public static void main(String args[]){
     int arr[]={7,1,5,3,6,4};

    System.out.println(buyAndsell(arr));

}

}
