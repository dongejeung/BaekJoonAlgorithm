package problem.step.nine.math1;

import java.util.Scanner;

public class Q2775 {
	/*
	 * 2차원 행렬을 전개한다고 가정하고, 점화식의 개념을 도입하면 될 것 같다.
	 * 
	 * ===
	 * 
	 * 1. 2차원 배열로 층수에는 층수의 누적합(같은 행인 것만 아래에서 위로 누적합)을 표현하고,
	 * 1-1. 뭔가 피보나치 같은 느낌인데 조금 다른 것 같다.
	 * 
	 * 2. 호수는 해당 행의 어디까지 더할 것인지 표현해보자.
	 * 
	 * 3. 어쩃든 해당 행렬의 크기만큼의 누적합을 다 더하면 될 것 같다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 수
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			
			int[][] temp = new int[H][W];

			for (int j = 1; j <= temp.length; j++) {
				
				int sum = 0;
				for (int k = 1; k <= temp[j].length; k++) {
					
					// 0층의 초기값 init
					if(j==1) {
						temp[j][k] = k;
					}else {
						int accum = 0;
						for (int l = 1; l <= j; l++) {
							accum += temp[j][k];
						}
						
						temp[j][k] = accum;
						
					}
					
				}
				
			}
			
			System.out.println(temp);
		}
		
	}
	
}
