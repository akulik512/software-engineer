package org.akulik.explore.array.intro;

public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int length = 0;
        int count = 0;

        for (int num : nums) {
            length = String.valueOf(num).length();
            if (length % 2 == 0) {
                ++count;
            }
        }
        return count;
    }

    public int withoutJavaApi(int[] nums) {
        int result = 0;

        for (int num : nums) {
            int countOfDigit = 0;

            while (num != 0) {
                countOfDigit++;
                num /= 10;
            }

            if (countOfDigit % 2 == 0) result++;
        }

        return result;
    }
}
