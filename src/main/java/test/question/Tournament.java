package test.question;

public class Tournament {

  static int count(int n) {
    /*
     * we can form (n - 1) pairs
     * divide by 2 to consider only unique pairs
     * */
    long result = (long) n * (n - 1) / 2;
    return (int) result;
  }

  public static void main(String[] args) {
    System.out.println(Tournament.count(4));
    System.out.println(Tournament.count(10000));
  }
}
