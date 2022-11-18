package problem.step.nine.math1;

import java.util.Scanner;

public class Q1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// A 고정비, B 변동비, C 가격
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		// 판매대수
		int cnt = 1;

		if(B >= C) {
			System.out.println(-1);
		}else {
			cnt = A / (C-B);
			
			cnt++;
			System.out.println(cnt);
		}
		
		sc.close();
	}
}
