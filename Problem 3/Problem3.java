/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143
 * 
 * ANSWER: 6857
 */
 
public class Problem3 {
    
    public static boolean primeCheck(long n) {
    if (n%2==0) 
    	return false;
    if (n%3==0) 
    	return false;
    	
    for(int i=3;i*i<=n;i+=2) {
        if(n%i==0)
            return false;
    }
    return true;
}
    
    public static void main(String[] args) {
    	long test = 600851475143L;
    	long total = 0;
		for(long i = 0L; i <= test; i++){
			if (Problem3.primeCheck(i) == true && test % i == 0){
				total = i;
				System.out.println (total);
			}
		}
		
    }
}
