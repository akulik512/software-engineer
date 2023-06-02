package com.akulik.usecase;

import java.util.ArrayList;
import java.util.List;

public class Batching {

    public List<List<Integer>> batch(final List<Integer> list, final int maxBatchCapacity) {
        final List<List<Integer>> batches = new ArrayList<>();

        final int size = list.size();

        for (int i = 0; i < size; i += maxBatchCapacity) {
            final List<Integer> subList = list.subList(i, Math.min(size, i + maxBatchCapacity));
            batches.add(subList);
        }

        return batches;
    }

}
