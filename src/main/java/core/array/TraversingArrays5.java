package core.array;

public class TraversingArrays5 {

    public static void main(String[] args) {
        int[] a = new int[5];

        //using for-each loop
        for (int e : a) {
            System.out.println(e);
        }

        int len = a.length;

        //using for loop
        for (int i = 0; i < len; i++) {
            a[i] = i + 1;
            System.out.println("element at index " + i + " is: " + a[i]);
        }

        //Traversing 2-D array

        int[][] b = new int[2][3];
        //using for-each loop
        for (int[] arr : b) {
            for (int e : arr) {
                System.out.println(e);
            }
        }

        //using for loop
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(b[i][j]);
            }
        }

    }

}
