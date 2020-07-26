package problem.step.nine.math1;

import java.util.Scanner;

public class Q10250_2 {
	/*
	 *  H, W, N => 층 수, 각 층의 방 수, 몇 번째 손님
	 *  
	 *  1. N 을 H*n + % 의 형태로 나누는 것이 좋을 것 같다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int[][] cases = new int[T][3];
		for (int i = 0; i < cases.length; i++) {
			for (int j = 0; j < cases[i].length; j++) {
				cases[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < cases.length; i++) {
			int H = cases[i][0];
			int W = cases[i][1];
			int N = cases[i][2];
			
			if(N < H) {
				System.out.println(100+N);
			}else if (N == H) {
				System.out.println(100+N);
			}else {
				int x = N / H;
				int y = N % H;
				
				if(y == 0) {
					int w = x * 100;
					int h = H;
					System.out.println(h+w);
				}else {
					int w = (x+1);
					int h = y * 100;
					System.out.println(h+w);
				}
				
			}
		}
		
		
	}
}