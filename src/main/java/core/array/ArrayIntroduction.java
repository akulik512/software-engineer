package core.array;

public class ArrayIntroduction {

    public static void main(String[] args) {
        int[] x = new int[1000];
        System.out.println("Class name: " + x.getClass().getName());

        //Zero as size
        int[] y = new int[0];
        System.out.println("Zero as size: " + y.length);

        //character as size
        //allowed data types for an int array: byte,short,char and int
        int[] z = new int['a'];

        //negative array size
        //int[] p = new int[-1];

        //size of an int array cannot be more than this:214748364
        //214748364*4 memory required to create this array.
        int[] q = new int[214748364];
        System.out.println("214748364 as size: " + q.length);
    }

}
