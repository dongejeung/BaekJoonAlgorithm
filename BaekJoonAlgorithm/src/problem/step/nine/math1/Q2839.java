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
 * 
 * 
 */
public class Q2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int presumeN = 0;
		int[] addendN = {2, 1, 2, 1, 1, 1, 1, 1, };
		// 배열의 방번호가 주기성을 가지고 
		
		presumeN -= (N / 15) * 2;
		
		if(presumeN == N) {
			System.out.println();
		}else {
			System.out.println(-1);
		}
	}
}
