package tagContentExtractor;

import java.util.ArrayList;
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
			
			// Patterns to match
			// The open tag <ABC>
			String startPatternString = "<([a-zA-Z0-9_ ]+)>";	
			// Compile the respective pattern:
			Pattern startPattern = Pattern.compile(startPatternString);
			// The ending tag </ABC>
			String endPatternString = "<\\/([a-zA-Z0-9_ ]+)>";	
			// Compile the respective pattern:
			Pattern endPattern = Pattern.compile(endPatternString);
			// Tag to count different sentences in the string:
			String strSeparator = ">[a-zA-Z0-9_ ]+<";
			// Compile the respective pattern:
			Pattern separatorPattern = Pattern.compile(strSeparator);
			
			// Counting different sentences
			int sentencesCount = 0;
			boolean stopCounting = false;
			String lineCopy = line;
			ArrayList<String> differentLines = new ArrayList<String>();
			Matcher sepMatcher = separatorPattern.matcher(lineCopy);
			while (stopCounting == false) {
				// If line has a sentence
				if (separatorPattern.matcher(lineCopy).find() == true) {
					// Save each sentence in an ArrayList
					sepMatcher.find();
					differentLines.add(sepMatcher.group(0));
					// replace the sentence with blank
					lineCopy = lineCopy.replaceFirst(strSeparator, "");
					sentencesCount++;
//					System.out.println(sentencesCount + " " + lineCopy);
				} else {
					stopCounting = true;
				}
			}
//			System.out.println("N. Sentences = " + sentencesCount);
			// Print differentLines:
//			for (String string : differentLines) {
//				System.out.println(string);
//			}

			// Helpers variables
			int iteration = 0;
			boolean moreMatches = true;
			
			while (moreMatches) {

				// Only if the line has either start & end tags
				if (startPattern.matcher(line).find() == true
						&& endPattern.matcher(line).find() == true) {
				
					// Open tag analysis
					//				System.out.println("FOUND IT, yay!");
					Matcher startMatcher = startPattern.matcher(line);
				
					startMatcher.find();
//					String startTagString0 = startMatcher.group(0);
					// Saves start group(1);
					String startTagString1 = startMatcher.group(1);

					// Closing tag analysis
					Matcher endMatcher = endPattern.matcher(line);
				
					endMatcher.find();
//					String endTagString0 = endMatcher.group(0);
					// Saves end group(1);

					String endTagString1 = endMatcher.group(1);

					// Verify if 'line' has the same tag
					if (startTagString1.equals(endTagString1)) {


//						System.out.println(startTagString0);
//						System.out.println(endTagString0);
						// Replacing starting tag with ""
						line = line.replaceFirst(startPatternString, "");
						//					// Replacing closing tag with ""
						line = line.replaceFirst(endPatternString, "");
						// Prints the 'line' without the tags:
						if (startPattern.matcher(line).find() == true
								&& endPattern.matcher(line).find() == true) {
						} else if(iteration >= sentencesCount-1) {
							System.out.println(line);
//							String[] lines = line.split("[A-Z][a-z0-9_ ]+");
//							line.
//							for (String string : lines) {
//								System.out.println(string);
//							}	
						}
					} else {
						if (iteration == 0) {
							// Only print if the 'line' didn't match
							System.out.println("None");
						}
						moreMatches = false;
					}

				} else {
					if (iteration == 0) {
						// Only print if the 'line' didn't match
						System.out.println("None");
					}
					moreMatches = false;
				}
				iteration++;
			}
			testCases--;
		}
		in.close();
	}
}
