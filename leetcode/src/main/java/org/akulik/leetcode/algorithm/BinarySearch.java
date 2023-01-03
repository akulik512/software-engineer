package org.akulik.leetcode.algorithm;

public class BinarySearch {

    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) return middle;
            if (target < nums[middle]) right = middle - 1;
            if (target > nums[middle]) left = middle + 1;
        }
        return -1;
    }

}
