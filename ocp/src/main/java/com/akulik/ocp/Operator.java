package com.akulik.ocp;

/**
 * <pre>
 * 1 - Assignments and Arithmetics Operators;
 * 2 - Compound Assignments
 * 3 - Operator Evaluation Order
 * 4 - Increment Decrement Operators
 * 5 - Conditional Operators
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

        // 4
        IncrementDecrementOperators operators = new IncrementDecrementOperators();
        System.out.println(operators.result());

        //4
        ConditionalOperators conditionalOperators = new ConditionalOperators();
        System.out.println(conditionalOperators.result());
    }

    private static class AssignmentsAndArithmetics {
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

    private static class CompoundAssignments {
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

    private static class OperatorEvaluationOrder {
        public int result() {
            int a = 2, b = 3;
            int c = b - a * b;   // (c is -3)
            int d = (b - a) * b; // (d is 3)
            return d;
        }
    }

    private static class IncrementDecrementOperators {
        public int result() {
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

    private static class ConditionalOperators {
        public boolean result() {
            int a = 3, b = 2;
            boolean c = false;

            c = (a == b);           // c is false
            c = !(a == b);          // c is true
            c = (a != b);           // c is false
            c = (a > b);            // c is true
            c = (a >= b);           // c is true
            c = (a < b);            // c is false
            c = (a <= b);           // c is false

            c = (a > b && b == 2);  // c is true
            c = (a > b && b == 2);  // c is true
            c = (a < b && b == 2);  // c is false
            c = (a < b || b == 2);  // c is true
            c = (a < b || b == 3);  // c is false

            // For Exclusive OR, either part has to be true,
            // and the other part has to be false for the overall result to become true.
            c = (a > b ^ b == 2);   // c is false
            return c;
        }
    }

}
