package pickingNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Result {

	/*
	 * Complete the 'pickingNumbers' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts INTEGER_ARRAY a as parameter.
	 */

	public static int pickingNumbers(List<Integer> a) {
		// Write your code here
		int oneHigher = 0;
		int oneLower = 0;
		int maxResults = 0;
		ArrayList<Integer> combinations = new ArrayList<Integer>();
		ArrayList<Integer> convertedA = new ArrayList<Integer>();

		// Convert 'a' given list to convertedA:
		for (int item : a) {
			convertedA.add(item);
		}

		// Loop for every item on 'a' list:
		for (int i = 0; i < convertedA.size(); i++) {
			// Select the first integer to compare to the others

			oneHigher = 0;	// For every 'i', makes these counters zero
			oneLower = 0;
			// With the numberOne, compare with the others integers on 'a' list:
			for (int j = i; j < convertedA.size(); j++) {
				//System.out.print("i = "+convertedA.get(i)+", ");
				//System.out.println("j = "+convertedA.get(j));

				// Find those value -1 and equals to value:
				if ((convertedA.get(j) >= convertedA.get(i) - 1) && (convertedA.get(j) <= convertedA.get(i))) {
					oneLower++;
				}
				
				// Find those value +1 and equals to value:
				if ((convertedA.get(j) <= convertedA.get(i) + 1) && (convertedA.get(j) >= convertedA.get(i))) {
					oneHigher++;
				}
			}
			
			combinations.add(oneHigher);
			combinations.add(oneLower);
			//System.out.println("Combination's Array = "+combinations);
		}

		// Select the maximum number of 'combinations' array:
		
		maxResults = Collections.max(combinations);
		return maxResults;
	}


	// Testing:
	public static void main(String[] args) {

		// Sample Input 0:
		ArrayList<Integer> input0 = new ArrayList<Integer>();
		input0.add(4);
		input0.add(6);
		input0.add(5);
		input0.add(3);
		input0.add(3);
		input0.add(1);

		System.out.println("Input 0 = "+input0.toString());
		System.out.println("Sample Input 2 = "+Result.pickingNumbers(input0));

		// Sample Input 1:
		ArrayList<Integer> input1 = new ArrayList<Integer>();
		input1.add(1);
		input1.add(2);
		input1.add(2);
		input1.add(3);
		input1.add(1);
		input1.add(2);

		System.out.println("Input 1 = "+input1.toString());
		System.out.println("Sample Input 0 = "+Result.pickingNumbers(input1));

		// Example Input 0:
		ArrayList<Integer> ex0 = new ArrayList<Integer>();
		ex0.add(1);
		ex0.add(1);
		ex0.add(2);
		ex0.add(2);
		ex0.add(4);
		ex0.add(4);
		ex0.add(5);
		ex0.add(5);
		ex0.add(5);

		System.out.println("Example 0 = "+ex0.toString());
		System.out.println("Sample Example 0 = "+Result.pickingNumbers(ex0));
	}

};