package org.akulik.explore.array.intro;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] newNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i] * nums[i];
        }
        Arrays.sort(newNums);

        return newNums;
    }

    public int[] official(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }
}
