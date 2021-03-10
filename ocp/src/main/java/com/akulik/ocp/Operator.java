package com.akulik.ocp;

/**
 * <pre>
 * 1 - Assignments and Arithmetics Operators;
 * 2 - Compound Assignments
 * 3 - Operator Evaluation Order
 * </pre>
 * */
public class Operator {

    public static void main(String[] args) {
        // 1
        AssignmentsAndArithmetics arithmetics = new AssignmentsAndArithmetics();
        System.out.println(arithmetics.result());

        // 2
        CompoundAssignments assignments = new CompoundAssignments();
        System.out.println(assignments.result());

        // 3
        OperatorEvaluationOrder order = new OperatorEvaluationOrder();
        System.out.println(order.result());
    }

    static class AssignmentsAndArithmetics {
        public int result() {
            int a = 1;      // assignment (a is 1)
            int b = a + 4;  // addition (b is 5)
            int c = b - 2;  // subtraction (c is 3)
            int d = c * b;  // multiplication (d is 15)
            int e = d / c;  // division (e is 5)
            int f = e % 6;  // modulus (f is 3)
            return f;
        }
    }

    static class CompoundAssignments {
        public int result() {
            int a = 1, b = 3;
            a += b;      // equivalent of a = a + b; (a is 4)
            a -= 2;      // equivalent of a = a - 2; (a is 2)
            a *= b;      // equivalent of a = a * 6; (a is 6)
            a /= 2;      // equivalent of a = a / 2; (a is 3)
            a %= a;      // equivalent of a = a / 2; (a is 0)
            return a;
        }
    }

    static class OperatorEvaluationOrder {
        public int result() {
            int a = 2, b = 3;
            int c = b - a * b;   // (c is -3)
            int d = (b - a) * b; // (d is 3)
            return d;
        }
    }
}
