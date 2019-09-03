package solution;

public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
    	// Declaring variables:
    	int DiffXZ = Math.abs(x - z);
    	int DiffYZ = Math.abs(y - z);

    	// If cat  catches the mouse first, print Cat A.
    	if (DiffXZ < DiffYZ) {
    		return "Cat A";
    	} else if (DiffYZ < DiffXZ) {
    		// If cat  catches the mouse first, print Cat B.
        	return "Cat B";
    	} else {
    		// If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.
        	return "Mouse C";
    	}
    }
    // Testing
    public static void main(String[] args) {
    	// Example Sample 0:
		System.out.println(catAndMouse(2, 5, 4));
		// Sample Input 0:
		System.out.println(catAndMouse(1, 2, 3));
		System.out.println(catAndMouse(1, 3, 2));
		};
}