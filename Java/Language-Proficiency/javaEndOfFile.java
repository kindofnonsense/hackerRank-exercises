package javaEndOfFile;

import java.util.Scanner;

public class javaEndOfFile {
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		int numberOfSentences = 0;
		
		while (scan.hasNext()) {
			numberOfSentences++;
			System.out.println(numberOfSentences + " " + scan.nextLine());
		}
		
		scan.close();
	}
}
