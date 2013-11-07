/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 *
 * ANSWER: 142913828922
 */
 
public class Problem10 {
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args) {
    	
    	long total = 0L;
    	
    	for(int i = 0; i < 2000000; i++){
    		if (Problem10.isPrime(i)){
     			total += i;
    		}
    	}
    	System.out.print(total);
    }
}
