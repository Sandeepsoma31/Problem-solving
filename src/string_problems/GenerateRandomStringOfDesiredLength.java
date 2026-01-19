package string_problems;

import java.util.*;

public class GenerateRandomStringOfDesiredLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length = 13;
		
		System.out.println("Generated bu using UUID(Universally Unique Identifier) util: "+generateStringUsingUUID(length));
		
		System.out.println("Generated bu using Random util: "+generateStringUsingRandom(length));
		
	}
	
	public static String generateStringUsingUUID(int length) {
		
		StringBuilder result = new StringBuilder();
		
		result.append(UUID.randomUUID().toString().replaceAll("-", "").substring(0,length));
		
		
		return result.toString();
	}
	
	public static String generateStringUsingRandom(int length) {
		
		StringBuilder result = new StringBuilder();
		Random rad = new Random();
		
		String alphas = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
		
		for(int i=0;i<length;i++) {
			result.append(alphas.charAt(rad.nextInt(alphas.length())));
		}
		
		
		return result.toString();
		
	}
	
	
	

}
