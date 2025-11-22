package string_problems;

import java.util.HashMap;
import java.util.Map;

public class Find_First_Non_Repeating_Character {
	
	public static void main(String[] args) {
		
		String str = "Stress";
		
		Map<Character, Integer> map = new HashMap<>();
		
		
		for(char ch: str.toLowerCase().toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(char ch: str.toCharArray()) {
			
			if(map.get(Character.toLowerCase(ch)) == 1) {
				
				System.out.println("output: "+ch);
				break;
				
			}
		}
		
	}

}
