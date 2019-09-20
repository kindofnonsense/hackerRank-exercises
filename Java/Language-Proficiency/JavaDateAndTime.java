package javaDateAndTime;

import java.time.LocalDate;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	LocalDate myDate = LocalDate.of(year, month, day);
    	String dayOfTheWeek = ""+myDate.getDayOfWeek();
    	// Returns a String with the day of the week
    	return dayOfTheWeek;
    }

}

public class JavaDateAndTime {

	public static void main(String[] args) {
		
		System.out.println(Result.findDay(8, 5, 2015));
		System.out.println(Result.findDay(10, 28, 2018));
		System.out.println(Result.findDay(9, 19, 2019));
	}
}
