package core.array;

public class ArraysDemo3 {

    public static void main(String[] args) {
        //declaration
        int[] x;
		/* Cannot initialize with {} after declaration,
		x= {1,2,3};
		*/

        //declaration, creation and initialization at the same time.
        int[] y = {1, 2, 3, 4, 5};

        //declaration and creation of array.
        int[] z = new int[3];
        //If we don't initialize elements manually, elements get intialized with their default values
        System.out.println(z[0]);
        System.out.println(z[1]);
        System.out.println(z[2]);

        //initialization
        z[0] = 10;
        z[1] = 20;
        z[2] = 30;

        //printing values of arrays
        for (int ele : z) {
            System.out.println(ele);
        }

        //printing reference variable z
        System.out.println(z);

        //--------------------

        //declaring 2-D array
        int[][] a;

        //declaring and creating 2-D array with base size 2
        int[][] b = new int[2][];
        //there is nothing at the 0th position of b.
        System.out.println(b[0]);
        //System.out.println(b[0][0]);	//null pointer exception
        b[0] = new int[2];
        b[1] = new int[3];
        System.out.println(b[0][0]);

        b[0][0] = 55;
        System.out.println(b[0][0]);

        int[][] c = {{1, 2, 3}, {6, 7}};

        //printing 2-D array
        for (int[] array : c) {
            for (int ele : array) {
                System.out.println(ele);
            }
        }

    }

}
