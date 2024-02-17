package udemy;

import java.util.WeakHashMap;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        HashMap<String, Integer> marks = new HashMap<>();
//        marks.put("Science", 90);
//        marks.put("Maths", 80);
//        marks.put("English", 90);
//        marks.put("FB", 10);
//        marks.put("Ea", 10);
//        System.out.println();

        WeakHashMap<Temp, String> map = new WeakHashMap<>();
        Temp temp = new Temp();
        map.put(temp, "Hello");
        System.out.println(map);

        temp = null;
        System.gc();
        Thread.sleep(3000);
        System.out.println(map);


    }

}
