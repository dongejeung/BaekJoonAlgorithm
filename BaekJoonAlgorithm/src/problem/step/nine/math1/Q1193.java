package problem.step.nine.math1;

import java.util.Scanner;

public class Q1193 {
	/*
	 * 1. 운이 좋게도 쉬운 규칙성을 찾았다.
	 * 
	 * 2. 대각선상의 분수들은 분자 + 분모의 합의 값이 동일하다.
	 * 
	 * 3. 2, 3, 4 ...
	 * 
	 * 4. X번쨰 항이 몇 번째 순서에 있는 대각선인지 구한다.
	 * 4-1. 항의 개수의 합은 등차가 1인 등차수열이다.
	 * 4-2. 반복문으로 등차수열의 합이 X보다 커지는 위치를 구하자. 
	 *  
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		int cnt = 1;
		int cntSum = 0;
		while(cntSum < X) {
			cntSum += cnt;
			cnt++;
		}
		// 짝수행 홀수행 방향 지그재그로 바뀜.
		int denominator;
		int molecule;
		if(cnt % 2 == 0) {
			molecule = cntSum - X+1;
			denominator = cnt - molecule;
		}else {
			 denominator = cntSum - X+1;
			 molecule = cnt - denominator;
		}
		
		// 최대공약수로 나눠야 함. 이 아니라, 지그재그라는 것을 뺴먹은 듯.
		
		
		System.out.println(molecule +"/"+ denominator);
		sc.close();
	}
}
