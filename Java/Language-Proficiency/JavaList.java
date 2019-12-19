package javaList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {

		/* INSTRUCTIONS:
		 * 
		 * Enter your code here. 
		 * Read input from STDIN. 
		 * Print output to STDOUT. 
		 * Your class should be named Solution. 
		 */

		Scanner sc = new Scanner(System.in);

		// Gets array initial length
		int initialLength = sc.nextInt();

		// then, populate the array
		List<Integer> array = new LinkedList<Integer>();
		for (int i = 0; i < initialLength; i++) {
			array.add(sc.nextInt());
		}

		// Quantity of queries
		int queries = sc.nextInt();

		// Query inputs
		for (int i = 0; i < queries; i++) {
			
			String operation = sc.next();

			/*
			 * INSERT
			 */

			if (operation.contains("Insert")) {
				int index = sc.nextInt();
				int value = sc.nextInt();
				
				// Then 'insert' in that 'index'
				array.add(index, value);
		
			/*
			 * DELETE			
			 */

			} else if (operation.contains("Delete")) {
				int index = sc.nextInt();				
				
				// Then 'remove' from 'index'
				array.remove(index);
			
			}
		}

		// Show the final configuration of the array
		
		for (Integer integer : array) {
			System.out.print(integer + " ");
		}

		// Closes scanner
		sc.close();
	}

}
