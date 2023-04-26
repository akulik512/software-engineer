package org.akulik.explore.array.searching;

public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        int length = arr.length;
        int i = 0;

        // walk up
        while (i + 1 < length && arr[i] < arr[i + 1]) i++;

        // peak can't be first or last
        if (i == 0 || i == length - 1) return false;

        // walk down
        while (i + 1 < length && arr[i] > arr[i + 1]) i++;

        return i == length - 1;
    }
}
