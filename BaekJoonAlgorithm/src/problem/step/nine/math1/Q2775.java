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
		int[][] test = new int[T][2];
		for (int i = 0; i < test.length; i++) {
				test[i][0] = sc.nextInt()+1;
				test[i][1] = sc.nextInt();
		}
		
		for (int i = 0; i < test.length; i++) {
			int H = test[i][0];
			int W = test[i][1];
			
			int[][] temp = new int[H][W];
			
			for (int j = 0; j < temp.length; j++) {
				
				int sum = 0;
				for (int k = 0; k < temp[0].length; k++) {
					
					// 0층의 초기값 init
					if(j==0) {
						temp[j][k] = k+1;
					}else {
						for (int l = 0; l <= k; l++) {
							temp[j][k] += temp[j-1][l];
						}
					}
				}
			}
			System.out.println(temp[H-1][W-1]);
		}
		
	}
	
}
