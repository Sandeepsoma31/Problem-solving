package basic_problems;

public class Fibonacci_series {
	
	public static void main(String[] args) {
		
		long num = 5;
		
		// fibonacci sequence is a sequence in which each element is the sum of the two elements that precede it
		// 0 1 1 2 3 5 8 13.....
		for(int i=0; i<=num; i++) {
			System.out.println(fibonacci(i));
		}
		
	}

	public static long fibonacci(long num) {
		
		if(num<=1) {
			return num;
		}else {
			return fibonacci(num-1) + fibonacci(num-2);
		}
	}

}
