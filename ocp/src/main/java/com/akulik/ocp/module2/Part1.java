package com.akulik.ocp.module2;

public class Part1 {

    public static void main(String[] args) {
        CompoundAssignments compoundAssignments = new CompoundAssignments();
        compoundAssignments.result();

        OperatorEvaluationOrder operatorEvaluationOrder = new OperatorEvaluationOrder();
        operatorEvaluationOrder.result();

        IncrementDecrementOperators incrementDecrementOperators = new IncrementDecrementOperators();
        incrementDecrementOperators.result();
    }

    private static class CompoundAssignments {
        private void result() {
            int a = 1, b = 3;
            a += b;      // equivalent of a = a + b; (a is 4)
            a -= 2;      // equivalent of a = a - 2; (a is 2)
            a *= b;      // equivalent of a = a * 6; (a is 6)
            a /= 2;      // equivalent of a = a / 2; (a is 3)
            a %= a;      // equivalent of a = a / 2; (a is 0)
        }
    }

    private static class OperatorEvaluationOrder {
        private void result() {
            int a = 2, b = 3;
            int c = b - a * b;   // (c is -3)
            int d = (b - a) * b; // (d is 3)
        }
    }

    private static class IncrementDecrementOperators {
        private void result() {
            int a = 1, b = 0;
            a++;        // increment (a is 2)
            ++a;        // increment (a is 3)
            a--;        // increment (a is 2)
            --a;        // increment (a is 1)

            b = a++;    // increment postfix (b is 1, a is 2)
            b = ++a;    // increment prefix (b is 3, a is 3)
            b = a--;    // decrement postfix (b is 3, a is 2)
            b = --a;    // decrement prefix (b is 1, a is 1)
        }
    }
}
