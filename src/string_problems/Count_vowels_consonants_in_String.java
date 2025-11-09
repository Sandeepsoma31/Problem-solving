package string_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Count_vowels_consonants_in_String {
	
	public static void main(String[] args) {
		
		String str = "Hello World!";
		
		countVowelsAndConsonants(str);
	}

	public static void countVowelsAndConsonants(String str) {
		
		ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		
		int vowelsCount = 0;
		int consonantsCount = 0;
		
		char[] cArr = str.toLowerCase().toCharArray();
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isLetter(cArr[i])) {
				if(vowels.contains(cArr[i])) {
					vowelsCount++;
				}else {
					consonantsCount++;
				}
			}
		}
		
		
		System.out.println("Vowels Count: "+vowelsCount+"\nConsonants Count: "+consonantsCount);
		
	}

}
