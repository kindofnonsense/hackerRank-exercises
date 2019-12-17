package java1DArrayPart2;

import java.util.Scanner;

public class Java1DArrayPart2 {

	public static boolean canWin(int leap, int[] game, int index) {
		
        // GOAL: Return true if you can win the game; otherwise, return false.
		
		// default result:
		boolean result = false;
		
		// FALSE: Invalid index OR invalid next point
		if (index < 0 || game[index] == 1 ) {
			return result;
		}
		
		// TRUE: i + 1 > n OR i + leap > n
		if (index + 1 >= game.length || index + leap >= game.length) {
			return !result;
		}
		
		game[index] = 1;
		
		return canWin(leap, game, index + leap) 
				|| canWin(leap, game, index + 1)
				|| canWin(leap, game, index - 1);
		
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            
            // This is a express form of 'if' condition
            System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
	
}
