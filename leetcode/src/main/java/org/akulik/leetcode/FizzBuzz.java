package org.akulik.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private final List<String> array = new ArrayList<>();

    public List<String> fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                array.add("FizzBuzz");
            } else if (i % 5 == 0) {
                array.add("Buzz");
            } else if (i % 3 == 0) {
                array.add("Fizz");
            } else {
                array.add(Integer.toString(i));
            }
        }
        return array;
    }

}
