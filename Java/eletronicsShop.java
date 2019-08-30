package eletronicsShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

	/*
	 * Complete the getMoneySpent function below.
	 */
	static int getMoneySpent(final int[] keyboards, final int[] drives, final int b) {

		/*
		 * Write your code here.
		 */
		// Declaring variables:

		int maxAmountPaid = 0;
		ArrayList<Integer> amountPaid = new ArrayList<Integer>();

		// Ordering the arrays keyboards and drives:
		Arrays.sort(keyboards);
		Arrays.sort(drives);
		//System.out.println(Arrays.toString(keyboards));
		//System.out.println(Arrays.toString(drives));

		// Choosing the matching combination (max keyboard option, max drives option)
		for (int keyb : keyboards) {
			for (int usb : drives) {
				amountPaid.add(keyb + usb);	// For each loop, sum keyboard + drive into amountPaid
				//System.out.println(amountPaid.get(amountPaid.size()-1));
			}
		}
		// Ordering the amountPaid arraysList
		Collections.sort(amountPaid);
		//System.out.println(amountPaid);

		if (amountPaid.get(0) > b) {
			return -1;
		} else {
			for (int amount = 0; amount < amountPaid.size(); amount++) {
				if (amountPaid.get(amount) > b && maxAmountPaid == 0) {
					maxAmountPaid = amountPaid.get(amount-1);
				}
			}
			return maxAmountPaid;
		}
		
	}

		// Testing:
		public static void main(String[] args) {

			// Sample Input 0:
			int[] key0 = {3,1};
			int[] usb0 = {5,2,8};
			System.out.println("Sample Input 0 = "+Solution.getMoneySpent(key0, usb0, 10));

			// Sample Input 1:
			int[] key1 = {4};
			int[] usb1 = {5};
			System.out.println("Sample Input = "+Solution.getMoneySpent(key1, usb1, 5));
		}
	}
