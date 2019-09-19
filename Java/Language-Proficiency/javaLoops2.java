package javaLoops2;

import java.util.Scanner;

public class javaLoops2 {

	public static void main(String []argh){
		Scanner in = new Scanner(System.in);
		
		int t=in.nextInt();
				
		for(int i=0;i<t;i++){
			
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			// An array of size = n:
			int[] s = new int[n];
			
			// Calculating the s-array:
			s[0] = a + 1*b;
			for (int j = 1; j < n; j++) {
				s[j] = (int) (s[j-1] + b*Math.pow(2,j));
			}
			// Then print the s-array
			for (int j = 0; j < n; j++) {
				System.out.print(s[j] + " ");
			}
			// Just to jump a line.
			System.out.println("");
		}
		in.close();
	}

}
