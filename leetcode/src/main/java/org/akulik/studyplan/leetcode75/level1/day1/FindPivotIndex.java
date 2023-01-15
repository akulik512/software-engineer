package org.akulik.studyplan.leetcode75.level1.day1;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for (int i : nums) {
            sum += i;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
