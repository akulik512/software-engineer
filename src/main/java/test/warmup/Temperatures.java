package test.warmup;

public class Temperatures {

  /*
   * Find closest temperature to zero
   * */
  public static int computeClosestToZero(int[] temperatures) {
    if (temperatures.length == 0) {
      return 0;
    }

    int closestTemperature = temperatures[0];

    for (int i = 1; i < temperatures.length; i++) {
      int currentTemperature = temperatures[i];
      if (Math.abs(currentTemperature) < Math.abs(closestTemperature) ||
          (Math.abs(currentTemperature) == Math.abs(closestTemperature)
              && currentTemperature > closestTemperature)) {
        closestTemperature = currentTemperature;
      }
    }

    return closestTemperature;
  }

  public static void main(String[] args) {
    int[] temperatures1 = {-5, 2, -8, 3, 0};
    System.out.println(computeClosestToZero(temperatures1)); // Output: 0

    int[] temperatures2 = {-5, 5, -8};
    System.out.println(computeClosestToZero(temperatures2)); // Output: 5
  }
}
