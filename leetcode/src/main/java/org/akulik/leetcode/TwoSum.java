package org.akulik.leetcode;

import java.util.HashMap;

// 1. Two Sum
public class TwoSum {

    public int[] twoSum(final int[] nums, final int target) {
        if (nums == null || nums.length < 2) return null;

        HashMap<Integer, Integer> idxByValue = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = target - nums[i];

            if (idxByValue.get(curr) != null) {
                return new int[]{i, idxByValue.get(curr)};
            }
            idxByValue.put(nums[i], i);
        }
        return null;
    }

}
