package problem.step.nine.math1;

import java.util.Scanner;
/*
 * 아마 대칭의 형태를 띄고 있을 것으로 예측
 * 거리가 홀수일 경우 짝수일 경우를 나눠야 할 듯
 * 
 * =====
 * 
 * => 점화식을 함수로 표현?
 * 
 */
public class Q1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 수
		int T = sc.nextInt();
		
		int[] cases = new int[T];
		
		for (int i = 0; i < cases.length; i++) {
			int distance = 0;
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			distance = end - start;
			
			
		}
	}
	
	public static int nextDistance(int pre) {
		
		int next = pre;
		
		return 0;
	}
}
