package core.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

  public static void main(String[] args) {

    NavigableMap<String, Integer> t = new TreeMap<>();
    t.put("ABC", 123);
    t.put("DEF", 456);
    t.put("HIJ", 789);
    t.put("MNO", 546);
    t.put("PQR", 776);
    t.put("XYZ", 775);
    t.put("JKL", 987);
    t.put("STU", 544);
    t.put("LMN", 543);

    System.out.println(t);

    //various methods
    System.out.println(t.ceilingEntry("HIJ"));
    System.out.println(t.floorKey("PQR"));
    System.out.println(t.higherKey("ABC"));
    System.out.println(t.lowerKey("PQR"));
    System.out.println(t.ceilingKey("XYZ"));
    System.out.println(t.descendingKeySet());
    System.out.println(t.descendingMap());
    System.out.println(t.headMap("JKL"));
    System.out.println(t.headMap("JKL", true));
    System.out.println(t.subMap("PQR", "XYZ"));
    System.out.println(t.subMap("ABC", true, "PQR", false));
    System.out.println(t.tailMap("JKL"));
    System.out.println(t.tailMap("PQR", false));
    System.out.println(t.higherEntry("STU"));
    System.out.println(t.navigableKeySet());

  }


}
