package javaDequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class JavaDequeue {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Deque<Integer> deque = new ArrayDeque<Integer>();
        
        int n = in.nextInt();	// Number of integers
        int m = in.nextInt();	// Size of the sub-arrays
        
        long maxUnique = 0, aux = 0;

        for (int i = 0; i < n; i++) {
          int num = in.nextInt();	// Gets number
          
          if (deque.size() < m) { // In case it still in initial steps
        	  deque.add(num);	// Adds that number
        	  
        	  aux = deque.size() == m ? 
        			  deque.stream().distinct().count() 
        			  : aux;
          } else {
        	  
        	  int removed = deque.removeFirst();	// Saves the old first element
        	  
        	  if (!deque.contains(num)) aux++;		// Deque NOT contains another 'num'? If it does, increase 'aux'		
        	  if (!deque.contains(removed)) aux--;	// Deque NOT contains another 'removed' int? If yes, decrease 'aux'
        	  
        	  deque.addLast(num);
          }
          maxUnique = Math.max(maxUnique, aux);		// Value of maxUnique is between 'aux' & 'maxUnique'
        }
        
        // Print result of unique values:
        System.out.println(maxUnique);
        
        in.close();
    }
}
