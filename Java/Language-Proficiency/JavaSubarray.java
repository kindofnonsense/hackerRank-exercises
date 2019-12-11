package javaSubarray;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {

	// Solution from here
	public static void main(String[] args) {
		/* 
		 * Enter your code here. 
		 * Read input from STDIN. 
		 * Print output to STDOUT. 
		 * Your class should be named Solution. 
		 */
		
		// Starts a scanner
		Scanner sc = new Scanner(System.in);
		
		// Read the first line = n, array size.
		int arraySize = sc.nextInt();
		int[] array = new int[arraySize];
		
		// Creates a results array to save sum of sub-array elements
		int[][] subArraysResults = new int[arraySize][arraySize];
		
		// Read input array:
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
			// first line is equal to array
//			subArraysResults[0][i] = array[i];
			//System.out.println(array[i]);	// Verify
		}
		
		// Create the sub arrays
//		//		Two items
//		subArraysResults[1][0] = array[0] + array[1];
//		subArraysResults[1][1] = array[1] + array[2];
//		subArraysResults[1][2] = array[2] + array[3];
//		subArraysResults[1][3] = array[3] + array[4];
//		// 		Three items
//		subArraysResults[2][0] = array[0] + array[1] + array[2];
//		subArraysResults[2][1] = array[1] + array[2] + array[3];
//		subArraysResults[2][2] = array[2] + array[3] + array[4];
//		// 		Four items
//		subArraysResults[3][0] = array[0] + array[1] + array[2] + array[3];
//		subArraysResults[3][1] = array[1] + array[2] + array[3] + array[4];
//		// 		Five items
//		subArraysResults[4][0] = array[0] + array[1] + array[2] + array[3] + array[4];
		
		
		// Loop implementation
		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j < arraySize - i; j++) {
				// Auxiliary to calculate
				int aux = 0;
				for (int k = j; k <= j+i; k++) {
					aux += array[k];
				}
				subArraysResults[i][j] = aux;
			}
		}
		
		// Counting negative 
		int countingNegative = 0;
		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j < arraySize; j++) {
				if (subArraysResults[i][j] < 0) {
					countingNegative++;
				}
			}
		}
		
		// Verify results
//		System.out.println(Arrays.deepToString(subArraysResults) + 
//				"\n > Negative = " + countingNegative);
		
		// Return result
		System.out.println(countingNegative);
		
		// Closes scanner
		sc.close();
	}

}
