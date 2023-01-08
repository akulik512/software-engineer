package org.akulik.leetcode.interview;

import java.util.List;

// Danske Bank
public class MaxIntegerInCollection {

    public Integer findMax(List<Integer> integers) {
        Integer biggest = integers.get(0);
        for (Integer current : integers) {
            if (current > biggest) biggest = current;
        }
        return biggest;
    }
}
