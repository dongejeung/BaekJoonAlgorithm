package problem.step.three.forstatement;

import java.util.List;
import java.util.Scanner;

public class Q10950 {
	public static void main(String[] args) {
		/*
		 * 문제를 잘못 이해하고 있었음..
		 * 문제를 잘못 읽었다.
		 * 테스트의 갯수 T가 처음에 입력값인데..
		 * 나는 입력값을 하나만 넣은 케이스하고 랜덤한 열의 인풋이 한꺼번에 들어가는줄 앎.
		*/
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		for (int i = 0; i < A; i++) {
			int B = sc.nextInt();
			int C = sc.nextInt();
			System.out.println(B + C);
		}
		sc.close();
	}
}
