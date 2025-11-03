package problems;

public class Find_Odd_Or_Even_number {
	
	public static void main(String[] args) {
		
		int num = 13;
		
		if (isEvenBitwise(num)) {
			System.out.println("Given number is Even");
		}else {
			System.out.println("Given number is Odd");
		}
		
	}
	
	//We can check the remainder when divided by 2. If the remainder is 0, the number is even, otherwise it is odd.
	private static boolean isEvenMod(int num) {
		boolean check = false;
		
		if(num%2 == 0) {
			check = true;
		}
		
		return check;
	}
	
	//The last bit of all odd numbers is always 1, while for even numbers it’s 0. So, when performing bitwise AND operation with 1, odd numbers give 1, and even numbers give 0.
	private static boolean isEvenBitwise(int num) {
		boolean check = false;
		
		if((num & 1) == 0) {
			check = true;
		}
		
		return check;
	}

}
