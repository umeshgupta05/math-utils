package com.mathutils;

public final class NumberUtils {

    private NumberUtils() {
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        long gcd = gcd(a, b);
        long result = Math.abs((a / gcd) * (long) b);
        if (result > Integer.MAX_VALUE) {
            throw new ArithmeticException("LCM overflows int range.");
        }
        return (int) result;
    }

    public static long lcm(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        long gcd = gcd(a, b);
        return Math.abs((a / gcd) * b);
    }
}
