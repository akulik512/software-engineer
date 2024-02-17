package core.set;

import core.set.sort.Employee;
import core.set.sort.MySorting;
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
    TreeSet<Employee> ts4 = new TreeSet<>();
    ts4.add(new Employee("John", 30000));

    // --- ComparableDemo ---
    TreeSet<Integer> data = new TreeSet<Integer>(new MySorting());
    data.add(152);
    data.add(185);
    data.add(254);
    data.add(10);
    data.add(132);
    data.add(10);

    System.out.println(data);
  }

}
