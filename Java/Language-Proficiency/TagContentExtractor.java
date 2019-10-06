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

			// 04-10-19: new regex to get all = (<([\w ]+)>)([\w ]+)(<\/([\w]+)>)
			
			// Pattern to match
			String regexAll = "(<([\\w ]+)>)([\\w ]+)(<\\/([\\w ]+)>)";
			// Compile the respective pattern:
			Pattern allPattern = Pattern.compile(regexAll);
			
			String blanksBetweenTag = "(<([\\w ]+)>)()(<\\/([\\w ]+)>)";
			Pattern blanksPattern = Pattern.compile(blanksBetweenTag);
			
			// Helpers variables
//			int iteration = 0;
			boolean moreMatches = true;
			
			while (moreMatches) {
				Matcher allMatcher = allPattern.matcher(line);	
				Matcher blanksMatcher = blanksPattern.matcher(line);
				// Verify if 'line' has the same opening and closing tags
//				System.out.println("OpTag: " + allMatcher.group(2)
//				+ ", ClTag: " + allMatcher.group(5)
//				+ ", Sentence: " + allMatcher.group(3));
				if (allMatcher.find() && allMatcher.group(2).equals(allMatcher.group(5))) {
					System.out.println(allMatcher.group(3));
//					System.out.println("Line before replace: " + line);
					line = line.replaceFirst(regexAll, "");
//					System.out.println("Line after: " + line);
					if (line.length() == 0 || blanksMatcher.find()) {
						moreMatches = false;
					}
				} else /*if (iteration == 0)*/ {
					// Only print if the 'line' didn't match
					System.out.println("None");
					moreMatches = false;
				}
//				iteration++;
			}
			testCases--;
		}
		in.close();
	}
}
