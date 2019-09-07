package formingAMagicSquare;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
    	// Declaring useful variables
    	int changes = 0;
    	int l1,l2,l3,c1,c2,c3,d1,d2 = 0;
    	ArrayList<Integer> magicArrayList = new ArrayList<Integer>();
    	ArrayList<Integer> sArrayList = new ArrayList<Integer>();
    	
    	// Converting 's' to ArrayList:
    	for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				sArrayList.add(s[i][j]);
			}
		}
    	System.out.println(Arrays.toString(sArrayList.toArray()));

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
    	
    	// Print to verify if it's right:
    	//System.out.println("l1 = "+l1+", l2 = "+l2+", l3 = "+l3+", c1 = "+c1+", c2 = "+c2+", c3 = "+c3+", d1 = "+d1+", d2 = "+d2);
    	// The middle component of the Matrix must be FIVE, 5
    	if (s[1][1] != 5) {
    		changes += Math.abs(5 - s[1][1]);
    		l2 = s[1][0] + 5 + s[1][2];
    		c2 = s[0][1] + 5 + s[2][1];
    		d1 = s[0][0] + 5 + s[2][2];
        	d2 = s[0][2] + 5 + s[2][0];
        	magicArrayList.set(1, l2);
        	magicArrayList.set(4, c2);
        	magicArrayList.set(6, d1);
        	magicArrayList.set(7, d2);
    		//System.out.println(Arrays.toString(magicArrayList.toArray()));
    	}
    	
    	for (int i = 0; i < 3; i++) {
			for (int j = 3; j < 6; j++) {
				//if ((magicArrayList.get(i) == magicArrayList.get(j)) && (magicArrayList.get(i) != 15)) {
				if ((magicArrayList.get(i) != 15) && (magicArrayList.get(j) != 15)) {
					//System.out.println("(i,j) = ("+magicArrayList.get(i)+","+magicArrayList.get(j)+")");
					System.out.println("(i,j) = ("+i+","+j+")");
					changes += Math.abs(15 - magicArrayList.get(i));
					magicArrayList.set(i, 15);
					magicArrayList.set(j, 15); 
					
					System.out.println(Arrays.toString(magicArrayList.toArray()));
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