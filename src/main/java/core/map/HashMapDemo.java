package core.map;

import java.util.HashMap;
import java.util.Map;


public class HashMapDemo {

    public static void main(String[] args) {

        //HashMap with initial capacity 16, 0.75 load factor
        HashMap map = new HashMap();

        Map m = new HashMap();

        //HashMap with specified initial capacity and default load factor
        HashMap map2 = new HashMap(20);

        //HashMap with specified initial capacity and specified load factor
        HashMap map3 = new HashMap(20, 0.9f);

        //Equivalent hashMap from Map
        HashMap map4 = new HashMap(m);

        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Science", 90);
        marks.put("Maths", 80);
        marks.put("English", 80);
        //insertion order is not preserved

        marks.put("FB", 10);
        marks.put("Ea", 10);
        //Hash value of both keys is same, these will be stored to same index bucket

        System.out.println(marks);

        marks.put("Science", 70);
        //this will update the value for key science

        System.out.println(marks.get("Ea"));
        //this will return the value for specified key

        System.out.println(marks.keySet());
        //this will return the set of keys present in hash map

        System.out.println(marks.entrySet());
        //this will return the set of entries present in hash map

        System.out.println(marks.values());
        //this will return the collection of values present in hash map

        System.out.println(marks.clone());
        //this will return the shallow copy of hash map

        System.out.println(marks.containsKey("FB"));
        //this will return the true if specified key is present in hash map

        marks.remove("FB", 10);
        //remove key-value pair if specified key-value pair present in hash map

        //containsValue(),replace()..

        marks.computeIfAbsent("Hello", k -> 1);
        //assign value 1 to key 'hello' only if specified key 'hello' is absent in hash map

        //we can also concatenate value with key,
        HashMap<String, String> hmap = new HashMap<>();
        hmap.computeIfAbsent("Hello", k -> k + " BasicsStrong");
        System.out.println(hmap);

    }
}