/**
 * The following iterative sequence is defined for the set of positive integers:
 * n --> n/2 (n is even)
 * n --> 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13  40  20  10  5  16  8  4  2  1
 * 
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 *
 *
 * ANSWER: 837799
 */
 
public class Problem14 {
    
    public static boolean isEven(long i){
    	return i % 2 == 0;
    }
    
    public static boolean isOdd(long i){
    	return i % 2 != 0;
    }
    
    public static void main(String[] args) {
    	
    	int longest = 0;
    	int longestVal = 0;
    	
    	for(int i = 1; i < 1000000; i++){
    		long currVal = i;
    		int chain = 1;
    		while(currVal != 1){
    			if(isEven(currVal))
    				currVal = currVal / 2;
    			 else if(isOdd(currVal))
    				currVal = 3*currVal + 1;
    			chain++;
    		}
    		if(chain > longest){
    			longest = chain;
    			longestVal = i;
    		}
    	}
    	System.out.println(longest);
    	System.out.println(longestVal);	
    }
}
