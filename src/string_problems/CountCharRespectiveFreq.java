package string_problems;

public class CountCharRespectiveFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input: aabcccaabbbb
		//output: a2b1c3a2b4
		
		String text = "aabcccaabbbb";
		
		System.out.println("Output 1 using method1: "+getCharFeq(text));
		System.out.println("Output 2 using method2: "+getCharFeqUsingSingleLoop(text));
		

	}

	//Method1
	public static String getCharFeq(String str) {
		
		StringBuilder result = new StringBuilder();
		
		int i=0;
		while(i<str.length()) {
			
			char current = str.charAt(i);
			int count = 1;
			
			while(i+1<str.length() && current == str.charAt(i+1)) {
				count++;
				i++;
			}
			
			result.append(current).append(count);
			i++;
		}
		
		
		return result.toString();
	}
	
	
	//Method2
	public static String getCharFeqUsingSingleLoop(String str) {
		
		StringBuilder result = new StringBuilder();
		
		int count = 1;
		
		for(int i=0;i<str.length();i++) {
			
			if(i+1<str.length() && str.charAt(i) == str.charAt(i+1)) {
				count++;
			}else {
				result.append(str.charAt(i)).append(count);
				count = 1;
			}
			
			
		}
		
		return result.toString();
	}

}
