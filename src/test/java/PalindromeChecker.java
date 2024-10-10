public class PalindromeChecker {

	public boolean isPalindrome(String input) {
		if (input == null) {
			return false;
		}

		String s = input.replaceAll("\\s+", ""); 
		s = s.toLowerCase();

		for (int i = 0; i < s.length() / 2; i++) 
		{
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) 
			{
				return false;
			}
		}
		return true;
	}
}
