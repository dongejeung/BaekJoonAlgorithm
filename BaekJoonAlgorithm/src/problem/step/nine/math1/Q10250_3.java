package problem.step.nine.math1;

import java.util.Scanner;

public class Q10250_3 {
	/*
	 *  H, W, N => 층 수, 각 층의 방 수, 몇 번째 손님
	 *  
	 *  1. N 을 H*n + % 의 형태로 나누는 것이 좋을 것 같다.
	 *  
	 *  ==>> 개념을 바꿔보자.
	 *  
	 *  뭔가 인지부조화가 일어나서 싱크가 안맞는다.
	 *  
	 *  사고랑 코드에 미싱링크가 있다.
	 *  
	 *  ===
	 *  
	 *  공간에 순서를 주어주는 식으로 생각을 전환 해보자.
	 *  
	 *  1. 배열은 1차원 배열로 하면 될 것 같다.
	 *  
	 *  2. 배열의 크기는 H * W 이다.
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
			
			int[] temp = new int[H*W];
			
			// x => 층수
			int x = 1;
			// x => 방호수
			int y = 1;
					
			for (int j = 0; j < temp.length; j++) {
				
				temp[j] = (x*100) + y;
				
				x++;
				if(x > H) {
					x=1;
					y++;
				}
				
			}
			
			System.out.println(temp[N-1]);
		}
		
		
	}
}