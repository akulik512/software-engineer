package com.akulik.ocp.eight;

public class Loop {
    public static void main(String[] args) {
        // Part 2
        int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 1;
        for (int i = 0; i < value.length; sum += i++) {
            System.out.println(sum);
        }
    }
}
