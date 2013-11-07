/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10001st prime number?
 *
 * ANSWER: 104743
 */
 
public class Problem7 {
    
    public static boolean isPrime(int n) {
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
    	int thisPrime = 0;
    	int primeCount = 2;
    	int count = 4;
    	
    	while(primeCount < 10001){
    		if (Problem7.isPrime(count)){
    			thisPrime = count;
    			primeCount++;
    		}
    		count++;
    	}
    	
    	System.out.print(thisPrime);
    }
}
