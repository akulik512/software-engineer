package core.array;

public class VariableAssignments {

  public static void main(String[] args) {
    int[] x = new int[2];
    //assigning x to a
    //no new array is created here
    int[] a = x;
    x[0] = 1;
    System.out.println(x[0]);
    System.out.println(a[0]);
    a[1] = 2;
    System.out.println(x[1]);
    System.out.println(a[1]);

    //------------------

    int[] b = {1, 2, 3};
    int[] c = {11, 22};
    b = c;
    //both b and c will point the same array c
    c = b;

    for (int e : b) {
      System.out.println(e);
    }

    System.out.println("_______________");

    for (int e : c) {
      System.out.println(e);
    }

    //-------------------

    String[] s = new String[3];
    //string array can be promoted to object array
    Object[] objArr = s;

    short[] shorts = new short[2];  //[S
    //int[] ints = shorts;          //[I
  }

}
