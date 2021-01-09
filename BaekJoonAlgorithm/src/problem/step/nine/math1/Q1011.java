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
 * =====
 * 
 * 1. 거리가 홀수일 경우는 가운데가 홀수가 될 것이고, 대칭을 띌 듯
 * 
 * 2. 거리가 짝수일 경우는 가운데 두 수 까지 대칭을 띌 것임
 * 
 * 3. 최대 횟수의 경우에는 모든 거리가 1이라고 가정할 수 있고, 거기서 줄여가는 패턴으로 쓸 수 있을 듯
 * 
 * 4. 각 항의 값은 이전항과 같을 수 있음
 * 
 * 5. 최소 횟수가 나오려면 중심을 기준으로 등차가 1인 수열의 형태를 띄어야 함
 * 
 * 6. 일단 대충 홀수인 경우에는 1을 빼고 반 갈라도 될 것 같다.
 * 
 * 7. 걍 등차가 1인 등차수열의 합으로 반 가른 것을 나눠보고 안되면, 
 * 반 가른수에서 1씩 빼서 등차수열의 합으로 나눠보면 되려나? 
 * 
 * 
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
			
			if(distance <= 3) {
				System.out.println(distance);
			}else if(distance % 2 == 0) {
				//distance - x = n(2a+(n-1)d) / 2
				// => distance - x = n(n+1) / 2
				
				//while
			}else {
				
			}
			
		}
	}
	
	// 거리가 홀수
	public static int oddCase(int distance) {
		
		int next = distance;
		
		return 0;
	}
	
	// 거리가 짝수
	public static int evenCase(int distance) {
		
		int next = distance;
		
		return 0;
	}
}
