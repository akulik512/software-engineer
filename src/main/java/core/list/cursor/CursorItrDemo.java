package core.list.cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorItrDemo {

    public static void main(String[] args) {

        ArrayList<Integer> data = new ArrayList<>();

        data.add(12);
        data.add(23);
        data.add(36);

        //creating iterator object equivalent to ArrayList data
        Iterator itr = data.iterator();

        //hasNext(): returns true if iterator has next element in it
        while (itr.hasNext()) {
            //next(): returns element present next to cursor
            Integer i = (Integer) itr.next();

            if (i % 3 == 0)
                System.out.println(i);
            else
                itr.remove();
        }

        System.out.println(data);
    }

}
