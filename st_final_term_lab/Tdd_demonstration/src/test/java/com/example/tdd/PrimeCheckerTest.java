package com.example.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {
    private PrimeChecker primeChecker;

    @BeforeEach
    public void setUp() {
        primeChecker = new PrimeChecker();
    }

//    Testing the Algorithm

    @Test
    public void testIsPrime_NegativeNumber() {
        boolean result = primeChecker.isPrime(-1);
        Assertions.assertFalse(result, "Negative Numbers are not prime");
    }

    @Test
    public void testIsPrime_Zero() {
        boolean result = primeChecker.isPrime(0);
        Assertions.assertFalse(result, "Zero is not prime.");
    }

    @Test
    public void testIsPrime_One() {
        boolean result = primeChecker.isPrime(1);
        Assertions.assertFalse(result, "One is not prime.");
    }

    @Test
    public void testIsPrime_SmallestPrime() {
        boolean result = primeChecker.isPrime(2);
        Assertions.assertTrue(result, "Two is the smallest prime number.");
    }

    @Test
    public void testIsPrime_LargerPrime() {
        boolean result = primeChecker.isPrime(17);
        Assertions.assertTrue(result, "Seventeen is a prime number.");
    }

    @Test
    public void testIsPrime_NonPrimeNumber() {
        boolean result = primeChecker.isPrime(4);
        Assertions.assertFalse(result, "Four is not a prime number.");
    }


}
