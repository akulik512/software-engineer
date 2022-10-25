package org.akulik.leetcode.newusers;

// 1342. Number of Steps to Reduce a Number to Zero
// https://youtu.be/iVd7KWccHYQ
public class NumberOfStepsToReduceNumberToZero {

    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            count++;
        }
        return count;
    }

}
