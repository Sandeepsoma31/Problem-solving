package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_non_repeating_numbers_from_given_array {

	public static void main(String[] args) {
		
		int[] numbers = {1, 1, 2, 2, 3, 4, 5, 6, 6, 7};
		
		System.out.println("Non repeating numbers from given array: "+findNonReaptingNumbers(numbers));
	}
	
	public static List<Integer> findNonReaptingNumbers(int[] numbers){
		
		Map<Integer, Integer> count = new HashMap<Integer,Integer>();
		
		for(int num: numbers) {
			count.put(num, count.getOrDefault(num,0)+1);
		}
		
		List<Integer> nonRepeated = new ArrayList<Integer>();
		
		for(Map.Entry<Integer, Integer> entry: count.entrySet()) {
			if(entry.getValue()==1) {
				nonRepeated.add(entry.getKey());
			}
		}
		
		return nonRepeated;
		
	}
}
