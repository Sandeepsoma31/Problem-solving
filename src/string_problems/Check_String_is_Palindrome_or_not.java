package string_problems;

public class Check_String_is_Palindrome_or_not {
	
	public static void main(String[] args) {
		
		String str = "ABCCBA";
		
		if(isPalindrome(str)) {
			System.out.println("Yes! given String is palindrome");
		}else {
			System.out.println("No! given String is not palindrome");
		}
		
	}
	
	public static boolean isPalindrome(String str) {
		
		int start = 0;
		int end = str.length()-1;
		
		while(start<end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			
			end --;
			start ++;
		}
		
		return true;
	}

}
