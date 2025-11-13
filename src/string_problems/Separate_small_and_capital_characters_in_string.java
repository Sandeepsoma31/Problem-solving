package string_problems;

import java.util.Arrays;

public class Separate_small_and_capital_characters_in_string {
	
	public static void main(String[] args) {
		
		String str = "aBACbcEDed";  
		//Output: 
		//Capital characters: ABCDE & Small characters: abcde
		
		
		String[] op = {"",""};
		
		for(char ch : str.toCharArray()) {
			int k = (int)ch;
			if(k>= 65 && k<=90) { //A-65, B-66, C-67, ....... Z-90
				op[0] = op[0] + ch;
			}else {	//The ASCII values for the lower case letters 'a' through 'z' are \(97\) through \(122\). 
				op[1] = op[1] + ch; 
			}
		}
		
		char[] lowerArr = op[1].toCharArray();
		char[] upperArr = op[0].toCharArray();
		
		// Sort both arrays
		Arrays.sort(lowerArr);
		Arrays.sort(upperArr);

		// Convert back to strings
		String lowerSorted = new String(lowerArr);
		String upperSorted = new String(upperArr);
		
		System.out.println("Capital characters: "+upperSorted+"\nSmall characters: "+lowerSorted);
	}

}
