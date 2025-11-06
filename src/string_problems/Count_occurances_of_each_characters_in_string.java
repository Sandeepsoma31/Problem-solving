package string_problems;

import java.util.HashMap;

public class Count_occurances_of_each_characters_in_string {
	
	public static void main(String[] args) {
		
		String str = "This code is written in Java";
		
		System.out.println("Count of each characters in given String: \n"+countCharacters(str));
		
	}

	private static HashMap<Character, Integer> countCharacters(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] charArr = str.toCharArray();
		for(char c:charArr) {
			if(c == ' ') {
				continue;
			}else {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
		}
		
		return map;
	}

}
