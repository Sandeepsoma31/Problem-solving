package array;

public class Find_missing_number_from_array {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5,6};
		
		System.out.println("Missing number is: "+findMissingNumber(arr));
	}
	
	public static int findMissingNumber(int[] arr) {
		
		int n = arr.length+1;
		
		int totalSum = n*(n+1)/2;  //Sum of first n Natural numbers
		
		int arrSum = 0;
		for(int k:arr) {
			arrSum+=k;
		}
		
		return totalSum-arrSum;
		
	}

}
