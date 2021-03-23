package com.akulik.ocp.two;

public class PrimitiveTypesPart3 {
    public void result() {
        ConditionalOperators conditionalOperators = new ConditionalOperators();
        conditionalOperators.result();

        ShortCircuitEvaluation shortCircuitEvaluation = new ShortCircuitEvaluation();
        shortCircuitEvaluation.result();
    }

    private static class ConditionalOperators {
        private boolean result() {
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

    /*
     *
     * 1 - Short-Circuit Evaluation && ||
     * 2 - Full Evaluation & |
     *
     * Short-circuit evaluation enables you to not evaluate the right-hand side of the AND and OR expressions
     * when the overall result can be predicted from the left-hand side value.
     *
     * true     &&  evaluated
     * false    &&  not evaluated
     * false    &   evaluated
     * false    ||  evaluated
     * true     ||  not evaluated
     * true     |   evaluated
     * true     ^   evaluated
     * false    ^   evaluated
     *
     * Good example:
     * if (foo() || bar() || baz()) {
     *      // Do something
     * }
     * If foo() returns true, then bar and baz are never called, because the expression's outcome
     * has already been determined. So if bar or baz has some other effect than just returning something (a side effect),
     * those effects never occur.
     * */
    private static class ShortCircuitEvaluation {
        private boolean result() {
            int a = 3, b = 2;
            boolean c = false;

            c = (a > 2 && ++b == 3);    // c is true, b is 3
            c = (a > 2 && ++b == 3);    // c is false, b is 3
            c = (a > 2 || ++b == 3);    // c is false, b is 4
            c = (a > 2 || ++b == 3);    // c is false, b is 4
            c = (a > 2 | ++b == 3);     // c is false, b is 5
            return c;
        }
    }

}
