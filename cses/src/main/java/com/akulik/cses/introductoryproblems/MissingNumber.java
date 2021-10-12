package com.akulik.cses.introductoryproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MissingNumber {

  public static void main(String[] args) throws IOException {
    final InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    final BufferedReader br = new BufferedReader(inputStreamReader);
    final StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int[] input = new int[n + 1];
    String str = br.readLine();
    String[] in = str.split("\\s");

    for (int i = 0; i < n - 1; i++) input[Integer.parseInt(in[i])] = 1;

    for (int i = 1; i < n + 1; i++) {
      if (input[i] == 0) System.out.print(i);
    }
  }

}
