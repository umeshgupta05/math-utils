package com.mathutils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class FactorUtils {

    private FactorUtils() {
    }

    public static List<Integer> getFactors(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive.");
        }

        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();

        for (int i = 1; (long) i * i <= n; i++) {
            if (n % i == 0) {
                small.add(i);
                if (i != n / i) {
                    large.add(n / i);
                }
            }
        }

        Collections.reverse(large);
        small.addAll(large);
        return small;
    }

    public static Map<Integer, Integer> primeFactorization(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("n must be greater than 1.");
        }

        Map<Integer, Integer> factors = new LinkedHashMap<>();
        int value = n;

        while (value % 2 == 0) {
            factors.merge(2, 1, Integer::sum);
            value /= 2;
        }

        for (int p = 3; (long) p * p <= value; p += 2) {
            while (value % p == 0) {
                factors.merge(p, 1, Integer::sum);
                value /= p;
            }
        }

        if (value > 1) {
            factors.merge(value, 1, Integer::sum);
        }

        return factors;
    }
}
