package javaRegex2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2 {

	public static void main(String[] args) {

//		String regex = "/* Write a RegEx matching repeated words here. */";
//		String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
		String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
//		Pattern p = Pattern.compile(regex, /* Insert the correct Pattern flag here.*/ "CASE_INSENSITIVE");
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE + Pattern.MULTILINE);
		
		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());

		while (numSentences-- > 0) {
			String input = in.nextLine();

			Matcher m = p.matcher(input);

			// Check for subsequences of input that match the compiled pattern
			while (m.find()) {
//				input = input.replaceAll(/* The regex to replace */, /* The replacement. */);
				input = input.replaceAll(m.group(),m.group(1));
			}

			// Prints the modified sentence.
			System.out.println(input);
		}

		in.close();
	}
}
// INSPIRED by Arnab Saha - https://www.hackerrank.com/ArnabSaha
