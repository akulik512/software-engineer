package issues.test;

public class LargestNumberFinder {

  public static int findLargest(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
      throw new IllegalArgumentException("Input array must not be empty.");
    }

    int largest = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > largest) {
        largest = numbers[i];
      }
    }

    return largest;
  }

  public static void main(String[] args) {
    int[] numbers = {5, -10, 20, 8, 15, -3};
    int result = findLargest(numbers);
    System.out.println("The largest number is: " + result);
  }

}
