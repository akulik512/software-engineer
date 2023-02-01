package org.akulik.explore.array.deleting;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != val) {
                nums[i] = nums[index];
                i++;
            }
        }
        return i;
    }

    public int removeElement_v2(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}
