package com.akulik.usecase;

import java.util.ArrayList;
import java.util.List;

public class BatchService {

    public List<List<Book>> splitIntoBatches(final List<Book> books, final int maxElementNumberInBatch) {
        final List<List<Book>> batches = new ArrayList<>();

        final int listSize = books.size();

        for (int i = 0; i < listSize; i += maxElementNumberInBatch) {
            final List<Book> subList = books.subList(i, Math.min(listSize, i + maxElementNumberInBatch));
            batches.add(subList);
        }

        return batches;
    }

}
