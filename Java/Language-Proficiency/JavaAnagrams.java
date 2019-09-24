package javaAnagrams;

import java.util.Scanner;

public class JavaAnagrams {
	static boolean isAnagram(String a, String b) {
		// Complete the function

		// If a and b are different, return false
		if (a.length() != b.length()) {
			return false;
			
		} else {
			a = a.toLowerCase();
			b = b.toLowerCase();
			
//			int[] countA = new int[a.length()];
//			int[] countb = new int[b.length()];
			
			char[] charA = a.toCharArray();
			char[] charB = b.toCharArray();
			
			// English alphabet:
			char[] alphabet = "abcdefghijklmnopqrstuvxyz".toCharArray();
			int[] uniqueLettersA = new int[alphabet.length];
			int[] uniqueLettersB = new int[alphabet.length];
			
			// Find frequency of each letter of 'a' and 'b':
			int it = 0;
			for (char letter : alphabet) {
				for (char aChar : charA) {
					if (letter == aChar) {
						uniqueLettersA[it]++;
					}
				}
				it++;
				//System.out.println("For a-string, for letter: " + letter + ", Freq. = " + uniqueLettersA[it -1]);
			}
			
			it = 0;
			for (char letter : alphabet) {
				for (char bChar : charB) {
					if (letter == bChar) {
						uniqueLettersB[it]++;
					}
				}
				it++;
				//System.out.println("For b-string, for letter: " + letter + ", Freq. = " + uniqueLettersB[it -1]);
			}
			
			boolean checksAB = true;
			for (int i = 0; i < uniqueLettersB.length; i++) {
				if (uniqueLettersA[i] != uniqueLettersB[i]) {
					checksAB = false;
				}
			}
			
			// Return if it is or not an Anagram:
			return checksAB;
		}
		
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}

