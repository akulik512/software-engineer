package com.akulik.ocp.two;

public class PrimitiveTypesPart1 {
    public void result() {
        // 5
        AssignmentsAndArithmetics arithmetics = new AssignmentsAndArithmetics();
        System.out.println(arithmetics.result());
        // 5
        CompoundAssignments assignments = new CompoundAssignments();
        System.out.println(assignments.result());
        // 5
        OperatorEvaluationOrder order = new OperatorEvaluationOrder();
        System.out.println(order.result());
        // 5
        IncrementDecrementOperators operators = new IncrementDecrementOperators();
        System.out.println(operators.result());
    }

    private static class AssignmentsAndArithmetics {
        private int result() {
            int a = 1;      // assignment (a is 1)
            int b = a + 4;  // addition (b is 5)
            int c = b - 2;  // subtraction (c is 3)
            int d = c * b;  // multiplication (d is 15)
            int e = d / c;  // division (e is 5)
            int f = e % 6;  // modulus (f is 3)
            return f;
        }
    }

    private static class CompoundAssignments {
        private int result() {
            int a = 1, b = 3;
            a += b;      // equivalent of a = a + b; (a is 4)
            a -= 2;      // equivalent of a = a - 2; (a is 2)
            a *= b;      // equivalent of a = a * 6; (a is 6)
            a /= 2;      // equivalent of a = a / 2; (a is 3)
            a %= a;      // equivalent of a = a / 2; (a is 0)
            return a;
        }
    }

    private static class OperatorEvaluationOrder {
        private int result() {
            int a = 2, b = 3;
            int c = b - a * b;   // (c is -3)
            int d = (b - a) * b; // (d is 3)
            return d;
        }
    }

    private static class IncrementDecrementOperators {
        private int result() {
            int a = 1, b = 0;
            a++;        // increment (a is 2)
            ++a;        // increment (a is 3)
            a--;        // increment (a is 2)
            --a;        // increment (a is 1)

            b = a++;    // increment postfix (b is 1, a is 2)
            b = ++a;    // increment prefix (b is 3, a is 3)
            b = a--;    // decrement postfix (b is 3, a is 2)
            b = --a;    // decrement prefix (b is 1, a is 1)
            return b;
        }
    }
}