package core.set;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        //creating treeSet
        TreeSet ts = new TreeSet();

        //creating treeSet by passing comparator object
        //TreeSet ts1 = new TreeSet(Comparator c);

        SortedSet s = new TreeSet();
        //equivalent treeSet of sortedSet
        TreeSet ts2 = new TreeSet(s);

        HashSet hs = new HashSet();
        //equivalent treeSet of HashSet
        TreeSet ts3 = new TreeSet(hs);

        //treeSet with generics syntax
        TreeSet<Employee> ts4 = new TreeSet<Employee>();
        ts4.add(new Employee("John", 30000));
    }

}
