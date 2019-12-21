package javaStack;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

	public static void main(String []argh) {

		// Start scanning keyboard
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			//Complete the code

			// Create a Stack
			Stack<Character> stack = new Stack<Character>();
			
			// Admissibility
			boolean isItOk = false;
			
			// Loop through every char of input:
			for (int i = 0; i < input.length(); i++) {
				
				char element = input.charAt(i);
				// verify if element is an opening character
				if (element == '(' || element == '[' || element == '{') {
					// the, adds it to stack
					stack.push(element);
					
				}  else if (element == ')' || element == ']' || element == '}') {
					// Stores the opposite value of element
					char correspondentOpeningTag = ' ';
					// Define the correspondent opening tag
					switch (element) {
					case ')': 
						correspondentOpeningTag = '(';
						break;
					case ']':
						correspondentOpeningTag = '[';
						break;
					case '}':
						correspondentOpeningTag = '{';
						break;
					default:
						throw new IllegalArgumentException("Unexpected value: " + element);
					}
					
					// Search for correspondent tag inside stack
					if (stack.empty() || correspondentOpeningTag != stack.pop()) {
						isItOk = false;
						i += input.length();
					} else {
						isItOk = true;
					}
				}
			}
			
			// Response
			System.out.println( stack.empty() && isItOk ? "true" : "false");
		} 
		// Closes scanner
		sc.close();
	}
}
