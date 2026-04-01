package com.mathutils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class FactorUtilsTest {

    @Test
    void getFactorsShouldReturnSortedFactors() {
        assertEquals(List.of(1, 2, 3, 4, 6, 12), FactorUtils.getFactors(12));
        assertEquals(List.of(1, 13), FactorUtils.getFactors(13));
    }

    @Test
    void getFactorsShouldRejectNonPositiveInput() {
        assertThrows(IllegalArgumentException.class, () -> FactorUtils.getFactors(0));
    }

    @Test
    void primeFactorizationShouldReturnExponentMap() {
        assertEquals(Map.of(2, 2, 3, 1, 5, 1), FactorUtils.primeFactorization(60));
        assertEquals(Map.of(13, 1), FactorUtils.primeFactorization(13));
    }

    @Test
    void primeFactorizationShouldRejectSmallInput() {
        assertThrows(IllegalArgumentException.class, () -> FactorUtils.primeFactorization(1));
    }
}
