package problems;

public class Reverse_number {

	public static void main(String[] args) {
		
		int num = 345617;
		
		System.out.println("Reverse of given number: "+reverseNumber(num));
	}

	private static int reverseNumber(int num) {
		int sum = 0;
		while(num>0) {
			
			sum = sum*10 + num%10;
			
			num = num/10;
		}
		return sum;
	}
}
