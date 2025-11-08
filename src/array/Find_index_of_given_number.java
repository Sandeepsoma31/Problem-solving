package array;

public class Find_index_of_given_number {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9,11,34};
		
		int num = 11;
		
		System.out.println("Index of search number: "+getIndexOfNum(arr,num));
	}
	
	public static int getIndexOfNum(int[] arr, int num) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				return i;
			}
		}
		
		return -1;
	}

}
