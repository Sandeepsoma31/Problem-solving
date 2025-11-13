package string_problems;

public class Separate_String_and_Int {

	public static void main(String[] args) {
		
		String name = "0San@d123eep";
		
		//output:
		//Name: Sandeep & Other chars: 0@123
		
		char[] nArr = name.toCharArray();
		
		String[] s = {"",""};
		
		
		for(char ch : nArr) {
			int k = (int)ch;
			if((k>= 65 && k<=90) || (k>=97 && k<=122)) {
				s[0] =  s[0]+ch;
			}else {
				s[1] =  s[1]+ch;
			}
		}
		
		System.out.println("Name: "+s[0]+"\nOther chars: "+s[1]);
	}
}
