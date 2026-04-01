package com.mathutils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ModularArithmeticTest {

    @Test
    void modPowShouldComputeFastExponentiation() {
        assertEquals(24L, ModularArithmetic.modPow(2, 10, 1000));
        assertEquals(1L, ModularArithmetic.modPow(5, 0, 13));
        assertEquals(4L, ModularArithmetic.modPow(-2, 2, 5));
    }

    @Test
    void modPowShouldValidateInputs() {
        assertThrows(IllegalArgumentException.class, () -> ModularArithmetic.modPow(2, -1, 5));
        assertThrows(IllegalArgumentException.class, () -> ModularArithmetic.modPow(2, 3, 0));
    }

    @Test
    void modInverseShouldComputeMultiplicativeInverse() {
        assertEquals(4L, ModularArithmetic.modInverse(3, 11));
        assertEquals(7L, ModularArithmetic.modInverse(-3, 11));
    }

    @Test
    void modInverseShouldFailWhenNoInverseExists() {
        assertThrows(ArithmeticException.class, () -> ModularArithmetic.modInverse(6, 9));
    }
}
