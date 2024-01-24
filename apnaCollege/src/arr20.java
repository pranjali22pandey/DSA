import java.util.Arrays;

public class arr20 {
    public int findKthSmallest(int[] nums, int k) {


        Arrays.sort(nums);
        return nums[k-1];
    }
}

