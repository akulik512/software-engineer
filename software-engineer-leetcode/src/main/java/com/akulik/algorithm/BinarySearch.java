package com.akulik.algorithm;

public class BinarySearch {

    public static int binarySearch(int[] nums, int target) {
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

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int targetElement = 7;

        int result = binarySearch(sortedArray, targetElement);

        if (result != -1) {
            System.out.println("Element " + targetElement + " found at index " + result);
        } else {
            System.out.println("Element " + targetElement + " not found in the array.");
        }
    }

}
