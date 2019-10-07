package tagContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		while(testCases > 0){
			//			boolean endMissing = true, beginMissing = true;

			String line = in.nextLine();

			//Write your code here
			
			// Inspired by BHARAT JOHRI's solution
			
			String regex = "<([^>]+)>([^<>]+)</\\1>";
			Pattern regexPattern = Pattern.compile(regex);
			Matcher regexMatcher = regexPattern.matcher(line);
			boolean findMatch = true;
			while(regexMatcher.find( )){
				System.out.println(regexMatcher.group(2));
				findMatch = false;
			} 
			if(findMatch) {
				System.out.println("None");
			}
			testCases--;
		}
		in.close();
	}
}
