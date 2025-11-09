package string_problems;

import java.util.HashSet;

public class Letter_title_possibilities_of_given_string {

	public static void main(String[] args) {
		
		String str = "AAB";
		//Output is 8
		//Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
		boolean[] used = new boolean[str.length()];
		
		HashSet<String> set = new HashSet<String>();
		
		getPossibilitiesUsingBacktracking(str, set, used, "");
		
		int size = set.size()-1 ;
		System.out.println("Possibilities: "+size);
		
		
	}
	
	public static void getPossibilitiesUsingBacktracking(String str, HashSet<String> set, boolean[] used, String current) {
		
		if(set.contains(current)) return;
		
		set.add(current);
		
		for(int i=0; i<str.length();i++) {
			if(used[i]) continue;
			
			used[i] = true;
			
			getPossibilitiesUsingBacktracking(str, set, used, current+str.charAt(i));
			
			used[i] = false;
			
		}
		
	}
}
