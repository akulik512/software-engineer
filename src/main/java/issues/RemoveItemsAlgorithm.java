package issues;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveItemsAlgorithm {

  private static void removeReversed(List<String> listA, List<String> listB) {
    List<String> listAItems = new ArrayList<>();
    List<String> listBItems = new ArrayList<>();

    for (String str1 : listA) {
      String reversedValue = new StringBuilder(str1).reverse().toString();

      Iterator<String> iteratorB = listB.iterator();
      while (iteratorB.hasNext()) {
        String str2 = iteratorB.next();
        if (str2.equals(reversedValue)) {
          listBItems.add(str2);
          iteratorB.remove();
        }
      }
    }

    for (String str1 : listB) {
      String reversedValue = new StringBuilder(str1).reverse().toString();

      Iterator<String> iteratorA = listA.iterator();
      while (iteratorA.hasNext()) {
        String str2 = iteratorA.next();
        if (str2.equals(reversedValue)) {
          listAItems.add(str2);
          iteratorA.remove();
        }
      }
    }

    listA.removeAll(listAItems);
    listB.removeAll(listBItems);
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
