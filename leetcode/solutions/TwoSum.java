package leetcode.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        // Example 1
        int[] nums_1 = {2, 7, 11 , 15};
        int target_1 = 9;
        System.out.println(Arrays.toString(twoSum.twoSum(nums_1, target_1))); // [0,1]

        // Example 2
        int[] nums_2 = {3, 2, 4};
        int target_2 = 6;
        System.out.println(Arrays.toString(twoSum.twoSum(nums_2, target_2))); // [1,2]

        // Example 3
        int[] nums_3 = {3, 3};
        int target_3 = 6;
        System.out.println(Arrays.toString(twoSum.twoSum(nums_3, target_3))); // [0,1]
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] {i, map.get(complement)};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No match found!");
    }
}
