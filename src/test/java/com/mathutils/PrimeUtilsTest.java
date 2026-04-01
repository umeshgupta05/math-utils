package com.mathutils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class PrimeUtilsTest {

    @Test
    void isPrimeShouldHandleBasicCases() {
        assertFalse(PrimeUtils.isPrime(-1));
        assertFalse(PrimeUtils.isPrime(0));
        assertFalse(PrimeUtils.isPrime(1));
        assertTrue(PrimeUtils.isPrime(2));
        assertTrue(PrimeUtils.isPrime(3));
        assertFalse(PrimeUtils.isPrime(9));
        assertTrue(PrimeUtils.isPrime(17));
    }

    @Test
    void nextPrimeShouldReturnCorrectPrime() {
        assertEquals(2, PrimeUtils.nextPrime(0));
        assertEquals(17, PrimeUtils.nextPrime(14));
    }

    @Test
    void nextPrimeShouldThrowNearMaxInt() {
        assertThrows(ArithmeticException.class, () -> PrimeUtils.nextPrime(Integer.MAX_VALUE - 1));
    }

    @Test
    void countPrimesShouldUseSieveCorrectly() {
        assertEquals(0, PrimeUtils.countPrimes(1));
        assertEquals(4, PrimeUtils.countPrimes(10));
        assertEquals(25, PrimeUtils.countPrimes(100));
    }

    @Test
    void primesUpToShouldReturnExpectedList() {
        assertEquals(List.of(), PrimeUtils.primesUpTo(1));
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19), PrimeUtils.primesUpTo(20));
    }
}
