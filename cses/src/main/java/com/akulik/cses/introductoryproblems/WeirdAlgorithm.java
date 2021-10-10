package com.akulik.cses.introductoryproblems;

/*
 * Consider an algorithm that takes as input a positive integer n.
 * If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one.
 * The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
 * 3 - 10 - 5 - 16 - 8 - 4 - 2 - 1
 * */
public class WeirdAlgorithm {

  public void action(final int value) {
    int number = value;
    System.out.printf("%d ", number);
    while (number != 1) {
      if (number % 2 == 0) {
        number = number / 2;
        System.out.printf("%d ", number);
      } else {
        number = (number * 3) + 1;
        System.out.printf("%d ", number);
      }
    }
  }

}
