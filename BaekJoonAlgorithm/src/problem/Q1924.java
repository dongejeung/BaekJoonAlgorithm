package problem;

import java.util.Scanner;

public class Q1924 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day   = scan.nextInt();
		int today;
		int totalDate = 0;
		
		int [] monthArray = {31, 28, 31, 30, 31, 30,
							 31, 31, 30, 31, 30, 31};
		if(month != 1) {
			for (int i = 0; i < month-1; i++) {
				
				totalDate += monthArray[i];
			}
		}		
		
		totalDate = totalDate + day;
		
		String [] dayArray = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		System.out.println(dayArray[totalDate%7]);
	}

}

