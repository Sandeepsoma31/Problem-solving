package string_problems;

public class Reverse_given_string {
	
	public static void main(String[] args) {
		
		String str = "Python";
		
		String rStr = "";
		int len = str.length();
		for(int i=len-1; i>=0; i--) {
			rStr = rStr + str.charAt(i);
		}
		
		System.out.println("Reverse of given String: "+rStr);
		
		//Using String Builder
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		System.out.println("Reverse of given String using String Builder: "+sb);
		
	}

}
