package basic_problems;

public class Swap_numbers {
	
	public static void main(String[] args) {
		
		
		int a = 11;
		int b = 19;
		
		//without 3rd variable
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a: "+a+"\nb: "+b);
		
		//with 3rd variable
		int c = b;
		b = a;
		a = c;
		
		System.out.println("a: "+a+"\nb: "+b);
	}

}
