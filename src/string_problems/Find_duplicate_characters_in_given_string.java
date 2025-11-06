package string_problems;

import java.util.HashMap;

public class Find_duplicate_characters_in_given_string {

	public static void main(String[] args) {
		
		String str = "Java and Python";
		
		duplicateCharactersInString(str);
		
	}

	private static void duplicateCharactersInString(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] chArr = str.toCharArray();
		
		 for (char c : chArr) {
	            if (c == ' ') {
	            	continue; //skip space characters
	            }else {
	            	map.put(c, map.getOrDefault(c, 0) + 1);
	            }
	     }
		 
		 for (var entry : map.entrySet()) {
			    if (entry.getValue() > 1) {
			        System.out.println(entry.getKey() + " = " + entry.getValue());
			    }
		}
		
	}
}
