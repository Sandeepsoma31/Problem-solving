package basic_problems;

public class Palindrome_number_or_not {

	public static void main(String[] args) {
		
		int num = 12421;
		
		if (getRevNumber(num) == num) {
			System.out.println("Given number is Palindrome number");
		}else {
			System.out.println("Given number is Not an Palindrome number");
		}
		
	}

	private static int getRevNumber(int num) {
		
		int revNum = 0;
		while(num>0) {
			
			int k = num%10;
			revNum = revNum * 10 + k;
			num = num/10;
			
		}
		return revNum;
	}
}
