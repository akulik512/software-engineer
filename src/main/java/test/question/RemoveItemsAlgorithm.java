package test.question;

import java.util.ArrayList;
import java.util.List;

public class RemoveItemsAlgorithm {

  private static void removeReversed(List<String> listA, List<String> listB) {
    List<String> listAItemsForRemoving = new ArrayList<>();
    List<String> listBItemsForRemoving = new ArrayList<>();

    for (String str1 : listA) {
      String reversedValue = new StringBuilder(str1).reverse().toString();

      for (String str2 : listB) {
        if (str2.equals(reversedValue)) {
          listBItemsForRemoving.add(str2);
        }
      }
    }

    for (String str1 : listB) {
      String reversedValue = new StringBuilder(str1).reverse().toString();

      for (String str2 : listA) {
        if (str2.equals(reversedValue)) {
          listAItemsForRemoving.add(str2);
        }
      }
    }

    listA.removeAll(listAItemsForRemoving);
    listB.removeAll(listBItemsForRemoving);
  }

  public static void main(String[] args) {
    List<String> listA = new ArrayList<>();
    listA.add("loop");
    listA.add("hello");
    listA.add("time");
    listA.add("smart");
    listA.add("world");
    listA.add("smart");

    List<String> listB = new ArrayList<>();
    listB.add("pool");
    listB.add("emit");
    listB.add("aloha");
    listB.add("emit");
    listB.add("trams");

    removeReversed(listA, listB);

    System.out.println("listA has: " + listA);
    System.out.println("listB has: " + listB);
  }
}
