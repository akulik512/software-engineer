package com.akulik.ocp.module2;

public class Part2 {

  public static void main(String[] args) {
    ArithmeticOperationsAndTypeCasting arithmeticOperationsAndTypeCasting =
        new ArithmeticOperationsAndTypeCasting();
    arithmeticOperationsAndTypeCasting.result();
  }

  private static class ArithmeticOperationsAndTypeCasting {
    private void result() {
      byte a = 127, b = 5;
      // byte c = a + b;      // compilation fails
      int d = a + b; // d is 132
      byte e = (byte) (a + b); // e is -124 (type overflow, because 127 is the max byte value)
      int f = a / b; // f is 25 (a/b is 25 because it is an int)
      float g = a / b; // f is 25.0F (result of the a/b can be implicitly or
      float h = (float) (a / b); // h is 25.0F explicitly casted to float, but a/b is still 25)
      float i = (float) a / b; // i is 25.0F (when either a or b
      float j = a / (float) b; // j is 25.0F is float the a/b becomes float)
      b = (byte) (b + 1); // explicit casting is required, because b + 1 is an int
      b++; // no casting is required for ++ and -- operators

      char x = 'x';
      char y = ++x; // arithmetic operations work with character codes
    }
  }
}
