package com.crucerne.www.palindromechecker;

public class PalindromeChecker {

	public static boolean isPalindrome(String s)
	{
		final String string = s.toLowerCase();
		// Pointer for the start of the string.
		int left = 0;
		// Pointer for the end of the string.
		int right = string.length();
		
		while (left <= right)
		{
			// Checking whether non-letters are being used. If so, ignore and continue to next character.
			while (left < string.length() && !Character.isLetter(string.charAt(left)))
				{
					left++;
				}
			while (right > 0 && !Character.isLetter(string.charAt(right)))
			{
				right--;
			}
			
			// If the start or end of the string has only 1 non-letter character, return false.
			if (left > string.length() || right < 0)
			{
				return false;
			}
			
			// If the starting character and corresponding end character of the check are different, return false.
			if (string.charAt(left) != string.charAt(right))
			{
				return false;
			}
			
			// Increment the pointers to check the next pair of characters.
			left++;
			right--;
		}
		
		// Is a palindrome, return true.
		return true;
	}

}
