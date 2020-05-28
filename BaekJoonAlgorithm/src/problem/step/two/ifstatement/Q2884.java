package problem.step.two.ifstatement;

import java.util.Scanner;

public class Q2884 {
	public static void main(String[] args) {
		/*
		 * 첫째 줄에 두 정수 H와 M이 주어진다. 
		 * (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간
		 * H시 M분을 의미한다.
		 * 
		 * 입력 시간은 24시간 표현을 사용한다.
		 * 24시간 표현에서 하루의 시작은 0:0(자정)이고,
		 * 끝은 23:59(다음날 자정 1분 전)이다.
		 * 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
		 */
		
		/*
		 * 1 시간 = 60분
		 * 24 시간 넘어가면 1시로 바뀜
		 * 
		 * Solve1 : 1시간을 60분으로 바꿔서 계산 후 60으로 나눈 몫과 나머지로 해봄.
		 * => 0 30 분 값은 것은 분기로 따로 나누어야 하는데.. 이게 예쁜가?
		 * 
		 * Solve2 : 시간과 분을 다른 변수로 설정.
		 * => 얘도 0 30 분은 따로 나눠야되지 않나 싶네. 
		 * 
		 * Solve1 로 가겠음.
		*/
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int totalMin = A * 60 + B;
		
		// 45와 같은 경우 0 0 으로 됨.
		if(totalMin < 45 ) {
			totalMin = 24 * 60 + totalMin;
		}
		
		totalMin = totalMin - 45;
		
		System.out.print(totalMin / 60+ " ");
		System.out.print(totalMin % 60);
	}
}
