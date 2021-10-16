package com.akulik.cses.introductoryproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * You are given all numbers between 1,2,…,n except one.
 * Your task is to find the missing number.
 *
 * The first input line contains an integer n.
 * The second line contains n−1 numbers.
 * Each number is distinct and between 1 and n (inclusive).
 * */
public class MissingNumber {

  public static void main(String[] args) {
    try (final BufferedReader bufferedReader =
        new BufferedReader(new InputStreamReader(System.in))) {

      final StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
      final int n = Integer.parseInt(st.nextToken());

      int[] input = new int[n + 1];
      String str = bufferedReader.readLine();
      String[] in = str.split("\\s");

      for (int i = 0; i < n - 1; i++) input[Integer.parseInt(in[i])] = 1;

      for (int i = 1; i < n + 1; i++) {
        if (input[i] == 0) System.out.print(i);
      }
    } catch (final IOException ioException) {
      ioException.printStackTrace();
    }
  }
}
