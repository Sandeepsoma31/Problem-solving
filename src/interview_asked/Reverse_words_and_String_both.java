package interview_asked;

public class Reverse_words_and_String_both {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Company: ICE
		
		//Input: "Welcome to world";
		//output: "dlrow ot emocleW"
		
		String text = "Welcome to world";
		
		String op = "";
		
		String[] str = text.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			
			String temp = "";
			for(int j=str[i].length()-1;j>=0;j--) {
				
				temp = temp + String.valueOf(str[i].charAt(j));
				
			}
			
			op = op + temp + " ";
			
		}
		
		System.out.println("Ouput: "+op.trim());
		

	}

}
