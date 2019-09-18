package formingAMagicSquare;

import java.util.Arrays;

public class Solution {
	
    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
    	// Declaring useful variables
    	int maxIntValue = Integer.MAX_VALUE;
    	int changes = 0;
    	int total[][] = {	// All the possible combinations for a 3x3 Magic Square
    			
    			{4,3,8,9,5,1,2,7,6},
    			{4,9,2,3,5,7,8,1,6},
    			{8,1,6,3,5,7,4,9,2},
    			{2,9,4,7,5,3,6,1,8},
    			{2,7,6,9,5,1,4,3,8},
    			{8,3,4,1,5,9,6,7,2},
    			{6,7,2,1,5,9,8,3,4},
    			{6,1,8,7,5,3,2,9,4},
                
    	};
    	
    	for (int i = 0; i < total.length; i++) {
			changes = Math.abs(s[0][0] - total[i][0]) + Math.abs(s[0][1] - total[i][1]) + Math.abs(s[0][2] - total[i][2]) + Math.abs(s[1][0] - total[i][3]) + Math.abs(s[1][1] - total[i][4]) + Math.abs(s[1][2] - total[i][5]) + Math.abs(s[2][0] - total[i][6]) + Math.abs(s[2][1] - total[i][7]) + Math.abs(s[2][2] - total[i][8]);
			maxIntValue = changes<maxIntValue?changes:maxIntValue;
			changes = maxIntValue;
		}
    	// Returns the number of necessary changes
    	return changes;
    	
    	// Inspired by Aditya Narain Gupta, 2018. https://www.hackerrank.com/adityangt
    }
    
    public static void main(String[] args) {
		// Testing samples
    	
    	// - Example Sample 0:
    	int[][] s0 = {{5,3,4},{1,5,8},{6,4,2}};
    	System.out.println(s0.toString());
    	System.out.println(formingMagicSquare(s0));
    	
    	// Test case 15
    	int[][] s15 = {{3,9,4},{3,5,6},{7,9,3}};
    	System.out.println(s15.toString());
    	System.out.println(formingMagicSquare(s15));
    	
    	// Test case 09
    	int[][] s09 = {{7,2,9},{6,6,2},{5,1,2}};
    	System.out.println(Arrays.deepToString(s09));
    	System.out.println(formingMagicSquare(s09));
	}
}