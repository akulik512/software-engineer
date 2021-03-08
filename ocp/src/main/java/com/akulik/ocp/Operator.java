package com.akulik.ocp;

public class Operator {

    /**
     * Operators =+ and +=
    * */
    public static void main(String[] args) {
        int x = 1;
        x =+ 2;

        int y = 1;
        y += 2;
        System.out.println("x =+ 2 -> " + x);
        System.out.println("y += 2 -> " + y);
    }

}
