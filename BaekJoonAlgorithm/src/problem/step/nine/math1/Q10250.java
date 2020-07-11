package problem.step.nine.math1;

import java.util.Scanner;

public class Q10250 {
	public static void main(String[] args) {
		// T: case의 개수
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int[][] cases = new int[T][3];
		for (int i = 0; i < cases.length; i++) {
			for (int j = 0; j < cases[i].length; j++) {
				cases[i][j] = sc.nextInt();
			}
		}
		
		// H: 층수, W: 방의 개수, N : 손님의 서수
		for (int i = 0; i < cases.length; i++) {
			int H = cases[i][0];
			int W = cases[i][1];
			int N = cases[i][2];
			
			int X = (N / H);
			int Y = (N % H);
			
			if(N > H) {
				if(Y == 0) {
					Y = (H+1) * 100;
					X = X -1;
					System.out.println(Y + X);
				}else if(N % H != 0) {
					Y = Y * 100;
					X = X + 1;
					System.out.println(Y + X);
				}
			}else if(N == H) {
				System.out.println(H*100 + 1);
			}else if(N < H){
				X = 1;
				System.out.println(Y + X);
			}
			
		}
	}
}