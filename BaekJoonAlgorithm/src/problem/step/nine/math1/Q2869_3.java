package problem.step.nine.math1;

import java.util.Scanner;

public class Q2869_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();
		double B = sc.nextInt();
		double V = sc.nextInt();
		
		double D = A-B;
		
		double N = Math.ceil((V - A) / D) + 1;
		if(A == V) {
			System.out.println(1);
		}else {
			System.out.println((int)N);
		}
	}
}
