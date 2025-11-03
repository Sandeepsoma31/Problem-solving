package basic_problems;

public class Sum_of_digits_of_given_number {
	
	public static void main(String[] args) {
		
		int num = 31072;
		
		System.out.println("Sum of digits in given number: "+sumDigits(num));
	}

	private static int sumDigits(int num) {
		int sum = 0;
		while(num>0) {
			sum = sum + num%10;
			num = num/10;
		}
		return sum;
	}

}
