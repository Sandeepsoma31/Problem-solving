package problems;

import java.util.ArrayList;

public class Find_Prime_number {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int num = 11;
		
		if(isPrime(num)) {
			System.out.println("given number is prime");
		}else {
			System.out.println("given number is not prime");
		}
		
		//Find all primes between 2 and given number
		for(int i=2; i<=num; i++) {
			
			if(isPrime(i)) {
				arr.add(i);
			}
			
		}
		
		System.out.println("Prime numbers between 2 and given number: "+arr);
		
		
	}
	
	public static boolean isPrime(int num) {
		
		boolean check = true;
		
		for(int i=2; i<num/2; i++)
		{
			if(num%i==0)
			{
				check = false;
			}
		}
		
		return check;
	}
}
