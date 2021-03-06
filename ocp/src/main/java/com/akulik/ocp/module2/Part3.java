package com.akulik.ocp.module2;

public class Part3 {

  public static void main(String[] args) {
    ConditionalOperators conditionalOperators = new ConditionalOperators();
    conditionalOperators.result();

    ShortCircuitEvaluation shortCircuitEvaluation = new ShortCircuitEvaluation();
    shortCircuitEvaluation.result();

    SwitchEx switchEx = new SwitchEx();
    switchEx.result();
  }

  private static class ConditionalOperators {
    private void result() {
      int a = 3, b = 2;
      boolean c = false;

      c = (a == b); // c is false
      c = !(a == b); // c is true
      c = (a != b); // c is false
      c = (a > b); // c is true
      c = (a >= b); // c is true
      c = (a < b); // c is false
      c = (a <= b); // c is false

      c = (a > b && b == 2); // c is true
      c = (a > b && b == 2); // c is true
      c = (a < b && b == 2); // c is false
      c = (a < b || b == 2); // c is true
      c = (a < b || b == 3); // c is false

      // For Exclusive OR, either part has to be true,
      // and the other part has to be false for the overall result to become true.
      c = (a > b ^ b == 2); // c is false
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
    private void result() {
      int a = 3, b = 2;
      boolean c = false;

      c = (a > 2 && ++b == 3); // c is true, b is 3
      c = (a > 2 && ++b == 3); // c is false, b is 3
      c = (a > 2 || ++b == 3); // c is false, b is 4
      c = (a > 2 || ++b == 3); // c is false, b is 4
      c = (a > 2 | ++b == 3); // c is false, b is 5
    }
  }

  private static class SwitchEx {
    private void result() {
      int a = 1;
      switch (a) {
        case 1:
        case 2:
        case 3:
          System.out.println("Unusual case example!");
          break;
        case 5:
          System.out.println("Usual switch!");
          break;
      }
    }
  }
}
