package udemy;

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

        System.out.println("ceilingEntry: " + t.ceilingEntry("HIJ"));
        System.out.println("floorKey: " + t.floorKey("PQR"));
        System.out.println("higherKey: " + t.higherKey("ABC"));
        System.out.println("lowerKey: " + t.lowerKey("PQR"));
        System.out.println("ceilingKey: " + t.ceilingKey("XYZ"));
        System.out.println("descendingKeySet: " + t.descendingKeySet());
        System.out.println("descendingMap: " + t.descendingMap());
        System.out.println("headMap: " + t.headMap("JKL"));
        System.out.println("headMap: " + t.headMap("JKL", true));
        System.out.println("subMap: " + t.subMap("PQR", "XYZ"));
        System.out.println("subMap: " + t.subMap("ABC", true, "PQR", false));
        System.out.println("tailMap: " + t.tailMap("JKL"));
        System.out.println("tailMap: " + t.tailMap("PQR", false));
        System.out.println("higherEntry: " + t.higherEntry("STU"));
        System.out.println("navigableKeySet: " + t.navigableKeySet());
    }

}
