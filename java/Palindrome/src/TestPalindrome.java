import static org.junit.Assert.*;

import org.junit.Test;

public class TestPalindrome {

	@Test
	public void testPalindromeTrue(){
		String word = "level";
		assertEquals(true, Palindrome.isPalindrome(word));
	}
	
	@Test
	public void testPalindromeFalse(){
		String word = "mash";
		assertEquals(false, Palindrome.isPalindrome(word));
	}
	
	@Test
	public void testPalindromeNull(){
		String word = null;
		assertEquals(false, Palindrome.isPalindrome(word));
	}
}
