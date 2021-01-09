package problem.step.nine.math1;

import java.util.Scanner;
import java.lang.Math;
/*
 * 
 * => 점화식을 함수로 표현?
 * 
 * distance의 범위의 그리드를 가정해보면,
 * 양끝이 1일 것이고, distance 회동안 계속 1씩 증가하는 케이스부터
 * 하나씩 줄여가다보면 
 * 
 * =====
 * 
 * 일단 거리별로 전개해보자 => 해보니 좌우 대칭이 안맞을 수 있다.
 * 
 * 1 => 1
 * 2 => 1, 1
 * 3 => 1, 1, 1
 * 4 => 1, 2, 1
 * 5 => 1, 1, 2, 1 				=> (1, 2, 1), 1
 * 6 => 1, 2, 2, 1 				=> (1, 2, 1), 2
 * 7 => 1, 2, 2, 1, 1			=> (1, 2, 1), 2, 1
 * 8 => 1, 2, 2, 2, 1			=> (1, 2, 1), 2, 2
 * 9 => 1, 2, 3, 2, 1			=> (1, 2, 3, 2, 1)
 * 10 => 1, 2, 3, 2, 1, 1		=> (1, 2, 3, 2, 1), 1
 * 11 => 1, 2, 3, 2, 2, 1		=> (1, 2, 3, 2, 1), 2
 * 12 => 1, 2, 3, 3, 2, 1 		=> (1, 2, 3, 2, 1), 3
 * 13 => 1, 2, 3, 2, 2, 2, 1	=> (1, 2, 3, 2, 1), 3, 1
 * 14 => 1, 2, 3, 3, 2, 2, 1	=> (1, 2, 3, 2, 1), 3, 2
 * 15 => 1, 2, 3, 3, 3, 2, 1	=> (1, 2, 3, 2, 1), 3, 3
 * 
 * 16 => (1, 2, 3, 4, 3, 2, 1)
 * 17 => (1, 2, 3, 4, 3, 2, 1), 1
 * 18 => (1, 2, 3, 4, 3, 2, 1), 2
 * 19 => (1, 2, 3, 4, 3, 2, 1), 3
 * 20 => (1, 2, 3, 4, 3, 2, 1), 4
 * 21 => (1, 2, 3, 4, 3, 2, 1), 4, 1
 * 22 => (1, 2, 3, 4, 3, 2, 1), 4, 2
 * 23 => (1, 2, 3, 4, 3, 2, 1), 4, 3
 * 24 => (1, 2, 3, 4, 3, 2, 1), 4, 4
 * 25 => (1, 2, 3, 4, 5, 4, 3, 2, 1)
 * 
 * ==>> 아아 좌우 대칭으로 만들고 나머지 부분을 따로 두어 보자.
 * 
 * ===>>> 이러면 대충 규칙성 비슷하게 보이는 듯 하다.
 * 아니다 이렇게 쪼개는 게 더 적절할 것 같다.
 * 초항부터는 계속 1씩 증가시키기만 하고, 뒤에다가 내림차순으로 배치 해보자
 * 
 * (1, 2) 1
 * (1, 2) 1, 1
 * (1, 2) 2, 1
 * (1, 2) 2, 1, 1
 * (1, 2) 2, 2, 1
 * (1, 2, 3), 2, 1
 * (1, 2, 3), 2, 1, 1
 * (1, 2, 3), 3, 2, 1
 * 
 * =====
 * 
 * 아 위에걸로 대충 할 수 있을 듯도 하다.
 * 한 번 이동으로 갈 수 있는 최대 거리를 기준으로 볼 수 있겠다.
 * 회당 최대 이동거리를 1, 2, 3, 4 로 증가시켜보고, 좌우 대칭인 패턴을 만들어보고 일반항을 도출해보면,
 * 등차수열의 합 - 최대 이동거리이다.
 * 등차수열의 합은 n{2a + (n-1)d} / 2 인데 => 초항 a = 1 이고 공차 d = 1 이다.
 * 따라서 n{2 + n-1} / 2 
 * n(n+1) / 2 가 나오는데, 여기서 두 배를 해주면 n(n+1) 이 나오고 여기서 마지막항만을 빼준다.
 * 마지막 항은 n이 된다 초항 1 공차 1인 경우
 * n^(2) + n - n => n^(2) => n 제곱이 나온다.
 * ==>> 그렇다면 n^(2) + a 라는 식이 도출되는데,
 * 여기서 a => n(x) + (n-1)(y) + (n-2)(z) 이런식이 된다.
 * (n 보다 클 수는 없고, 같을 수는 있다.)
 * 
 * =====
 * 
 * 거리가 K일 때 n의 범위는 k의 제곱근을 구해서 소수부를 버림한 것보다는 크고,
 * 위의 소수부를 버림한 것보다 1을 더한 것보다는 작을 것이다.
 * 
 * 이런 식으로 n을 구하면 n + a 의 형태로 분해할 수 있을 것이다.
 * (n의 제곱 묶음의 항의 개수는 2n-1 개일 것이다.)
 * 
 * 그럼 n의 제곱 묶음에 대한 항의 개수는 구해졌고, 
 * a 부분에 대한 항의 개수는 a/n 하고 나머지를 다시 (n-1)로 나누는 식으로 해서 나누어 떨어질 때까지 구하면 될 것이다.
 * 
 */
public class Q1011_3 {
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
			}else {
				int rootDistance = (int)Math.floor(Math.sqrt(distance));
				int baseCnt = 2 * rootDistance - 1;  
				if((Math.sqrt(distance) - (double)rootDistance) == 0.0) {
					System.out.println(baseCnt);
				} else {
					int restDistance = distance - (int)Math.pow(rootDistance, 2);
					//int additionalCnt = calRest(0, restDistance, rootDistance);
					int additionalCnt = 0;
					int cnt = 0;
					while(true) {
						cnt++;
						if(restDistance == 0) break;
						int quotient = (int)Math.floor(restDistance / rootDistance);
						if(quotient > 0) {
							additionalCnt += quotient; 
							restDistance -= additionalCnt * rootDistance;
						}
						rootDistance--;
					}
					System.out.println(baseCnt + additionalCnt);
				}
			}
			
		}
	}
	
	public static int calRest(int additionalCnt, int restDistance, int rootDistance) {
		if(restDistance == 0) {
			return additionalCnt;
		}else {
			additionalCnt += (int)Math.floor(restDistance / rootDistance); 
			if(additionalCnt > 0) {
				restDistance -= additionalCnt * rootDistance;
			}
			rootDistance--;
			return calRest(additionalCnt, restDistance, rootDistance);
		}
	}
	
}
