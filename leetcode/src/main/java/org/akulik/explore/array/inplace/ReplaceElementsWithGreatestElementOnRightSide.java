package org.akulik.explore.array.inplace;

public class ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        int[] nums = new int[arr.length];

        nums[arr.length - 1] = -1;

        int lastElement = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            nums[i] = Math.max(arr[i + 1], lastElement);
            lastElement = nums[i];
        }
        return nums;
    }
}
