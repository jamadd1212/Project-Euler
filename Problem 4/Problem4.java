/*
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * ANSWER: 906609
 */
 
public class Problem4 {
	
	public static boolean isPalindrome(int check){
		String test = new Integer(check).toString();
		if (test.length() <=1)
			return false;
		for(int i = 0; i < test.length() / 2; i++){
			if(test.charAt(i) != test.charAt(test.length() - 1 - i))
				return false;
		}
		return true;
	}
    
    public static void main(String[] args) {
    	int largest = 0;
    	for (int i = 100; i <=999; i++){
    		for (int j = 100; j <=999; j++){
    			if(Problem4.isPalindrome(i * j) && i * j > largest)
    				largest = i * j;
    		}
    	}
		
		System.out.print(largest);
    }
}
