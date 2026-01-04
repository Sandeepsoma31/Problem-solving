package interview_asked;

import java.util.*;

public class Print_char_freq_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Company: Hogarth
		
		//Input: Sandeep
		//Output: S1a1n1d1e2p1
		
		String name = "Sandeep";
		
		//Method 1
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		for(char c:name.toCharArray()) {
			
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		
		String op = "";
		for(char c:map.keySet()) {
			
			op = op + String.valueOf(c)+map.get(c);
			
		}
		
		System.out.println("Output1: "+op);

		//Method 2
		ArrayList<String> ls = new ArrayList<>();
		String temp = "";
		
		for(String s:name.split("")) {
			
			int count = 0;
			if(!ls.contains(s)){
				
				for(int j=0;j<name.length();j++) {
					
					if(s.equals(String.valueOf(name.charAt(j)))) {
						
						count ++;
						
					}
					
				}
				
				ls.add(s);
				temp = temp + s + count;
				
			}
			
			
			
		}
		
		System.out.println("Output2: "+temp);
		
	}

}
