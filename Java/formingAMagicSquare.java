package formingAMagicSquare;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	
	 // Calculating METHOD sums of lines, columns and diagonals:
	static ArrayList<Integer> magicSum(ArrayList<Integer> array) {
		// This method is used to calculate and recalculated the square with the modifications.
		
		// Variables:
		ArrayList<Integer> returnedArrayList = new ArrayList<Integer>();
		int l1,l2,l3,c1,c2,c3,d1,d2 = 0;
		
		// Calculate every line, column and diagonal sum
    	l1 = array.get(0) + array.get(1) + array.get(2);
    	l2 = array.get(3) + array.get(4) + array.get(5);
    	l3 = array.get(6) + array.get(7) + array.get(8);
    	
    	c1 = array.get(0) + array.get(3) + array.get(6);
    	c2 = array.get(1) + array.get(4) + array.get(7);
    	c3 = array.get(2) + array.get(5) + array.get(0);
    	
    	d1 = array.get(0) + array.get(4) + array.get(8);
    	d2 = array.get(2) + array.get(4) + array.get(6);
    	
    	// Add every calculation to an arraylist
    	returnedArrayList.add(l1);
    	returnedArrayList.add(l2);
    	returnedArrayList.add(l3);
    	returnedArrayList.add(c1);
    	returnedArrayList.add(c2);
    	returnedArrayList.add(c3);
    	returnedArrayList.add(d1);
    	returnedArrayList.add(d2);
		
		return returnedArrayList;
		
	}

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
    	// Declaring useful variables
    	int changes = 0;
    	int cAux1 = 0;
    	int cAux2 = 0;
    	int cAux3 = 0;
    	//int l1,l2,l3,c1,c2,c3,d1,d2 = 0;
    	ArrayList<Integer> magicArrayList = new ArrayList<Integer>();
    	ArrayList<Integer> sArrayList = new ArrayList<Integer>();
    	
    	// Converting 's' to ArrayList:
    	for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				sArrayList.add(s[i][j]);
			}
		}
    	//System.out.println(Arrays.toString(sArrayList.toArray()));
    	
    	
    	// New method of summing lines, columns and diagonals
    	magicArrayList = Solution.magicSum(sArrayList);
    	
    	// Old method of summing lines, columns and diagonals
    	/*
    	
    	l1 = s[0][0] + s[0][1] + s[0][2];
    	l2 = s[1][0] + s[1][1] + s[1][2];
    	l3 = s[2][0] + s[2][1] + s[2][2];
    	
    	c1 = s[0][0] + s[1][0] + s[2][0];
    	c2 = s[0][1] + s[1][1] + s[2][1];
    	c3 = s[0][2] + s[1][2] + s[2][2];
    	
    	d1 = s[0][0] + s[1][1] + s[2][2];
    	d2 = s[0][2] + s[1][1] + s[2][0];
    	
    	magicArrayList.add(l1);
    	magicArrayList.add(l2);
    	magicArrayList.add(l3);
    	magicArrayList.add(c1);
    	magicArrayList.add(c2);
    	magicArrayList.add(c3);
    	magicArrayList.add(d1);
    	magicArrayList.add(d2);
    	System.out.println(Arrays.toString(magicArrayList.toArray()));
    	*/
    	
    	// Print to verify if it's right:
    	//System.out.println("l1 = "+l1+", l2 = "+l2+", l3 = "+l3+", c1 = "+c1+", c2 = "+c2+", c3 = "+c3+", d1 = "+d1+", d2 = "+d2);
    	
    	// ---- MODIFYING THE GIVEN 's' TO TRANSFORM IT INTO A MAGIC SQUARE ----
    	// The middle component of the Matrix must be FIVE, 5
    	
    	if (sArrayList.get(4) != 5) {
    		changes += Math.abs(5 - sArrayList.get(4));
    		sArrayList.set(4, 5);
    			// The 's' array was corrected modified?
    			System.out.println(Arrays.toString(sArrayList.toArray()));
    			System.out.println(sArrayList.toString());
    		magicArrayList = Solution.magicSum(sArrayList);
    		/*
    		l2 = s[1][0] + 5 + s[1][2];
    		c2 = s[0][1] + 5 + s[2][1];
    		d1 = s[0][0] + 5 + s[2][2];
        	d2 = s[0][2] + 5 + s[2][0];
        	magicArrayList.set(1, l2);
        	magicArrayList.set(4, c2);
        	magicArrayList.set(6, d1);
        	magicArrayList.set(7, d2);
        	*/
    		//System.out.println(Arrays.toString(magicArrayList.toArray()));
    	}
    	
//    	for (int i = 0; i < 3; i++) {
//			for (int j = 3; j < 6; j++) {
//				//if ((magicArrayList.get(i) == magicArrayList.get(j)) && (magicArrayList.get(i) != 15)) {
//				if ((magicArrayList.get(i) != 15) && (magicArrayList.get(j) != 15)) {
//					//System.out.println("(i,j) = ("+magicArrayList.get(i)+","+magicArrayList.get(j)+")");
//					System.out.println("(i,j) = ("+i+","+j+")");
//					changes += Math.abs(15 - magicArrayList.get(i));
//					magicArrayList.set(i, 15);
//					magicArrayList.set(j, 15); 
//					
//					System.out.println(Arrays.toString(magicArrayList.toArray()));
//				}
//			}
//		}
    	
    	for (int i = 0; i < 3; i++) {
    		for (int j = 3; j < magicArrayList.size(); j++) {
    			if (magicArrayList.get(i) != 15 && magicArrayList.get(j) != 15) {
    				cAux1 = 15 - magicArrayList.get(i);
    				cAux2 = 15 - magicArrayList.get(j);
    				cAux1 = Math.min(Math.abs(cAux1), Math.abs(cAux2));
    				// Switch to find the right index of sArrayList
    				switch (j) {
					case 3:
						cAux3 = 0;
						break;
					case 4: 
						cAux3 = 1;
						break;
					case 5: 
						cAux3 = 2;
						break;
					case 6: 
						cAux3 = 0;
						break;
					case 7: 
						cAux3 = 2;
						break;
					default:
						throw new IllegalArgumentException("Unexpected value: " + j);
    				}
    				cAux2 = sArrayList.get(cAux3);
    				if (Math.abs(cAux1 - cAux2) <= 9) {
    					sArrayList.set(cAux3, Math.abs(cAux1 - cAux2));
    					changes =+ Math.abs(cAux1 - cAux2);
    					magicArrayList = Solution.magicSum(sArrayList);
    					System.out.println(Arrays.deepToString(magicArrayList.toArray()));
    				} else break;
    			}
			}
		}
    	
    	// Returns the number of necessary changes
    	return changes;
    }
    
    public static void main(String[] args) {
		// Testing samples
    	/*
    	// - Example Sample 0:
    	int[][] s0 = {{5,3,4},{1,5,8},{6,4,2}};
    	System.out.println(s0.toString());
    	System.out.println(formingMagicSquare(s0));
    	*/
    	// Test case 15
    	int[][] s15 = {{3,9,4},{3,5,6},{7,9,3}};
    	System.out.println(s15.toString());
    	System.out.println(formingMagicSquare(s15));
	}
}