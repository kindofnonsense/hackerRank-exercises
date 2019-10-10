package javaBigDecimal;

import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {

	public static void main(String []args){
		//Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n+2];

		for(int i=0;i<n;i++){
			s[i] = sc.next();
		}
		sc.close();

		//Write your code here

		// Transforms 's' into BigDecimal array
//		ArrayList<BigDecimal> bigS = new ArrayList<BigDecimal>();
		ArrayList<String> sCopy = new ArrayList<String>();		// Used to copy 's'
//		ArrayList<Integer> topOrder = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
//			BigDecimal temp = new BigDecimal(s[i]);
//			bigS.add(temp);
			//			System.out.println(bigS.get(i));
			// Copy s:
			sCopy.add(s[i]);
		}
		// FIRST METHOD
		// Put 'bigS' in order
//		bigS.sort( (s2,s1) -> s1.compareTo(s2));
		
//		for (int i = 0; i < sCopy.size(); i++) {
////			System.out.println("bigS["+i+ "] = "+bigS.get(i));
//			BigDecimal temp = new BigDecimal(sCopy.get(i));
//			//			topOrder.add(sCopy.indexOf(bigS.get(i).toString()));
////			topOrder.add(Math.max(bigS.indexOf(temp), bigS.lastIndexOf(temp)));
//			topOrder.add(bigS.indexOf(temp));
//			
//			if (i>0 && topOrder.get(i-1) == topOrder.get(i)) {
//				topOrder.set(i, bigS.lastIndexOf(temp));
//			}
////			System.out.println("Order["+i+ "] = "+ topOrder.get(i) + ", value = " + sCopy.get(topOrder.get(i)));
//		}
//		
//		for (int i = 0; i < topOrder.size(); i++) {
//			s[topOrder.get(i)] = sCopy.get(i);
//		}
		
		// SECOND METHOD
		// Put sCopy in order
		sCopy.sort( (s2, s1) -> (new BigDecimal(s1)).compareTo(new BigDecimal(s2)));
		
		// Changing 's' array:
		for (int i = 0; i < n; i++) {
			s[i] = sCopy.get(i);
		}
		

//		System.out.println(" *********** ");	// Separator
		/******* DO NOT CHANGE *******/

		//Output
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
	}
}