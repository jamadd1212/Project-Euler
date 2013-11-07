/*
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 *
 * ANSWER: 1366
 */
 
import java.math.BigInteger;

public class Problem16 {
    
    public static void main(String[] args) {
    	String big = BigInteger.valueOf(2).pow(1000).toString();
    	int sum = 0;
    	for(int i = 0; i < big.length(); i++){
    		sum += Integer.parseInt(big.substring(i,i+1));
    	}
    	System.out.print(sum);
    }
}
