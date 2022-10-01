package org.akulik.ocp.leetcode.ocp.module9;

import java.util.HashSet;
import java.util.Set;

public class Part1_2 {

  public static void main(String[] args) {
    Set<String> stringSet = new HashSet<>();
    stringSet.add(null);
    stringSet.add("123");
    stringSet.add(null);
    stringSet.add("123");
    stringSet.add(null);
    System.out.println(stringSet);
  }
}
