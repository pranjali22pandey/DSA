import java.util.Arrays;

public class arr9 {

    public static void nextPermutation(int[] nums) {
        // Find the first element from the right that is smaller than its adjacent element
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Find the first element from the right that is smaller than nums[i]
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Reverse the subarray to the right of nums[i]
        reverse(nums, i + 1, nums.length - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        System.out.println("Original Permutation: " + Arrays.toString(nums));

        nextPermutation(nums);

        System.out.println("Next Permutation: " + Arrays.toString(nums));
    }
}
