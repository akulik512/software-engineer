package issues.warmup;

public class BinarySearch {

  static boolean exists(int[] ints, int k) {
    int left = 0;
    int right = ints.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (ints[mid] == k) {
        return true;
      } else if (ints[mid] < k) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    int[] ints = {-9, 14, 37, 102};

    System.out.println(exists(ints, 102)); // true
    System.out.println(exists(ints, 36));  // false
  }

}

