package problem.step.nine.math1;

import java.util.Scanner;

/*
 * 1. N = 5*N + 3*M
 * 2. 브루트포스(?) (0, 1), (1, 0), (0,2) 이런식으로 전체 순서쌍을 순회한다.
 * => 증가가 순차적으로 되야하기 때문에, (0,2) 이런식으로 나와야한다. 
 * 
 * ==>> 공배수의 개념, 15마다 횟수의 감소가 일어날 수 있다.
 * 그냥 전개를 일단 해보자, 주기성을 파악 해보자.
 * 3, 5, 6, 9, 10, 13, 15, 16, 19, 20 이런식의 수열이 된다.
 * 증가의 크기가 3, 2, 1, 3, 1 이 반복된다. 
 * 15 주기마다, 5 ~> 3 으로 2의 횟수 감소가 일어난다.
 * => N / 15 * 의 횟수 감소.
 * 
 * 배열의 방번호 % 5 
 * 
 * === 
 * 잘못함. 주기가 저렇지 않음.
 * 
 * 3, 5, 6, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19
 * 
 * ===
 * 
 * 방향성을 바꿔보자.
 * 
 * 1. N = 5*N + 3*M
 * 
 * 2. N + M = 최소
 * 
 * 3. 주어진 수 N에 근접하기 위한 최소 횟수는 5kg만을 이용한 것. or 그것에 +1
 * => N % 5kg == 0 > 5kg = N / 5kg else 5kg = N / 5kg + 1
 * 
 * 4. 주어진 수 N에 근접하기 위한 최대 횟수는 3kg만을 이용한 것. or 그것에 +1
 * => => N % 3kg == 0 > 3kg = N / 3kg else 5kg = N / 3kg + 1
 * 
 * 5. 반복문의 횟수는 3 ~ 4 이다.
 * => 이 아니고 횟수의 범위다.
 * 
 * 6. 순서쌍의 조합을 브루트포스를 통해 모두 대입한다.
 * 
 * 7. 기존 나눠떨어지는 횟수와 새로운 나눠떨어지는 카운트를 비교하여 작은 것을 남긴다.
 * 
 * 8. 최종 도출된 카운트를 출력한다.
 * 
 * ==>> 5의 횟수가 가장 많을수록 횟수가 줄어들기 때문에 5를 기준으로 반복문을 돌리는 게 낫다.
 * => 3의 범위에서 카운트를 하나씩 낮춰가는 식으로 해서 나눠떨어지는 값이 나오면 break 하면 된다.
 */
public class Q2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int minCnt = 0;
		if(N % 5 == 0) {
			minCnt = N / 5;
		}else {
			minCnt = N / 5 + 1;
		}
		
		int maxCnt = 0;
		if(N % 3 == 0) {
			maxCnt = N / 3;
		}
			maxCnt = N / 3 + 1;
			
		int result = -1;
		for (int i = maxCnt; i >= 0; i--) {
			for (int j = 0; j <= maxCnt; j++) {
				
				int process = i * 5 + j * 3;
				if(N == process) {
					result = i + j;
					break;
				}
				
			}
			
			if(result != -1) {
				break;
			}
		}
		
		System.out.println(result);
		
	}
	
}
