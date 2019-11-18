package javaBigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
	public static void main(String[] args) {
		/* 
		 * Enter your code here. Read input from STDIN. 
		 * Print output to STDOUT. Your class should be named Solution.
		*/
		Scanner sc = new Scanner(System.in);
		// Gets the first number = a
		String aString = sc.nextLine();
		BigInteger a = new BigInteger(aString);
		// Gets the second one = b
		String bString = sc.nextLine();
		BigInteger b = new BigInteger(bString);
		// Then, prints the output of sum and multiplication of them:
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		
		
		sc.close(); 	// Close the scanner
	}
}
