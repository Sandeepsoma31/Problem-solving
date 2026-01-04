package interview_asked;

import java.util.*;

public class First_Non_Repeating_character_in_given_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Company: hexagon
		
		//Input: "institution"
		//Output: s
		
		String text = "institution";
		
		//Method 1
		
		for(int i=0;i<text.length();i++) {
			boolean found = false;
			for(int j=0;j<text.length();j++) {
				
				if( i!=j && text.charAt(i) == text.charAt(j)) {
					found = true;
				}
				
			}
			
			if(!found) {
				System.out.println("Output1: "+text.charAt(i));
				break;
			}
			
		}
		
		//Method 2
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		for(char ch:text.toCharArray()) {
			
			map.put(ch,map.getOrDefault(ch, 0)+1);
			
		}
		
		
		for(char c:map.keySet()) {
			
			if(map.get(c)==1) {
				System.out.println("Output2: "+c);
				break;
			}
			
		}

	}

}
