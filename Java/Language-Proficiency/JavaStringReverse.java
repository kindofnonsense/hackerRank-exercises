package javaStringReverse;

import java.util.Scanner;

public class JavaStringReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		boolean equal = true;
		int i = 0;

		while (equal && i < A.length()) {
			//System.out.println("Equal? " + equal + ", i = " + i);
			if (A.charAt(i) != A.charAt(A.length()-1-i)) {
				equal = false;
			}
			i++;
		}
		if (equal) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
