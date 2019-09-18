package javaOutputFormatting;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("================================");
		for(int i=0;i<3;i++){
			String s1 = sc.next();
			String x1;
			int originalLength = s1.length();
			int x = sc.nextInt();
			//Complete this line
			
			// Adding blank spaces into s1 string:
			for (int j = 0; j < 15 - originalLength; j++) {
				s1 += " ";
			}
			//System.out.println("s1 length = "+s1.length());
			
			// Formatting 'x' int to appear with 3 digits:
			if (x < 100 && x >= 10) {
				x1 = "0"+x;
			} else if (x < 10) {
				x1 = "00"+x;
			} else {
				x1 = ""+x;
			}
			System.out.println(s1+x1);
			
		}
		sc.close();
		System.out.println("================================");

	}
}
