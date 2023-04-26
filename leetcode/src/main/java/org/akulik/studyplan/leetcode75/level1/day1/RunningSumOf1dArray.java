package org.akulik.studyplan.leetcode75.level1.day1;

public class RunningSumOf1dArray {

    /*
     * Time complexity: O(n)
     * Space complexity: O(1)
     * */
    public int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            output[i] = nums[i] + output[i - 1];
        }

        return output;
    }

    /*
     * Time complexity: O(n)
     * Space complexity: O(1)
     * */
    public int[] runningSumOverwrittenInput(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}
