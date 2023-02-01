package org.akulik.explore.array.searching;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItIsDoubleExist {

    //    Devexperts
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(i * 2) || (i % 2 == 0 && set.contains(i / 2))) {
                return true;
            } else {
                set.add(i);
            }
        }

        return false;
    }
}
