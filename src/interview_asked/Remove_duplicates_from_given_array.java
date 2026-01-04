package interview_asked;

import java.util.*;

public class Remove_duplicates_from_given_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Company: Hexagon
		
		//input: {1,2,3,3,4,5,5,6};
		//output: [1,2,3,4,5,6]

		int[] arr = {1,2,3,4,4,5,2};
		
		//Method 1
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		for(int num:arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		ArrayList<Integer> op = new ArrayList<Integer>();
		
		for(int n:map.keySet()) {
			
			op.add(n);
			
		}
		
		System.out.println("Output1: "+op);
		
		//Method 2
		String temp = "";
		
		ArrayList<Integer> op2 = new ArrayList<Integer>();
		
		for(int n:arr) {
			String k = String.valueOf(n);
			if(!temp.contains(k)) {
				temp = temp + k;
				op2.add(n);
			}
			
		}
		
		System.out.println("Output2: "+op2);
		
		
		
	}

}
