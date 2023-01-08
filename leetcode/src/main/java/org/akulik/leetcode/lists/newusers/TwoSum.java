package org.akulik.leetcode.lists.newusers;

import java.util.HashMap;

// 1. Two Sum
public class TwoSum {

    public int[] twoSum(final int[] nums, final int target) {
        if (nums == null || nums.length < 2) return null;

        final HashMap<Integer, Integer> indexByValue = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (indexByValue.containsKey(complement)) {
                return new int[]{indexByValue.get(complement), i};
            }
            indexByValue.put(nums[i], i);
        }
        return null;
    }

    public int[] twoSumBruteForce(final int[] nums, final int target) {
        if (nums == null || nums.length < 2) return null;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int complement = nums[i] + nums[j];

                if (target == complement) return new int[]{i, j};
            }
        }
        return null;
    }

}
