package udemy;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap m = new TreeMap();

        TreeMap m1 = new TreeMap(new MySorting());

        SortedMap s = new TreeMap();
        TreeMap m2 = new TreeMap(s);

        Map m4 = new HashMap();
        TreeMap m3 = new TreeMap(m4);

        m.put(23, "");
        m.put(10, "");
        m.put(10, "Basics");
        m.put(11, "Strong");

        m1.put("John", 10);
        m1.put("Shiva", 10);
        m1.put("Rohn", 10);

        System.out.println(m1);
    }

}
