package problem.step.nine.math1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2292 {
	/*
	 * 1. 계차수열과 같은 형태로 될 것으로 추정.
	 * 
	 * 2. 껍질층별 갯수를 센다.
	 * 
	 * 3. 1층 : 1, 2층 : 6, 3층 : 12, 4층 : 18개
	 * 
	 * 4. 1 => 1, 2 ~ 7 => 2 ...
	 * 
	 * 5. 배열의 방번호에 건너는 횟수를 삽입해서 방번호로 횟수를 출력하면 될 듯.
	 * 
	 * ===
	 * 
	 * 6. 계차수열의 합을 구하고, 합이 N보다 커지면 반복문을 종료한다.
	 * 
	 * 7. 계차수열은 등차가 6인 수열이다.
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 하위 등차수열의 합 공식
		int result = 1;
		int sequenceSum = 1;
		int cnt = 1;
		while(result < N) {
			int sequence = 6;
			sequenceSum = cnt * sequence;
			result += sequenceSum;
			cnt++;
		}
		
		System.out.println(cnt);
		sc.close();
	}
}
