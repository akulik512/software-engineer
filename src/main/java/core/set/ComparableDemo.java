package core.set;

import java.util.TreeSet;

public class ComparableDemo {

    public static void main(String[] args) {

        //TreeSet<Integer> data = new TreeSet<Integer>();

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
