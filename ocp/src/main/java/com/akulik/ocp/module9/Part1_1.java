package com.akulik.ocp.module9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part1_1 {

  public static void main(String[] args) {
    System.out.println("\nNT --Different way to create list");
    CreateListObject createListObject = new CreateListObject();
    createListObject.result();

    System.out.println("\nNT --Remove operation behaviours");
    RemoveOperationExample removeOperationExample = new RemoveOperationExample();
    removeOperationExample.result();
  }

  private static class CreateListObject {

    private void result() {
      CreateList createList = new CreateList();
      createList.result();
      ;
    }

    // Difference between List.of and Arrays.asList
    private static class CreateList {

      private void result() {
        showImmutable();
        showNull();
        showContains();
        showReflectedChanges();
      }

      private void showImmutable() {
        System.out.println("\n-- 1");

        List<Integer> asList = Arrays.asList(1, 2, null);
        System.out.println("Original asList: " + asList);
        asList.set(1, 10); // OK
        System.out.println("Modified asList: " + asList);

        List<Integer> of = List.of(1, 2, 3);
        System.out.println("Original of: " + of);
        // System.out.println("Modified of: " + of.set(1, 10)); // Fails with
        // UnsupportedOperationException
      }

      private void showNull() {
        System.out.println("\n-- 2");

        List<Integer> asList = Arrays.asList(1, 2, null); // OK
        System.out.println("Original asList: " + asList);

        // List<Integer> of = List.of(1, 2, null); // Fails with NullPointerException
      }

      private void showContains() {
        System.out.println("\n-- 3");

        List<Integer> asList = Arrays.asList(1, 2, 3);
        System.out.println("Original asList: " + asList.contains(null)); // Returns false

        List<Integer> of = List.of(1, 2, 3);
        // of.contains(null); // Fails with NullPointerException
      }

      private void showReflectedChanges() {
        System.out.println("\n-- 4");

        Integer[] array1 = {1, 2, 3};
        List<Integer> asList = Arrays.asList(array1);
        System.out.println("Original asList: " + asList);
        array1[1] = 10;
        System.out.println("Modified asList: " + asList); // Prints [1, 10, 3]

        Integer[] array2 = {1, 2, 3};
        List<Integer> of = List.of(array2);
        System.out.println("Original of: " + of);
        array2[1] = 10;
        System.out.println("Modified of: " + of); // Prints [1, 2, 3]
      }
    }
  }

  private static class RemoveOperationExample {

    private void result() {
      List<Object> list = new ArrayList<>();
      list.add(1);
      list.add("test");
      list.add("test");
      list.add(2);
      System.out.println("Original list: " + list);

      list.remove("test");
      System.out.println("Modified list: " + list);
    }
  }
}
