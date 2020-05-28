package problem.step.five.trainingone;

import java.util.Scanner;

public class Q5543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
			
		int lowBurger;
		int lowDrink;
		
		if((A - B) >= 0) {
			lowBurger = B;
		} else {
			lowBurger = A;
		}
		
		if((lowBurger - C) >= 0) {
			lowBurger = C;
		}
		
		if((D - E) >= 0) {
			lowDrink = E;
		} else {
			lowDrink = D;
		}
		
		System.out.println(lowBurger + lowDrink - 50);
			
	}

}