package interview_asked;

public class Reverse_only_Words_In_given_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Company: Providence
		
		//Input: "Welcome to world"
		//Output: "emocleW ot dlrow
		
		String text = "Welcome to world";
		
		String op = "";
		
		for(String word:text.split(" ")) {
			
			String temp = "";
			for(int i=word.length()-1;i>=0;i--) {
				
				temp = temp + String.valueOf(word.charAt(i));
				
			}
			
			op = op + temp + " ";
			
		}
		
		System.out.println("Oupput: "+op.trim());

	}

}
