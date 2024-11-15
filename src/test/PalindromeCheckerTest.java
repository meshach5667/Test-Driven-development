package test;

import main.PalindromeChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeCheckerTest {

    private final PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    public void testIsPalindromeWithPalindromeString() {
        assertTrue(palindromeChecker.isPalindrome("madam"), "madam is a palindrome");
    }

    @Test
    public void testIsPalindromeWithNonPalindromeString() {
        assertFalse(palindromeChecker.isPalindrome("example"), "example is not a palindrome");
    }

    @Test
    public void testIsPalindromeWithMixedCase() {
        assertTrue(palindromeChecker.isPalindrome("RaceCar"), "RaceCar is a palindrome (case insensitive)");
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        assertTrue(palindromeChecker.isPalindrome(""), "Empty string is considered a palindrome");
    }

    @Test
    public void testIsPalindromeWithNull() {
        assertFalse(palindromeChecker.isPalindrome(null), "null is not a palindrome");
    }
}
