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
}
