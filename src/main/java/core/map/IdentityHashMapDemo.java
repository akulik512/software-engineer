package core.map;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

  public static void main(String[] args) {

    //HashMap<Integer,String> m = new HashMap<>();
    IdentityHashMap<Integer, String> m = new IdentityHashMap<>();
    Integer a = Integer.valueOf(10);
    Integer b = Integer.valueOf(10);
    m.put(a, "First");
    m.put(b, "Second");
    System.out.println(m);
  }

}
