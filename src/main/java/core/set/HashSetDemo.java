package core.set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        //creating hashSet: default size=16, default load factor = 0.75
        HashSet hs = new HashSet();

        //creating hashSet with specified size and default load factor = 0.75
        HashSet hs1 = new HashSet(100);

        //creating hashSet with specified size and load factor
        HashSet hs3 = new HashSet(100, .80f);

        ArrayList l = new ArrayList();
        //creating equivalent hashSet of arrayList
        HashSet hs4 = new HashSet(l);

    }

}
