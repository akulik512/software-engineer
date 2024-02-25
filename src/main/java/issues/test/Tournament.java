package issues.test;

public class Tournament {

  static int count(int n) {
    long result = (long) n * (n - 1) / 2;
    return (int) result;
  }

  public static void main(String[] args) {
    System.out.println(Tournament.count(4));
    System.out.println(Tournament.count(10000));
  }
}
