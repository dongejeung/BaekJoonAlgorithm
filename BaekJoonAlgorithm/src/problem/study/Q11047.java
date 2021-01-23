package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 	샘플 케이스를 보았을 땐 동전의 가치가 5의 배수라는 것을 이용하면,
 * 	더 쉬울수도 있는 데 일반식을 구한다는 관점에선 안 좋을 수도 있을 것 같다.
 * 
 * 	동전이 1 or 5 & 10^(N) 일 필요는 없는데 말이다 ㅋㅋ
 * 	
 * 	A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수 인 조건이 있네
 * 
 * 자리수와 2진법을 결합한 식을 만들면 더 일반식에 가까운 공식이 나올것도 같은데, 
 * 귀찮다
 * 
 * 코딩의 관점에선 연산 모수를 소거하는 것이 최적화 테크닉의 괜찮은 방법인 것 같기도 하다.
 * 	
 * 
 * 아마 동전의 종류가 한정되어 있기 때문에 
 * 모든 경우의 수를 계산한 (그리디 맞나) 것중에 최소를 때려박을 수 있을지도 모른다.
 * 
 * ===
 * 1. 동전의 종류는 Unique 하다.
 * 2. 동전의 크기가 구해야되는 합계보다 큰 경우는 쓰일 수가 없어서 의미가 없다.
 * 3. 동전의 가치가 오름차순이라는 것은 수열의 관점에서 봤을 때 전 항과의 대소관계가 일정하다는 것을 알 수 있다.
 * (ETC Big O 계산법과 연산에 걸리는 시간의 짐작값을 알 수 있으면, 
 * 대충 어떤 로직으로 해가 나올 수 있는지 짐작할 수도 있겠다.)
 * 4. ax^(?) + by^(?) ... 의 방정식의 형태로 표현이 가능하다.
 * 5. 1번 항과 마지막항으로 대상 값을 나눌 경우의 몫으로 최소 회수의 범위를 한정할 수 있다.
 * 6. 뭔가 추가적인 조건으로 추정되는 A1 = 1 인 경우... 
 * └ 뭔가 이유가 있어서 넣거나, 힌트를 주려고 넣거나, 어쩔 수 없이 넣거나 할 만한 조건이다.
 * 
 * 7. 현재까지 추정한 조건들로 만들 수 있는 식은ㅇㄴㅁ
 * 7-1. N > K 인 경우의 N을 제외한다.
 * 7-2. K / N(0) 최대 회수의 범위 시작 ~ K /N(n) 최대 회수의 범위 마지막
 * 정도로 근사치를 때려볼 수 있겠다.
 * 7-3. 보통 최소회수를 구하는 경우는 가장 큰수의 순서로 많이 들어가는 경우가 있을 수 있다.
 * 
 */
public class Q11047 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(stk.nextToken());
		int K = Integer.parseInt(stk.nextToken());
		
		// 아 일단 N 개 만큼 할당하자
		int[] coins = new int[N];
		for (int i = 0; i < coins.length; i++) {
			int coin = br.read();
			coins[i] = coin;
		}
		
		int startSize = K / coins[0];
		int endSize = K / coins[coins.length-1];
		
		// 주어진 조건이 있으니까 걍 초항이 1인 경우와 아닌 경우르 나눠봄
		
		if(coins[0] == 1) {
			
		}
		
		// 음 범위를 이렇게 줄여도.. endSize^(N) 의 경우의 수가 나올텐데..
		
		
	}
	
}
