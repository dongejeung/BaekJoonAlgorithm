package problem.step.five.trainingone;

import java.util.Scanner;

public class Q2446 {

	// 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
//		for (int i = 2 * N - 1; 0 < i; i = i-2) {
//			for (int j = i; 0 < j; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for (int i = 1; i < N+1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
