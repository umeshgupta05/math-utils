package com.mathutils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PrimeUtils {

    private PrimeUtils() {
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; (long) i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(int n) {
        if (n < 2) {
            return 2;
        }
        if (n >= Integer.MAX_VALUE - 2) {
            throw new ArithmeticException("No next prime representable in int range.");
        }

        int candidate = n + 1;
        if (candidate % 2 == 0 && candidate != 2) {
            candidate++;
        }

        while (candidate > 0 && candidate <= Integer.MAX_VALUE) {
            if (isPrime(candidate)) {
                return candidate;
            }
            candidate += 2;
            if (candidate < 0) {
                break;
            }
        }

        throw new ArithmeticException("No next prime representable in int range.");
    }

    public static int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        boolean[] composite = new boolean[n + 1];
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (!composite[i]) {
                count++;
                if ((long) i * i <= n) {
                    for (int multiple = i * i; multiple <= n; multiple += i) {
                        composite[multiple] = true;
                    }
                }
            }
        }

        return count;
    }

    public static List<Integer> primesUpTo(int n) {
        if (n < 2) {
            return Collections.emptyList();
        }

        boolean[] composite = new boolean[n + 1];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (!composite[i]) {
                primes.add(i);
                if ((long) i * i <= n) {
                    for (int multiple = i * i; multiple <= n; multiple += i) {
                        composite[multiple] = true;
                    }
                }
            }
        }

        return primes;
    }
}
