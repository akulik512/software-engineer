package core.list;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        //creating vector
        Vector v = new Vector();

        //creating vector with specified capacity
        Vector vec = new Vector(60);

        //creating vector with specified capacity and incremental capacity
        Vector vec1 = new Vector(100, 5);

        //creating vector with specified collection
        //Vector vec2 = new Vector(Collection c);

        //to add elements in Vector
        v.add(10);
        v.addElement("Hello");
        System.out.println(v);

        //to remove element from vector
        v.remove(0);
        System.out.println(v);
        System.out.println(v.elementAt(0));

        //to get elements
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.get(0));

        //size();
        //capacity();
    }

}
