package array;

public class NearestPrimeNumber {

	public static void main(String[] args) {
		
		int num = 111; //Nearest prime number of 111 is 109
		
		int result = -1;
		
		int lower = num - 1;
        int higher = num + 1;
        
        if(isPrime(num)){
        	
			result = num;
		
        }else {
			
			while(true) {
				
				if(isPrime(lower)) {
					result = lower;
					break;
				}
				
				if(isPrime(higher)) {
					result = higher;
					break;
				}
				
				lower--;
				higher++;
				
			}
			
		}
        
		
		
		System.out.println("Nearest Prime number: "+result);
		

	}

	
	public static boolean isPrime(int n) {
		
		if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
		
		return true;
	}

}
