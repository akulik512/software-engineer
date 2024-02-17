package core.list.cursor;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CursorsEnumDemo {

    public static void main(String[] args) {

        Vector v = new Vector();

        System.out.println("Enter the elements :");

        for (int i = 0; i <= 8; i++) {
            Scanner s = new Scanner(System.in);
            Integer data = s.nextInt();
            v.addElement(data);
        }

        System.out.println("Vector : " + v);

        //creating enumeration object equivalent to vector v
        Enumeration e = v.elements();

        //hasMoreElement checks enumeration object has more elements or not
        while (e.hasMoreElements()) {
            //nextElement returns next element and moves cursor by 1
            Integer element = (Integer) e.nextElement();

            if (element % 3 == 0) {
                System.out.println(element);
            }
        }
    }
}
