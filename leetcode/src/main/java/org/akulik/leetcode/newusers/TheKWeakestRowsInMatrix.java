package org.akulik.leetcode.newusers;

import java.util.PriorityQueue;

// 1337. The K Weakest Rows in a Matrix
// Simple - https://youtu.be/_fVVzsIqGvE
// Advanced - https://youtu.be/RAKbzdE9B0I
// Time: O(M*N)
// Space: O(M)
// M : rows N : Cols
// Note - binary search instead of loops
public class TheKWeakestRowsInMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) ->
                a[0] != b[0]
                        ? b[0] - a[0]
                        : b[1] - a[1]
        );

        int[] result = new int[k];

        for (int i = 0; i < mat.length; i++) {
            int soldiers = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) soldiers++;
                else break;
            }
            queue.offer(new int[]{soldiers, i});
        }

        while (queue.size() > k) {
            queue.poll();
        }

        while (k > 0) {
            result[--k] = queue.poll()[1];
        }

        return result;
    }

}
