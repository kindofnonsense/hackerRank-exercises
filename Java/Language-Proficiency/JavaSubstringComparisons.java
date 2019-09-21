package javaSubstringComparisons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaSubstringComparisons {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		//ArrayList<String> subStrings = new ArrayList<>();
		String[] subStrings = new String[s.length()-k+1];
		String auxString;
		
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		// Creating an arrayList of all substrings of 's':
		for (int i = 0; i+k <= s.length(); i++) {
			//subStrings.add(s.substring(i, i+k));
			//System.out.println("i = "+ i + ", sub = " + subStrings.get(i));

			subStrings[i] = s.substring(i, i+k);	// Without ArrayList
			//System.out.println("i = " + i + ", sub = " + subStrings[i]);
		}

		// Ordering the arrayList and select lower and higher:

		//		subStrings.sort(null);
		//		smallest = subStrings.get(0);
		//		largest = subStrings.get(subStrings.size()-1);

		// Method without arrayList:

		for (int i = 0; i < subStrings.length; i++) {
			for (int j = 0; j < subStrings.length-1; j++) {
				int m = 0;
				while (subStrings[j].charAt(m) == subStrings[j+1].charAt(m) && m < k-2) {
					m++;
				}
				if (subStrings[j].charAt(m) < subStrings[j+1].charAt(m)) {
					auxString = subStrings[j];
					subStrings[j] = subStrings[j+1];
					subStrings[j+1] = auxString;
					//System.out.println(Arrays.toString(subStrings));
				}
			}
		}
		

		// Without ArrayList, needs to attributes lower and higher:
		smallest = subStrings[subStrings.length-1];
		largest = subStrings[0];

		return smallest + "\n" + largest;
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}

