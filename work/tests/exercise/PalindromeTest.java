package exercise;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {
    String input1 = "taco cat";
    String input2 = "atco cta";
    String input3 = "ctao atc";
    String input4 = "ctaog atc";

    @Test
    public void palindrome() {
        Assert.assertTrue(Palindrome.isPalindrome(input1));
        Assert.assertTrue(Palindrome.isPalindrome(input2));
        Assert.assertTrue(Palindrome.isPalindrome(input3));
        Assert.assertFalse(Palindrome.isPalindrome(input4));
    }
}
