package javaArraylist;

import java.io.*;
import java.util.*;

public class JavaArrayList {
	public static void main(String[] args) {
        /* 
         * Enter your code here. 
         * Read input from STDIN. 
         * Print output to STDOUT. 
         * Your class should be named Solution. 
         */
		
		// Instantiate Scanner
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> first = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> answer = new ArrayList<Integer>();
	
		// Get 'n' as first input value
		int n = sc.nextInt();
		
		// Then, for 'n' times get the array
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			ArrayList<Integer> second = new ArrayList<Integer>();
			for (int j = 0; j < k; j++) {
				second.add(sc.nextInt());
			}
			first.add(second);
		}
		
		// Get 'q' queries
		int q = sc.nextInt();
		
		for (int i = 0; i < q; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			
			try {
				answer.add(first.get(x).get(y));
			} catch (Exception e) {
				// TODO: handle exception
//				System.out.println("ERROR!");
				answer.add(-999);
			}
			
		}
		
//		 Verify 'first' content
//		System.out.println(first.toString());
		
		// Show response
		for (Integer integer : answer) {
			if (integer == -999) {
				System.out.println("ERROR!");
			} else {
			System.out.println(integer);
			}
		}
		
		// Closes scanner
		sc.close();
		
    }
}
