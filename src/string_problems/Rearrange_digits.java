package string_problems;

public class Rearrange_digits {
	
	public static void main(String[] args) {
		
		String str = "32400121200";  //output: 32412120000
		
		int len = str.length();
		
		String op_nz = "";
		String op_z = "";
		
		for(String s:str.split("")) {
			
			if(Integer.valueOf(s)!=0) {
				op_nz = op_nz + s; 
			}else {
				op_z = op_z + "0";
			}
			
		}
		
		System.out.println("Rearranged value: "+(op_nz+op_z));
		
	}

}
