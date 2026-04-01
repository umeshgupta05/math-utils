# Math Utils Library

Production-ready Java utility library for prime operations, number theory, factorization, and modular arithmetic.

## Features

- Prime checking and next prime lookup
- Prime counting using Sieve of Eratosthenes
- GCD and LCM for int and long
- Sorted factor generation and prime factorization
- Fast modular exponentiation and modular inverse

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

## Installation

## Publish Publicly

If you want other developers to use this library just by adding a dependency, use one of these options:

### Option A: JitPack (Fastest, easiest)

1. Create a public GitHub repository and push your code.
2. Create a Git tag and GitHub release:

```bash
git tag v1.0.0
git push origin v1.0.0
```

3. Open JitPack and trigger a build for your repository.
4. Consumers add this to their Maven project:

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>com.github.YOUR_GITHUB_USERNAME</groupId>
    <artifactId>math-utils</artifactId>
    <version>v1.0.0</version>
  </dependency>
</dependencies>
```

### Option B: Maven Central (Best for professional/public ecosystem use)

This is closest to npm public registry quality and discoverability.

1. Use a globally unique groupId (recommended: `io.github.YOUR_GITHUB_USERNAME`).
2. Add required metadata in `pom.xml` (license, SCM, developers, URL).
3. Generate and configure GPG signing keys.
4. Create a Sonatype Central Publisher account and token.
5. Publish using Maven deploy.

Consumers can then use your package without adding a custom repository:

```xml
<dependency>
  <groupId>io.github.YOUR_GITHUB_USERNAME</groupId>
  <artifactId>math-utils</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Maven (JitPack)

1. Push this repository to GitHub.
2. Go to JitPack and build your repository.
3. Add dependency:

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>com.github.YOUR_GITHUB_USERNAME</groupId>
    <artifactId>math-utils</artifactId>
    <version>v1.0.0</version>
  </dependency>
</dependencies>
```

### Local JAR

```bash
mvn clean package
```

Then use `target/math-utils-1.0.0.jar` in any Java project.

## Quick Usage

```java
import com.mathutils.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(PrimeUtils.isPrime(17));          // true
        System.out.println(NumberUtils.gcd(12, 18));         // 6
        System.out.println(NumberUtils.lcm(12, 18));         // 36
        System.out.println(ModularArithmetic.modPow(2, 10, 1000)); // 24
    }
}
```

## API Snapshot

- `PrimeUtils.isPrime(int n)`
- `PrimeUtils.nextPrime(int n)`
- `PrimeUtils.countPrimes(int n)`
- `PrimeUtils.primesUpTo(int n)`
- `NumberUtils.gcd(int a, int b)` / `NumberUtils.gcd(long a, long b)`
- `NumberUtils.lcm(int a, int b)` / `NumberUtils.lcm(long a, long b)`
- `FactorUtils.getFactors(int n)`
- `FactorUtils.primeFactorization(int n)`
- `ModularArithmetic.modPow(long base, long exp, long mod)`
- `ModularArithmetic.modInverse(long value, long mod)`

## Run Tests

```bash
mvn test
```

## Naming Ideas

- MathX
- NumCore
- PrimeKit
- AlgoMath

## License

Use MIT License if publishing openly.
