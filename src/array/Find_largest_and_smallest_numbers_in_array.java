package array;

public class Find_largest_and_smallest_numbers_in_array {
	
	public static void main(String[] args) {
		
		int[] arr = {100,4,-3,-7,13,87};
		
		findLargestSmallestInArray(arr);
	}
	
	public static void findLargestSmallestInArray(int[] arr) {
		
		int small = arr[0];
		
		int large = arr[1];
		
		for(int k:arr) {
			if(k>large) {
				large = k;
			}else if(small>k) {
				small = k;
			}
		}
		
		System.out.println("Smallest: "+small+"\nLargest: "+large);
		
	}

}
