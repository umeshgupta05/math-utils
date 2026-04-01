# Math Utils Library

Reusable Java utility library for prime operations, number theory, factorization, and modular arithmetic.

## Usage First

### Quick Start

```java
import com.mathutils.*;

public class Main {
    public static void main(String[] args) {
        boolean prime = PrimeUtils.isPrime(17);
        int gcd = NumberUtils.gcd(12, 18);
        int lcm = NumberUtils.lcm(12, 18);
        long modPow = ModularArithmetic.modPow(2, 10, 1000);

        System.out.println(prime);   // true
        System.out.println(gcd);     // 6
        System.out.println(lcm);     // 36
        System.out.println(modPow);  // 24
    }
}
```

### Prime Operations

```java
// Basic prime checks
PrimeUtils.isPrime(2);    // true
PrimeUtils.isPrime(9);    // false

// Find next prime strictly greater than n
PrimeUtils.nextPrime(14); // 17

// Count primes in range [2, n]
PrimeUtils.countPrimes(100); // 25

// List all primes up to n
PrimeUtils.primesUpTo(20); // [2, 3, 5, 7, 11, 13, 17, 19]
```

### GCD and LCM

```java
// int variants
NumberUtils.gcd(12, 18);     // 6
NumberUtils.lcm(12, 18);     // 36

// Handles negative values for gcd
NumberUtils.gcd(-12, 18);    // 6

// long variants for larger values
NumberUtils.gcd(1234567890L, 9876543210L); // 90
NumberUtils.lcm(21L, 6L);                  // 42
```

### Factors and Prime Factorization

```java
// Sorted list of factors
FactorUtils.getFactors(12);   // [1, 2, 3, 4, 6, 12]

// Prime factorization map: prime -> exponent
FactorUtils.primeFactorization(60); // {2=2, 3=1, 5=1}
```

### Modular Arithmetic

```java
// Fast modular exponentiation
ModularArithmetic.modPow(2, 10, 1000); // 24

// Multiplicative inverse (a^-1 mod m), if gcd(a, m) == 1
ModularArithmetic.modInverse(3, 11);   // 4
```

### Input Validation and Errors

- FactorUtils.getFactors(n): n must be positive.
- FactorUtils.primeFactorization(n): n must be greater than 1.
- ModularArithmetic.modPow(base, exp, mod): mod must be positive and exp must be non-negative.
- ModularArithmetic.modInverse(value, mod): mod must be greater than 1 and inverse must exist.
- NumberUtils.lcm(int, int): throws ArithmeticException on int overflow.

## Build and Test

### Build JAR

```bash
mvn clean package
```

Generated artifact:

- target/math-utils-1.0.0.jar

### Run Tests

```bash
mvn test
```

## API Snapshot

- PrimeUtils.isPrime(int n)
- PrimeUtils.nextPrime(int n)
- PrimeUtils.countPrimes(int n)
- PrimeUtils.primesUpTo(int n)
- NumberUtils.gcd(int a, int b)
- NumberUtils.gcd(long a, long b)
- NumberUtils.lcm(int a, int b)
- NumberUtils.lcm(long a, long b)
- FactorUtils.getFactors(int n)
- FactorUtils.primeFactorization(int n)
- ModularArithmetic.modPow(long base, long exp, long mod)
- ModularArithmetic.modInverse(long value, long mod)

## Project Structure

```text
math-utils/
|-- src/main/java/com/mathutils/
|   |-- PrimeUtils.java
|   |-- NumberUtils.java
|   |-- ModularArithmetic.java
|   |-- FactorUtils.java
|
|-- src/test/java/com/mathutils/
|   |-- PrimeUtilsTest.java
|   |-- NumberUtilsTest.java
|   |-- FactorUtilsTest.java
|   |-- ModularArithmeticTest.java
|
|-- pom.xml
|-- README.md
```

## License

Use MIT License if publishing openly.
