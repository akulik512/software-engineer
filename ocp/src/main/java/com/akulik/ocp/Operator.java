package com.akulik.ocp;

/**
 * 1 - Assignments and Arithmetics Operators
 * 2 -
 * */
public class Operator {

    public static void main(String[] args) {
        // 1
        AssignmentsAndArithmetics arithmetics = new AssignmentsAndArithmetics();
        arithmetics.result();

    }

    static class AssignmentsAndArithmetics {
        public void result() {
            int a = 1;      // assignment (a is 1)
            int b = a + 4;  // addition (b is 5)
            int c = b - 2;  // subtraction (c is 3)
            int d = c * b;  // multiplication (d is 15)
            int e = d / c;  // division (e is 5)
            int f = e % 6;  // modulus (f is 3)
        }
    }
}
