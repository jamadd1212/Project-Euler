/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * ANSWER: 232792560
 */
 
public class Problem5 {
    
    public static boolean isDDeciDivisible(int check){
    	for(int i = 1; i <= 20; i++){
    		if(check % i != 0)
    			return false;
    	}
    	return true;
    }
    
    public static void main(String[] args) {
    	int smallest = 0;
    	int counter = 0;
		while(smallest == 0){
			if(Problem5.isDDeciDivisible(counter))
				smallest = counter;
			counter++;
		}
		System.out.print(smallest);
    }
}
