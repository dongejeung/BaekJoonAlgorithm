package problem.step.nine.math1;

import java.util.Scanner;

public class Q2869_2 {
	/*
	 * V에서 뺄셈을 해서 음수가 나온다는 컨셉으로 갈 수도 있을 듯.
	 * V - A, + B, -A, +B
	 * 
	 * >> 것보다 (A-B)로 나눈것과 A만큼 올라가는 연관성에 주목하면 좋을 듯 하다.
	 * 1. A-B는 무조건 A보다 작다.
	 * 
	 * 2. days는 V / (A-B) 보다 최소한 1이 작다.
	 * 
	 * 3. V % (A-B) 
	 * 
	 * >> 아무래도 반복패턴을 봐야할 것 같은데..
	 * 
	 * 1. A-B를 편의상 D로 놓는다.
	 * 
	 * 2. (A, D), (D+A, 2D), 2D+A 이런식의 반복패턴을 보인다. 아마 수학에서 진동패턴이라고 하던가.
	 * 
	 * 3. N*D + A >= V 인 경우에 달팽이가 정상에 올라가게 된다.
	 * (x일차의 2번째 항인 N*D의 경우 D+A보다 무조건 작기 때문에 논외다. 
	 * 결국 올라가는 N*D + A 의 시점에 정상에 다다를수 밖에 없다.)
	 * 
	 * 4. 1일차부터이기 때문에 초항을 (N-1)*D + A 로 넣는 것이 적절하다. 
	 * 
	 * 5. for문을 돌려 메모리와 시간제한에 걸리는지 본다.
	 *  
	 * 6. 시간초과에 걸렸다.
	 * 
	 * 7. V를 쪼개어 보자.
	 * 7-1. V % D 의 경우 나머지가 나온다. 나머지를 따로 변수로 뺴놓자. 나머지 rest > R
	 * 7-2. A / D 의 케이스를 생각해보자.
	 * 자고 다음에 마저 보자.
	 * 
	*/	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		int D = A-B;
		int R = V % D;
		
		/*
		 * int N = 1; while((N-1)*D + A <= V) { N++; } System.out.println(N-1);
		 */
		
		
	}
}
