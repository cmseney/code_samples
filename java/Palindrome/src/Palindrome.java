
// Test whether a word is a palindrome

public class Palindrome {
	
	public static boolean isPalindrome(String word){
		if (word == null) return false;
		int len = word.length();
		String reverse = "";
		
		// Create a reverse string by copying the characters in reverse
		for (int i=len-1; i >= 0; i--){
			reverse += word.charAt(i);
		}

		// Compare the reverse string to the original
		boolean result = word.equals(reverse);
		return result;
	}

	public static void main(String[] args) {
		// String to test palindrome
		String myWord = "levels";		
		boolean checkPalindrome = isPalindrome(myWord);
		System.out.println("Is the word " + myWord + " a palindrome: " + checkPalindrome);
	}

}
