package javaStringsIntroduction;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        // 1. Sum the lengths of A and B:
        System.out.println(A.length() + B.length());
        
        // 2. Does B comes before A in the dictionary:
        if (A.charAt(0) > B.charAt(0)) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
        
        // 3. Capitalize the first letter in A and B 
        //    and print them on a single line, separated
        //    by a space.
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
        
        sc.close();
    }
}
