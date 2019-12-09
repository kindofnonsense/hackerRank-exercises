package java2DArray;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Java2DArray {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
//				System.out.println(arr[i][j]);	// Verify elements
			}
		}
		
		// Test case 3:
//-1 -1 0 -9 -2 -2
//-2 -1 -6 -8 -2 -5
//-1 -1 -1 -2 -3 -4
//-1 -9 -2 -4 -4 -5
//-7 -3 -3 -2 -9 -9
//-1 -3 -1 -2 -4 -5
		
		
		// SOLUTION CODE:
		int firstLineSum = 0;
		int secondLineElement = 0;
		int thirdLineSum = 0;
		
		int[][] hourglassSum = new int[6][6];
		
		// loop through lines
		for (int i = 0; i < arr.length - 2; i++) {
			
			// select elements from 0 to 4 every line 
			for (int j = 0; j < 4; j++) {
				firstLineSum = 0;
				secondLineElement = 0;
				thirdLineSum = 0;
				
				// sum every three elements of first line
				for (int k = j; k < j + 3; k++) {
					firstLineSum += arr[i][k];
				}
				// second line element will be i+1 and j+1
				secondLineElement = arr[i+1][j+1];
				
				// third line sum:
				for (int k = j; k < j + 3; k++) {
					thirdLineSum += arr[i+2][k];
				}
				
				hourglassSum[i][j] = firstLineSum + secondLineElement + thirdLineSum;
//				System.out.println("hourglassSum[" +i+ "]["+j+"] = " + hourglassSum[i][j]);
				
			}
		}
		
		// Initial value to find the maximum
		int maxValue = hourglassSum[0][0];
		
		// Find max
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				
				if (hourglassSum[i][j] > maxValue) {
					maxValue = hourglassSum[i][j];
				}
			}
		}
		
		// Print max value
		System.out.println(maxValue);

		scanner.close();
	}
}
