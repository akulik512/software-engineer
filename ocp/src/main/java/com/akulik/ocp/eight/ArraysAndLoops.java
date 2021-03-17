package com.akulik.ocp.eight;

/**
 * 8: Arrays and Loops
 */
public class ArraysAndLoops {
    public static void main(String[] args) {
        // 1
        ArrayExample arrayExample = new ArrayExample();
        arrayExample.result();
        // 2
        Loop loop = new Loop();
        loop.result();
    }

    static private class ArrayExample {
        private void result() {
            System.out.println("\n-- Play with array: ");
            String[] arr = new String[5];
            System.out.println("Length = " + arr.length);
            arr[0] = "Hello!";
            System.out.println("Last valid position = " + (arr.length - 1));

            System.out.println("\n-- Get an element from a multidimensional array: ");
            int[][] matrix = {{4, 1}, {2, 0, 5}};
            System.out.println(matrix[1][2]); // 5

            System.out.println("\n-- Multidimensional array length: ");
            char[][] game = {{'O', 'X', 'X'},
                    {'X', 'X', 'O'},
                    {'O', ' ', 'O'}};
            System.out.println(game.length);

            System.out.println("\n-- Default array initialization: ");
            double[] arr1 = new double[5];
            for (var i : arr1) {
                System.out.println(i);
            }
        }
    }

    static private class Loop {
        private void result() {
            // Interesting iteration case by array
            // See sum += i++
            int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int sum = 1;
            for (int i = 0; i < value.length; sum += i++) {
                System.out.println(sum);
            }
        }
    }
}
