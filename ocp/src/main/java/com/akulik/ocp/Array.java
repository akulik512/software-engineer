package com.akulik.ocp;

import java.util.Arrays;

public class Array {

    /**
     *
     * <link>
     *     https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#fill(java.lang.Object[],%20java.lang.Object)
     * </link>
     */
    public static void main(String[] args) {
        String[] array = new String[5];
        Arrays.fill(array, "Hello");
        System.out.println(array[2]);
    }

}
