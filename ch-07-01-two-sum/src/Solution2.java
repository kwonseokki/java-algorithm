import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public static void main(String[] args) {
        int[] result = Solution2.twoSum(new int[]{3, 2, 4}, 6);
        for(int num : result) {
            System.out.println(num);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i]) && i != numsMap.get(target - nums[i])) {
                return new int[]{i, numsMap.get(target - nums[i])};
            }

            numsMap.put(nums[i], i);
        }

        return null;
    }
}
