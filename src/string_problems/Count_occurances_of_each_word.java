package string_problems;

import java.util.HashMap;

public class Count_occurances_of_each_word {
	
	public static void main(String[] args) {
		
		String str = "Coding improves problem solving skills and improves logical thinking";
		
		System.out.println("Count each word in given string:\n"+countEachWord(str));
	}
	
	public static HashMap<String, Integer> countEachWord(String str) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		String[] strArr = str.split(" ");
		
		for(String s:strArr) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}
		}
		
		return map;
	}

}
