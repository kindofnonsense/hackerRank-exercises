package drawingBook;
/*
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
*/
public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
    	
    	// ---- Declaring variables
    	int minNumberOfTurns = 0; 	// The number of page flips to reach the desirable page
    	int oddPage = 1;			// 
    	int forcedBreak = 0;
    	
    	if ((p % 2) == 1) { 		// Transform odd 'p' to an even number.
    		p--;
    		// System.out.println("p = "+p);
    	};
    	
    	if ((n % 2) == 1) {			// Transform odd 'n' to an even number.
    		n--;
    	};
    	// --- Two ways to calculate the minimum number of page flips:
    	// --- *) verify if p > n/2 or not.
    	if (p > n/2) { 
    		oddPage = n;
    		while ((oddPage > p) & (forcedBreak < 50)) {
    			oddPage -= 2;
    			minNumberOfTurns++;
    			//forcedBreak++; 	// forcedBreak was utilized to test without throw an endless loop;
    		}
    	} else {
    		while ((oddPage < p) & (forcedBreak < 50)) {
    			oddPage += 2;
    			minNumberOfTurns++;
    			//forcedBreak++; 	// forcedBreak was utilized to test without throw an endless loop;
    		}
    	}
    	
    	return minNumberOfTurns;
    }

    
    public static void main(String[] args) {
		/*
		System.out.println(Solution.pageCount(6,2));
		System.out.println(Solution.pageCount(5,4));
		System.out.println(Solution.pageCount(6,4));
		System.out.println(Solution.pageCount(6,3));
		*/
    	System.out.println(Solution.pageCount(73201,57075));
		for (int i = 0; i<50; i++) {
			for (int j = 0; j<=i; j++) {
				System.out.println("For (" + i + "," + j +") = "+Solution.pageCount(i,j));
			}
		}
	}
}