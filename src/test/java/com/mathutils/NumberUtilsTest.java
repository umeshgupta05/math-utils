package com.mathutils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {

    @Test
    void gcdShouldHandlePositiveAndNegativeValues() {
        assertEquals(6, NumberUtils.gcd(12, 18));
        assertEquals(6, NumberUtils.gcd(-12, 18));
        assertEquals(5, NumberUtils.gcd(0, 5));
    }

    @Test
    void gcdLongShouldWork() {
        assertEquals(90L, NumberUtils.gcd(1234567890L, 9876543210L));
    }

    @Test
    void lcmShouldHandleZeroAndNormalValues() {
        assertEquals(0, NumberUtils.lcm(0, 5));
        assertEquals(36, NumberUtils.lcm(12, 18));
    }

    @Test
    void lcmShouldThrowOnIntOverflow() {
        assertThrows(ArithmeticException.class, () -> NumberUtils.lcm(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
    }

    @Test
    void lcmLongShouldWork() {
        assertEquals(42L, NumberUtils.lcm(21L, 6L));
    }
}
