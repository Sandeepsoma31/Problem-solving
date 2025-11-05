package string_problems;

public class Reverse_each_word_in_given_string {
	
	public static void main(String[] args) {
		
		String str = "I love both Java and Python";
		
		String[] strArr = str.split(" ");
		
		for(int i=0; i<strArr.length; i++) {
			strArr[i] = revString(strArr[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		for(String k:strArr) {
			sb.append(k).append(" ");
		}
		
		System.out.println("Reverse of each word in given string: "+sb);
		
	}

//	private static String revString(String s) {
//		int len = s.length();
//		String rStr = "";
//		for(int i=len-1; i>=0; i--) {
//			rStr = rStr + s.charAt(i);
//		}
//		return rStr;
//	}
	
	//Using String builder (cleaner and faster)
	private static String revString(String s) {
		return new StringBuilder(s).reverse().toString();
	}

}
