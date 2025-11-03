package basic_problems;

public class Find_number_of_digits_in_given_number {

	public static void main(String[] args) {
		
		int num = 3782107;
		
		System.out.println("No.of digits present in given number: "+countDigits(num));
	}

	private static int countDigits(int num) {
		int count = 0;
		while(num>0) {
			num = num/10;
			count++;
		}
		return count;
	}
}
