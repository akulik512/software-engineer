package com.akulik.lab.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx {
  public static void main(String[] args) {
    // -------------------- Specific type
    List<MyInterface> list = new ArrayList<>();
    list.add(new MyInterfaceImpl());

    MyInterface myInterface = list.get(0);
    myInterface.handle();
    // Error!!
    // coolInterface.myPersonalMethod();

    // --------------------  Wildcard \
    // Wildcard is read-only!
    List<?> wildCard = List.of(new MyInterfaceImpl());
    Object o = wildCard.get(0);
  }
}
