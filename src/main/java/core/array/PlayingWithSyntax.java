package core.array;


public class PlayingWithSyntax {

  public static void main(String[] args) {
    int[] x1;    //most precise syntax to follow
    int[] x2;
    int[] x3;

    //int[3] x4;

    int[] x5, x6;
    //int x7[],[]x8;	//we can specify the dimension before variable, but only with the first variable

    int[] x9;
    int[][] x10;

    //---------------

    int[][] x11;    //most precise syntax
    int[][] x12, x13;

    int[][] x14;
    int[][][] x15;

    int[][][] x16, x17;    //both are 3-D array

    //-----------------

    //int [][] x18 = new int [][4];		//must provide base size

    int[][][] x19 = new int[3][4][5];
    int[][][] x20 = new int[3][4][];
    //int [][][] x21 = new int [3][][5];
    //int [][][] x22 = new int [][4][5];
  }

}
