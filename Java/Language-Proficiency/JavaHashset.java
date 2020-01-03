package javaHashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String [] pair_left = new String[t];
		String [] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}

		//Write your code here

		// SOLUTION WITH SET & HASHSET
		Set<String> uniquePairsSet = new HashSet<String>(t);

		// then, adds the numbers
		for (int i = 0; i < t; i++) {
			uniquePairsSet.add(pair_left[i] +" "+ pair_right[i]);
			System.out.println("Unique pairs: " + uniquePairsSet.size());
		}

		/* SOLUTION WITH IF-ELSES
		// Save the number of unique pairs:
		long uniquePairs = 1; // First pair is ALWAYS unique:

		// Loop through the arrays
		for (int i = 0; i < t; i++) {

			boolean unique = true;

			for (int j = 0; j < i; j++) {

				if (!unique) break;

				// Compare it with previous pair
				if ( pair_left[j].equals(pair_left[i]) && pair_right[j].equals(pair_right[i]) ) {
					unique = false;
				} else if (j == i - 1) {
					uniquePairs++;
				}
			}
			System.out.println("Unique pairs: " + uniquePairs);\
		}
		 */
		

		// Closes scanner
		s.close();
	}


}


