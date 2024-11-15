package test;

import main.PrimeChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTest {

    private final PrimeChecker primeChecker = new PrimeChecker();

    @Test
    public void testIsPrimeWithPrimeNumber() {
        assertTrue(primeChecker.isPrime(7), "7 should be a prime number");
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        assertFalse(primeChecker.isPrime(8), "8 is not a prime number");
    }

    @Test
    public void testIsPrimeWithNegativeNumber() {
        assertFalse(primeChecker.isPrime(-3), "-3 is not a prime number");
    }

    @Test
    public void testIsPrimeWithZero() {
        assertFalse(primeChecker.isPrime(0), "0 is not a prime number");
    }

    @Test
    public void testIsPrimeWithOne() {
        assertFalse(primeChecker.isPrime(1), "1 is not a prime number");
    }
}
