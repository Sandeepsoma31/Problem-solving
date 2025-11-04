package basic_problems;

public class Armstrong_number {

	public static void main(String[] args) {
		
		int num = 1634;
		
		String n = Integer.toString(num);
		int len = n.length();
		
		int sum = 0;
		
		for (char c : n.toCharArray()) {
            sum += (int) Math.pow(c - '0', len);
        }
		
		//An Armstrong number, also known as a narcissistic number, is a number that equals the sum of its own digits, each raised to the power of the total number of digits. For example, \(153\) is an Armstrong number because \(1^{3}+5^{3}+3^{3}=1+125+27=153\)
		if(sum==num) {
			System.out.println("Given number is Armstrong number");
		}else {
			System.out.println("Given number is Not an Armstrong number");
		}
			
	}

}
