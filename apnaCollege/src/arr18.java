public class arr18 {
    public static int maxContainer(int[] height){

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;


        while( left < right){
            int minHeight = Math.min(height[left],height[right] );
            int width = left- right;

            int area = minHeight*width;
             maxArea = Math.max(maxArea, area);


             if(height[left]<height[right]){
                 left++;
             }
             else{
                 right--;
             }





        }

        return maxArea ;





    }




}
