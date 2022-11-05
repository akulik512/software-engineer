package org.akulik.leetcode.amazon.assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class OptimizingBoxWeights {

    public static List<Integer> minimalHeaviestSetA(List<Integer> arr) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));

        long totalWeight = 0;
        for (Integer item : arr) {
            totalWeight += item;
            priorityQueue.offer(item);
        }

        List<Integer> list = new ArrayList<>();

        long currentWeight = 0;
        int i = 0;
        while (i < arr.size()) {
            int highWeight = priorityQueue.poll();
            currentWeight += highWeight;
            list.add(highWeight);

            if (currentWeight > totalWeight - currentWeight) {
                break;
            }

            i++;
        }

        Collections.reverse(list);
        return list;
    }

}
