/**
 * If the numbers 1 to 5 are written out in words: 
 * one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * 
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters 
 * would be used?
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters 
 * and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in 
 * compliance with British usage.
 *
 * ANSWER: 21124
 *
 * ***CODE FROM ONLINE****
 *    (Stupid Problem)
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class Problem17 {

        private static Map<Integer, String> map = new HashMap<Integer, String>();
                /**
                 * 
                 */

                static{
                        map.put(1, "one");
                        map.put(2, "two");
                        map.put(3, "three");
                        map.put(4, "four");
                        map.put(5, "five");
                        map.put(6, "six");
                        map.put(7, "seven");
                        map.put(8, "eight");
                        map.put(9, "nine");
                        map.put(10, "ten");
                        map.put(11, "eleven");
                        map.put(12, "twelve");
                        map.put(13, "thirteen");
                        map.put(14, "fourteen");
                        map.put(15, "fifteen");
                        map.put(16, "sixteen");
                        map.put(17, "seventeen");
                        map.put(18, "eighteen");
                        map.put(19, "nineteen");
                        map.put(20, "twenty");
                        map.put(30, "thirty");
                        map.put(40, "forty");
                        map.put(50, "fifty");
                        map.put(60, "sixty");
                        map.put(70, "seventy");
                        map.put(80, "eighty");
                        map.put(90, "ninety");
                        map.put(100, "hundred");
                        map.put(1000, "onethousand");
                };
        
        /**
         * @param args
         */
        public static void main(String[] args) {
                List<String> words = new ArrayList<String>();
                
                for(int i = 1; i<= 1000; i++){
                        if(i != 1000){
                                String hundString = findHundredString(i);
                                int hun = i/100;
                                int number = i - hun*100;
                                String finalString = "";
                                String word = processBetween1To100(number);
                                if(hundString == null || hundString.equals("")){
                                        finalString = word;
                                }else{
                                        if(word == null || word.equals("")){
                                                finalString = hundString;
                                        }else{
                                                finalString = hundString+"and"+ word;
                                        }
                                        
                                }
                                finalString = finalString.trim();
                                System.out.println(finalString);
                                words.add(finalString);
                        }else{
                                String st = map.get(1000);
                                System.out.println(st);
                                words.add(st.trim());
                        }
                        
                }
                System.out.println(words.size());
                
                int length = 0;
                for(String word : words){
                        length += word.length();
                }
                System.out.println("Answer--> "+length);
        }
        
        private static String findHundredString(int i) {
                int hundredPlace = i/100;
                String hundString = "";
                if(hundredPlace > 0){
                        String prefixHundredString = map.get(hundredPlace);
                        String postfixhundredthString = map.get(100);
                        hundString = prefixHundredString + postfixhundredthString;
                }
                return hundString;
        }

        private static String processBetween1To100(int i){
                String word  = "";
                if(i >0){
                        word = map.get(i);
                        if(word == null){
                                int tenthPlace = i/10;
                                int unitPlace = i%10;
                                String tenthString = map.get(tenthPlace*10);
                                String unitString = map.get(unitPlace);
                                word = tenthString + unitString;
                        }
                }
                
                return word;
                
        }

}
