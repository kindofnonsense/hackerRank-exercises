package javaStringTokens;

import java.util.Scanner;


public class JavaStringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		s = s.trim();
		if (s.isEmpty()) {
			System.out.print("0");
			// Output:
		} else if (s.length() < 400000) {
			//split string approach:
			String[] splittedSStrings = s.trim().split("[ !,?^&*`$@#$`//._'@]+");
			
			// 1) length of splitted S
			System.out.println(splittedSStrings.length);
			
			// 2) print all the strings in splittedSStrings:
			for (String string : splittedSStrings) {
				if (!string.isEmpty()) {
					System.out.println(string);
				}
			}
		}

		// Test            YES      leading spaces        are valid,    problemsetters are         evillllll
		//		// string tokenizer approach:
		//		StringTokenizer newST = new StringTokenizer(s);
		//		
		//		// Output:
		//		// 1) the length of newST:
		//		System.out.println(newST.countTokens());;
		//		// 2) show all the tokens:
		//		while(newST.hasMoreElements()) {
		//			String tokenString = newST.nextElement().toString();
		//			System.out.println(tokenString);
		//		}

		scan.close();
	}
}
