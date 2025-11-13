package string_problems;

import java.util.HashMap;
import java.util.Map;

public class Count_Consecutive_Characters {
	
	public static void main(String[] args) {
		
		String str = "aabbcccdd"; //Output: a2b2c3d2
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch : str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		String op = "";
		for(Character c: map.keySet()) {
			op = op + c + map.get(c);
		}
		
		System.out.println("Output: "+op);
		
	}

}
