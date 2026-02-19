package array;

import java.util.Arrays;

public class rotate_array_by_k_digits {

	public static void main(String[] args) {
		
		//Rotate array by k digits
		
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		
		int[] res = new int[arr.length];
		
		int j=0;
		for(int i=k;i<arr.length;i++) {
			
			res[j] = arr[i];
			j++;
			
		}
		
		for(int i=0;i<k;i++) {
			res[j] = arr[i];
			j++;
		}
		
		System.out.println("output: "+Arrays.toString(res));
		//Space is O(n) and time is O(n)
		
	}

}
