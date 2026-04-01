package com.mathutils;

public final class ModularArithmetic {

    private ModularArithmetic() {
    }

    public static long modPow(long base, long exp, long mod) {
        if (mod <= 0) {
            throw new IllegalArgumentException("mod must be positive.");
        }
        if (exp < 0) {
            throw new IllegalArgumentException("exp must be non-negative.");
        }

        long result = 1 % mod;
        long b = floorMod(base, mod);
        long e = exp;

        while (e > 0) {
            if ((e & 1) == 1) {
                result = mulMod(result, b, mod);
            }
            b = mulMod(b, b, mod);
            e >>= 1;
        }

        return result;
    }

    public static long modInverse(long value, long mod) {
        if (mod <= 1) {
            throw new IllegalArgumentException("mod must be greater than 1.");
        }

        long[] egcd = extendedGcd(floorMod(value, mod), mod);
        long gcd = egcd[0];
        if (gcd != 1) {
            throw new ArithmeticException("Inverse does not exist because gcd(value, mod) != 1.");
        }

        return floorMod(egcd[1], mod);
    }

    private static long[] extendedGcd(long a, long b) {
        long oldR = a;
        long r = b;
        long oldS = 1;
        long s = 0;
        long oldT = 0;
        long t = 1;

        while (r != 0) {
            long q = oldR / r;

            long temp = r;
            r = oldR - q * r;
            oldR = temp;

            temp = s;
            s = oldS - q * s;
            oldS = temp;

            temp = t;
            t = oldT - q * t;
            oldT = temp;
        }

        return new long[] {oldR, oldS, oldT};
    }

    private static long floorMod(long x, long mod) {
        long result = x % mod;
        return result < 0 ? result + mod : result;
    }

    private static long mulMod(long a, long b, long mod) {
        long result = 0;
        long x = floorMod(a, mod);
        long y = floorMod(b, mod);

        while (y > 0) {
            if ((y & 1) == 1) {
                result = (result + x) % mod;
            }
            x = (x << 1) % mod;
            y >>= 1;
        }

        return result;
    }
}
