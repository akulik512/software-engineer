package core.array;

public class ElementAssignmentsDemo6 {

    public static void main(String[] args) {
        //Primitive array: holding boolean, byte, char, short, long, int, float, double
        int[] x = new int[3];
        //adding char in int array, it can be promoted to int
        x[0] = 'a';
        System.out.println(x[0]);
        byte b = 2;
        x[1] = b;

        //Object array
        Object[] objArray = new Object[5];
        objArray[0] = new Object();
        //String is sub-class of Object
        objArray[1] = "";

        //Abstract class type arrays
        //cannot hold the number class object, because Number is an abstract class
        Number[] numArray = new Number[3];
        //can store subclass objects like Integer, Byte
        numArray[0] = Integer.valueOf(1);
        numArray[1] = Byte.valueOf("2");

        //Interface type arrays
        //can hold only those class objects which are implementing this interface
        Runnable[] r = new Runnable[5];
        r[0] = new Thread();
        System.out.println(r[1]);

    }

}
