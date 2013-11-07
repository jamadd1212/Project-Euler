/*
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
 *
 *    3
 *   7 4
 *  2 4 6
 * 8 5 9 3
 * 
 * That is, 3 + 7 + 4 + 9 = 23.
 * 
 * Find the maximum total from top to bottom of the triangle below:
 * 
 *                             75
 *                           95  64
 *                         17  47  82
 *                       18  35  87  10
 *                     20  04  82  47  65
 *                   19  01  23  75  03  34
 *                 88  02  77  73  07  63  67
 *               99  65  04  28  06  16  70  92
 *             41  41  26  56  83  40  80  70  33
 *           41  48  72  33  47  32  37  16  94  29
 *         53  71  44  65  25  43  91  52  97  51  14
 *       70  11  33  28  77  73  17  78  39  68  17  57
 *     91  71  52  38  17  14  91  43  58  50  27  29  48
 *   63  66  04  68  89  53  67  30  73  16  69  87  40  31
 * 04  62  98  27  23  09  70  98  73  93  38  53  60  04  23
 * 
 * NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. 
 * However, Problem 67, is the same challenge with a triangle containing one-hundred rows; it cannot 
 * be solved by brute force, and requires a clever method! ;o)
 *
 * ANSWER: 1074
 */

import chn.util.FileInput;
import apcslib.Format;
 
public class Problem18 {
    
    public static int[][] load(int[][] temp, FileInput in){
    	while(in.hasMoreTokens()){
    		for(int rowNum = 0; rowNum < 15; rowNum++){
    			for(int i = 0; i <= rowNum; i++){
    				temp[rowNum][i] = Integer.parseInt(in.readToken());
    			}
    			
    		}
    	}
    	return temp;
    }
    
    public static void print(int[][] temp){
    	for(int x = 0; x < 15; x++){
    		for(int y = 0; y < 15; y++){
    			System.out.print(Format.right(temp[x][y],2) + " ");
    		}
    		System.out.println("");
    	}
    }
    
    public static void main(String[] args) {
    	inefficient();
    	
    }

    public void inefficient(){
    	
    	int sum = 0;
    	int largest = 0;
    	
    	
    	int[][] data = new int[15][15];
    	FileInput in = new FileInput("data.txt");
    	
    	data = load(data,in);
    	
    	int row0 = 0;
    	sum += data[0][0];
    	for(int row1 = 0; row1 <= 1; row1++){
    		sum += data[1][row1];
    		for(int row2 = row1; row2 <= row1 + 1; row2++){
    			sum += data[2][row2];
    			for(int row3 = row2; row3 <= row2 + 1; row3++){
    				sum += data[3][row3];
    				for(int row4 = row3; row4 <= row3 + 1; row4++){
    					sum += data[4][row4];
    					for(int row5 = row4; row5 <= row4 + 1; row5++){
    						sum += data[5][row5];
    						for(int row6 = row5; row6 <= row5 + 1; row6++){
    							sum += data[6][row6];
    							for(int row7 = row6; row7 <= row6 + 1; row7++){
    								sum += data[7][row7];
    								for(int row8 = row7; row8 <= row7 + 1; row8++){
    									sum += data[8][row8];
    									for(int row9 = row8; row9 <= row8 + 1; row9++){
    										sum += data[9][row9];
    										for(int row10 = row9; row10 <= row9 + 1; row10++){
    											sum += data[10][row10];
    											for(int row11 = row10; row11 <= row10 + 1; row11++){
    												sum += data[11][row11];
    												for(int row12 = row11; row12 <= row11 + 1; row12++){
    													sum += data[12][row12];
    													for(int row13 = row12; row13 <= row12 + 1; row13++){
    														sum += data[13][row13];
    														for(int row14 = row13; row14 <= row13 + 1; row14++){
    													//		System.out.println(row14);
    															sum += data[14][row14];
    															if(sum > largest)
    																largest = sum;
    															sum -= data[14][row14];
    														}
    														sum -= data[13][row13];
    													}
    													sum -= data[12][row12];
    												}
    												sum -= data[11][row11];
    											}
    											sum -= data[10][row10];
    										}
    										sum -= data[9][row9];
    									}
    									sum -= data[8][row8];
    								}
    								sum -= data[7][row7];
    							}
    							sum -= data[6][row6];
    						}
    						sum -= data[5][row5];
    					}
    					sum -= data[4][row4];
    				}
    				sum -= data[3][row3];
    			}
    			sum -= data[2][row2];
    		}
    		sum -= data[1][row1];
    	}
    	
    	System.out.print(largest);
    }
}
