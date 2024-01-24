
import java.util.Arrays;
public class TwoSum {


    static int[] findTwoSum(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int currentSum = nums[left] + nums[right];

            if (currentSum == target) {
                return new int[]{nums[left], nums[right]};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        // If no pair is found
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Pair found: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No pair found.");
        }
    }

}

