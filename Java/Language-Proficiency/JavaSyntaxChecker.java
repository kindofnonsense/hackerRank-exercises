package javaSyntaxChecker;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaSyntaxChecker {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases > 0){
			String pattern = in.nextLine();
			//Write your code
			
			try {
				if (Pattern.compile(pattern) != null ) {
					System.out.println("Valid");
				} 
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid");
			}
			testCases--;
		}
		in.close();
	}
}
