public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	// Declaring variables:
    	int altitude = 0;
    	int seaLevel = 0;
    	int numberOfValleyes = 0;
    	
    	// Convert 's'string to a char array:
    	char[] charS = s.toCharArray();
    	
    	for (char way : charS) {
    		// Verify if he is going UP(U) or DOWN(D)
			if (way == 'D') {
				
				// So here, the hiker is going DOWN and below seaLeavel. This is a valley!
				if (altitude == seaLevel) {
					numberOfValleyes++;
				}
				altitude--;
			} else {
				altitude++;
			};

		}
    	
    	// Must return the number of times the hiker pass trough a valley 
    	return numberOfValleyes;
    };
    
    public static void main(String[] args) {
    	
    	System.out.println("numberOfValleys = "+Solution.countingValleys(8,"UDDDUDUU"));
    	System.out.println("numberOfValleys = "+Solution.countingValleys(8,"DDUUUUDD"));
    	System.out.println("numberOfValleys = "+Solution.countingValleys(12,"DDUUDDUDUUUD"));
    	
    };
}