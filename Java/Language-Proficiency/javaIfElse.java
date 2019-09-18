package javaIfElse;

import java.util.Scanner;

public class Solution {

	public static void verify(int n) {
		//Given an integer, n, perform the following conditional actions:
		if (n % 2 == 0) {

			if (n >=2 && n <=5) {
				System.out.println("Not Weird");
			} else if (n >= 6 && n <= 20) {
				System.out.println("Weird");
			} else if (n>20 || n<2) {
				System.out.println("Not Weird");
			}
		} else {
			System.out.println("Weird");
		}
	}

	private static final Scanner scanner = new Scanner(System.in);
	

	public static void main (String[] args) {
		// TODO Auto-generated method stub

		// Sample Example 0
		int n0 = 3;
		Solution.verify(n0);
		scanner.close();
	}

}
