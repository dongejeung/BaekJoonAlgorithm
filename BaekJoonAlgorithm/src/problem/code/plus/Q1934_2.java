package problem.code.plus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * 	1. 어찌됐든 두 수의 약수들을 구해야 하는데,
 *  벤다이어그램의 형태로 보면 공약수 부분은 한 번만 곱하고, 양 여집합 부분을 곱하면 될 것이다.
 *  
 *  2. 메모리나 성능의 문제만 없다면, 두 수를 각각 소인수분해 한 후 1의 과정을 진행하면 될 것이다.
 *  
 *  3. 여러 번 사용할 약수를 구하는 함수는 메서드로 정의하자.
 *  
 *  4. 약수를 담을 자료구조의 형태를 어떻게 가져가는 게 좋을 지 생각해보는 것도 좋겠다.
 *  자료구조와 연산방식에 따라 알고리즘의 성능이나, 메모리 사용 정도가 달라진다.
 *  
 *  5. 약수 구하는 문제는 저번에 풀었는데 왜 막바로 생각은 안난걸까..
 *  
 *  6. 사실상 단발성으로 사용할 경우 두 수 A, B의 조합들을 자료구조에다 담고 있을 필요는 없긴 한데..
 *  일단 걍 변수에 담지 말고, 걍 쓰고 출력하는 식으로 반복 해보자.
 *  
 *  7. 재귀를 사용해볼까?
 *  
 *  8. 두 수를 나누고 나머지 반환을 동시에 진행해서 공약수 부분과, 여(남은)부분을 추릴 수도 있고,
 *  그냥 두 수를 곱한 것에서 공약수 부분을 한 번 나눠줄 수도 있겠다.
 *  8-1. 각각의 약수를 구한 다음 공약수를 추린 다음 연산을 할 수도 있을 것이다.
 *  
 *  9. 두 수를 2부터 나눈 후에, 둘 다 나누어 떨어질 경우, 2를 공약수로 집어넣고, A, B에 몫을 재할당한다.
 *  ...
 *  
 *  10. 아 어떡하든 약수 구하는 최적화를 어느 정도 구현해야 하네..
 *  
 *  11. 9번의 과정을 반복하되, 둘 다 나누어 떨어지지 않을 때까지 반복하되,
 *  (
 *   1. 둘 다 나누어 떨어질 경우, 공약수에 *= 이런 식으로 곱해줄 수 있다. 그리고 몫을 각각의 수에 재할당 해준다. 
 *   2. 둘 다 나누어 떨어지지 않을 경우, 공약수에는 포함시키지 않고 2보다 큰수로 나누는 수를 올린다.
 *   3. 둘 중 한 수만 나누어 떨어질 경우, 나누어 지는 수는 재할당해주고, 아닌 수는 그대로 둔다.
 *  )  
 *  
 *  
 *  
 *  
 *  
 * 	
 */
public class Q1934_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(stk.nextToken());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer stk2 = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(stk2.nextToken());
			int B = Integer.parseInt(stk2.nextToken());
			
			int ans = findLCM(A, B);
			bw.write(ans+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}

	public static int findLCM(int A, int B) {
		
		int initA = A;
		int initB = B;
		
		int LCM = 1;
		
		int smaller = A;
		// 반복 횟수 결정을 위한 대소비교
		if(A < B) {
			smaller = B;
		}
		
		// Common factor
		int cf = 1;
		// 1은 필요없고, 2부터 약수인지 아닌지 나눌 것이다.
		for (int i = 2; i <= smaller; i++) {
			int divisor = i;
			
			// 여기서 재귀가 들어갈 수 있겠다. 메서드로 빼는 것이 맞겠다.
			int a = findFactor(0, A, i);
			int CM_A = (int)Math.pow(i, a);
			A = (A / CM_A);
					
			int b = findFactor(0, B, i);
			int CM_B = (int)Math.pow(i, a);
			B = (B / CM_B);
			
			if(CM_A < CM_B) {
				LCM *= CM_A;
			}else {
				LCM *= CM_B;
			}
			
		}
		
		int ans = initA * initB / LCM;
		
		if(initA == initB) ans = initA;
		
		return ans;
		
	}
	
	
	public static int findFactor(int cnt,int num, int divisor) {
		
		int rest = num % divisor;
		
		if(num > divisor && rest == 0 ) {
			cnt++;
			num = num / divisor;
			return findFactor(cnt, num, divisor);
		} else {
			return cnt;
		}
	}
	
}
