package com.akulik.cses.introductoryproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Consider an algorithm that takes as input a positive integer n.
 * If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one.
 * The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
 * 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 * */
public class WeirdAlgorithm {

  public static void main(String[] args) {
    try (final BufferedReader bufferedReader =
        new BufferedReader(new InputStreamReader(System.in))) {
      final StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
      long number = Integer.parseInt(stringTokenizer.nextToken());

      while (number != 1) {
        System.out.printf("%d ", number);
        if (number % 2 == 0) {
          number = number / 2;

        } else {
          number = number * 3 + 1;
        }
      }

      System.out.print(number);
    } catch (final IOException e) {
      e.printStackTrace();
    }
  }

}
