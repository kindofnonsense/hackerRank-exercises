package javaRegex;

import java.util.Scanner;


public class JavaRegex {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
		in.close();
	}
}
// Write your code here

class MyRegex {

	String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";

	String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

	// Implementation of https://farenda.com/java/java-regex-matching-ip-address/
}