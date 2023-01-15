package org.akulik.interview.amazon;

import java.util.List;

public class GiftingGroups {

    public static int countGroups(List<String> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }

        int count = 0;
        int[][] matrix = new int[arrayList.size()][arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            String row = arrayList.get(i);
            for (int j = 0; j < row.length(); j++) {
                matrix[i][j] = Integer.parseInt(Character.toString(row.charAt(j)));
            }
        }

        boolean[] isReached = new boolean[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            if (!isReached[i]) {
                alignedGroups(matrix, isReached, i);
                count++;
            }
        }

        return count;
    }

    private static void alignedGroups(int[][] matrix, boolean[] isReached, int v) {
        isReached[v] = true;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[v][i] == 1 && !isReached[i]) alignedGroups(matrix, isReached, i);
        }
    }

}
