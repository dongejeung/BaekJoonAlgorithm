package problem.code.plus3935;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * 	아 썅 참고만 하려다가 답 보고 베꼈네.
 * 	유클리드 호재법이라고 한다.
 * 
 * 	음 보는 데 잘 이해가 안 되어서,
 * 	이래저래 좀 생각을 해봐야 겠다.
 * 
 * 	논리의 비약이 있다.(건너뛴 미싱링크가 있다는 소리)
 * 
 * 	- 먼저 나누기와 수 방정식 등 수학 개념에 대해서 이것 저것 생각해봐야겠다.
 * 
 *  - 어떤 수에서 어떤 수를 나눈다는 것이 무슨 뜻일까?
 *  
 *  - 수는 서로 연산이 가능하고, 특정한 수는 연산을 통해서 재정의가 가능하다.
 *  
 *  ex) 4 => (3 + 1)
 *  ex) 4 => (4 * 1) or (2 * 2)
 *  ex) 75 => 5 * 5 * 3 => 5^(2) * 3
 *  
 *  - 결국 특정 수를 곱연산으로 최대한 쪼개는 경우,
 *  소수들의 제곱수들의 곱의 형태로 최종적으로 쪼갤 수 있다.
 *  
 *  - 소수끼리는 서로소 관계이다.(이게 맞나? 서로 안 나누어짐.)
 *  
 *  - 나누기 연산이 성립하기 위해서는, 서로 소수^(n) 부분이 공통된 부분이 있어야 한다.
 *   그것이 최대공약수네..
 *   
 *  - 낼 아침 마저 읽어보자.
 *  
 *  -- 착각하고 있었음. 나누기는 그냥 큰 수에 작은수가 몇 번 들어갈 수 있는지라서 공통부분 이딴거 상관없이,
 *  대소 관계만 중요함.
 *  
 */
public class Q1934_3 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(stk.nextToken());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer stk2 = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(stk2.nextToken());
			int B = Integer.parseInt(stk2.nextToken());
			
			int gcd = gcd(A, B); 
			int ans = A * B / gcd;
			bw.write(ans+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}

	public static int gcd(int a, int b) {
		
		while(b != 0) {
			int r = a % b;
			
			a = b;
			b = r;
		}
		
		return a;
		
	}
	
}
