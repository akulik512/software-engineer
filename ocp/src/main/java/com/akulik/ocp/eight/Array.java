package com.akulik.ocp.eight;

/**
 * 8: Arrays and Loops
 */
public class Array {
    // Part 1
    public static void main(String[] args) {
        String[] arr = new String[5];
        System.out.println("Length = " + arr.length);
        arr[0] = "Hello!";
        System.out.println("Last valid position = " + (arr.length - 1));

        int[][] matrix = {{4, 1}, {2, 0, 5}};
        System.out.println(matrix[1][2]); // 5

        char[][] game = {{'O', 'X', 'X'},
                         {'X', 'X', 'O'},
                         {'O', ' ', 'O'}};
        System.out.println(game.length);
    }

}
