

//using binary search
public class arr15 {
public static int mini(int[] nums){
    int low = 0;
    int high = nums.length -1;

    while(low<high){
        int mid = low + (high-low)/2;
        if(nums[mid]<nums[high]){
            high = mid;

        }
        else{
            low = mid+1;
        }



    }
    return nums[low];




}




}
