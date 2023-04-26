package org.akulik.explore.array.inserting;

public class DuplicateZeros {

    public int[] duplicateZeros(int[] arr) {
        int length = arr.length - 1;

        for (int zeroIndex = length; zeroIndex >= 0; zeroIndex--) {
            if (arr[zeroIndex] == 0 && zeroIndex != length) {
                for (int index = length; index > zeroIndex; index--) {
                    if (index < length) {
                        arr[index + 1] = arr[index];
                    }
                }
                arr[zeroIndex + 1] = 0;
            }
        }
        return arr;
    }
}