package com.example.project;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class IntRange {
    private final int start;
    private final int end;
    private final int step;

    public IntRange(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public IntStream stream() {
        return IntStream.iterate(start, i -> i + step)
                .limit((end - start + step - 1) / step);
    }

    public void forEach(IntConsumer action) {
        stream().forEach(action);
    }
}

