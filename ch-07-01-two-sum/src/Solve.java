public class Solve {
    public static void main(String[] args) {
        int[] result = Solve.twoSum(new int[]{2,7,11,15}, 9);
        int[] result2 = Solve.twoSumTwoPointer(new int[]{2,5,5,11}, 10);
        System.out.println("RESULT1: " + result);
        System.out.println("RESULT2: " + result2);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSumTwoPointer(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left != right) {
            if (nums[left] + nums[right] == target) {
                return new int[]{left, right};
            }
            if (nums[left] + nums[right] > target) right--;
            else left++;
        }

        return null;
    }
}
