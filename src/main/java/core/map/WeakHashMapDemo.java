package core.map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) throws InterruptedException {

        //HashMap m = new HashMap();
        WeakHashMap m = new WeakHashMap();
        Temp t = new Temp();
        m.put(t, "element");
        System.out.println(m);

        t = null;        //t will be available for garbage collection

        //calling garbage collector
        System.gc();

        Thread.sleep(3000);
        System.out.println(m);
    }

}
