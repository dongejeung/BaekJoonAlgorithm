package problem.step.three.forstatement;

import java.util.Scanner;

public class Q2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		/*
		 * 이중 for 문.
		 * 어찌됐든 조건만큼 연속적으로 반복해준다는 것과,
		 * 흐름도를 숙지하면,
		 * 조건의 변칙을 사용해도,
		 * 몇 번 보면 이해할 수 있다.
		*/
		
		for (int i = 0; i < N; i++) {
			for (int j = N-1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
