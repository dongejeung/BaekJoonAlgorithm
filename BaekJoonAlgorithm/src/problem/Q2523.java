package problem;

import java.util.Scanner;

public class Q2523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i < N+1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = N-1; 0 < i; i--) {
			for (int j = i; 0 < j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		System.out.println(N);
//		for (int i = N; 0 < i; i--) {
//			System.out.println("hey");
//		}
	}

}
