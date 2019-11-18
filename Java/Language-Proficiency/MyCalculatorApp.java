package javaExceptionHandling;

import java.util.Scanner;

class MyCalculator {
	// Attributes
	//	long a, b; 

	// Constructor
	public MyCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public long power(int a, int b) throws Exception, Exception {
		long result = -1;
		
		// If they are negative
		if (!(a < 0) && !(b < 0)) {
			result = (long) Math.pow(a, b);
		} else {
			throw new Exception("n or p should not be negative.");
		}
		
		// If they are zero
		if (!(a == 0) || !(b == 0)) {
			result = (long) Math.pow(a, b);
		} else {
			throw new Exception("n and p should not be zero.");
		}
		
		return result;
		
	}

}

public class MyCalculatorApp {

	public static final MyCalculator my_calculator = new MyCalculator();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in .hasNextInt()) {
			int n = in .nextInt();
			int p = in .nextInt();

			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}



