

public class arr3 {
    public int maxSum (int[]arr){

        int currentSum= 0;
        int maxSum = 0;

        for(int i = 0 ; i<=arr.length - 1 ;  i++ ){

            currentSum = currentSum + arr[i];
            if(currentSum > maxSum){
                currentSum = maxSum;
            }

            if(currentSum <0){
                currentSum = 0;
            }


        }

     return maxSum;
    }

}
