
public class CombinationSum {

    public static void combinationSum(int[] candidates, int target) {
        findCombinations(candidates, target, 0, new int[candidates.length], 0);
    }

    private static void findCombinations(int[] candidates, int target, int sum, int[] current, int index) {
        if (sum == target) {
            printCombination(current, index);
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (sum + candidates[i] <= target) {
                current[index] = candidates[i];
                findCombinations(candidates, target, sum + candidates[i], current, index + 1);
            }
        }
    }

    private static void printCombination(int[] current, int index) {
        System.out.print("Combination: ");
        for (int i = 0; i < index; i++) {
            System.out.print(current[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        System.out.println("All unique combinations that sum up to " + target + ":");
        combinationSum(candidates, target);
    }
}
