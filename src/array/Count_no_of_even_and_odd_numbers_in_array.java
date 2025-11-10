package array;

public class Count_no_of_even_and_odd_numbers_in_array {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		int countEven = 0;
		int countOdd = 0;
		for(int n:numbers) {
			if(n%2 == 0) {
				countEven++;
			}else {
				countOdd++;
			}
		}
		
		System.out.println("Count of Odd numbers: "+countOdd+"\nCount of Even numbers: "+countEven);

	}
}
