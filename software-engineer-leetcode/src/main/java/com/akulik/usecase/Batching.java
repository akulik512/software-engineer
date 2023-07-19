package com.akulik.usecase;

import java.util.ArrayList;
import java.util.List;

public class Batching {

    public List<List<Book>> doBatches(final List<Book> books, final int maxElementNumberInBatch) {
        final List<List<Book>> batches = new ArrayList<>();

        final int originalListSize = books.size();

        for (int startPoint = 0; startPoint < originalListSize; startPoint += maxElementNumberInBatch) {
            final List<Book> subList = books.subList(startPoint, Math.min(originalListSize, startPoint + maxElementNumberInBatch));
            batches.add(subList);
        }

        return batches;
    }

}
