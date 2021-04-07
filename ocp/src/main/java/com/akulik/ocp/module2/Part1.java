package com.akulik.ocp.module2;

public class Part1 {

    public static void main(String[] args) {
        System.out.println(AssignmentsAndArithmetics.result());

        System.out.println(CompoundAssignments.result());

        System.out.println(OperatorEvaluationOrder.result());

        System.out.println(IncrementDecrementOperators.result());
    }

    private static class AssignmentsAndArithmetics {
        private static int result() {
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
        private static int result() {
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
        private static int result() {
            int a = 2, b = 3;
            int c = b - a * b;   // (c is -3)
            int d = (b - a) * b; // (d is 3)
            return d;
        }
    }

    private static class IncrementDecrementOperators {
        private static int result() {
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
