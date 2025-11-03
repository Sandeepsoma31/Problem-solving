package basic_problems;

public class Factorial_of_given_number {
	
	public static void main(String[] args) {
		
		int num = 7;
		
		System.out.println("Factorial of given number: "+factorial(num));
		
		
	}

	//Factorial of number is 5*4*3*2*1 = 120
	private static int factorial(int num) {
		
		if(num<=1)
		{
			return 1;
		}else {
			return num * factorial(num-1);
		}
		
	}

}
