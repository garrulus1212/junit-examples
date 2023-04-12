package com.example.project;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.stream.IntStream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class IntRangeTests {
    @ParameterizedTest
    @MethodSource("range")
    void testWithRangeMethodSource(int argument) {
        assertNotEquals(9, argument);
    }

    static IntStream range() {
        return new IntRange(10, 30, 2).stream();
    }
}
