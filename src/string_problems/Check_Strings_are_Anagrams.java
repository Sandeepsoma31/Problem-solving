package string_problems;

import java.util.Arrays;

public class Check_Strings_are_Anagrams {
	
	public static void main(String[] args) {
		
		String str1 = "listen", str2 = "silent";
		
		boolean isAnagram = false;
		
		char[] c1 = str1.toCharArray();
		Arrays.sort(c1);
		
		char[] c2 = str2.toCharArray();
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			isAnagram = true;
		}
		
		System.out.println("Is Anagram: "+isAnagram);
		
	}

}
