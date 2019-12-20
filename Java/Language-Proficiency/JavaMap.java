package javaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
	
	public static void main(String []argh) {
		/*
		 * GIVEN HACKERRANK CODE
		 * 
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
		}
		 */
		
		/*
		 *  MY VERSION
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		// Create an Map of size 'n'
		Map<String, Integer> list = new HashMap<String, Integer>(n);
		
		// Populate this map
		for(int i = 0; i < n; i++) {
			// Gets from Keyboard
			String name = sc.nextLine();
			int phone = sc.nextInt();
			// Inserts it on map
			list.put(name, phone);
			sc.nextLine();
		}
		while(sc.hasNext())
		{
			String query = sc.nextLine();
			
			if (list.containsKey(query)) {
				// print the person's name and phone number
				System.out.println(
						query
						+ "="
						// Returns a number associated with that 'query' input
						+ list.get(query)
						);
			} else {
				// print "Not found" if the person has no entry in the phone book.
				System.out.println("Not found");
			}
		}
		
		// closes scanner
		sc.close();
	}
}
