package javaCurrencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        

        // Write your code here.
        // Establishing the locale with Locale class:
        Locale US = Locale.US;
        Locale CN = Locale.CHINA;
        Locale FR = Locale.FRANCE;
        
        // Creating a locale for INDIA:
        Locale IN = new Locale("en", "IN");
        
        
        // Associating locale's with the variables:
        NumberFormat us = NumberFormat.getCurrencyInstance(US);
        NumberFormat india = NumberFormat.getCurrencyInstance(IN);
        NumberFormat china = NumberFormat.getCurrencyInstance(CN);
        NumberFormat france = NumberFormat.getCurrencyInstance(FR);
        
        // Then printing the formatted payment in all currencies:
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }

}