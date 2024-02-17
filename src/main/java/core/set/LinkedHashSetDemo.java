package core.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

  public static void main(String[] args) {
    //creating linkedHashSet of default capacity 16
    LinkedHashSet lhs = new LinkedHashSet();

    //creating linkedHasSet of specified capacity
    LinkedHashSet lhs1 = new LinkedHashSet(30);

    //creating linkedHashSet of specified capacity and specified load factor
    LinkedHashSet lhs2 = new LinkedHashSet(20, 1.00f);

    lhs.add("1");
    lhs.add("6");
    lhs.add("4");
    lhs.add("10");
    System.out.println(lhs);
  }

}
