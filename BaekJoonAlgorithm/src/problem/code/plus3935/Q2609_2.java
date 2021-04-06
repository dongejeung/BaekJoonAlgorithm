package problem.code.plus3935;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * 	1. 무식하게 할랬더니, 소인수분해 해야할 것 같음.
 * 
 * 	2. 일단 소수를 구해야할 것 같음.
 * 
 *  3. 구한 소수를 통해 소인수분해를 함.
 *  
 *  4. 소인수 분해후 공약수를 구함.
 *  
 *  5. 두 수를 곱한후 공약수로 나누면 공배수.
 *  
 *  =======
 *  
 *  7. 공약수니까 작은수보다 작은 소수들을 구함.
 *  
 *  6. 두 수를 소수들로 나누고 한꺼번에 공약수 나누는 n 번째 소수가 몇번 들어가는 지 구해서,
 *  그 중 작은 횟수가 공약수의 인수이다. 이들을 곱해서 반복문 다돌면 공약수이다.
 *  
 *  8. 두 수를 곱한 후 공약수를 나누면 최소 공배수이다.
 *  (인자들로 나누는 것이기에 소수점 문제가 발생하지 않는다.)
 * 	
 * 	9. 소수 구하는 것이 잘못되었었음.
 * 
 * 	10. 에라토스테네스의 체 같은 것을 적용할 수도 있을 듯.
 */
public class Q2609_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();

		int biggerNum = 0;
		if(M-N > 0)
			biggerNum = M;
		else
			biggerNum = N;
		List<Integer> primeNums = new LinkedList<Integer>();
		for (int i = 2; i <= biggerNum; i++) {
			primeNums.add(i);
		}
		
		for (int i = 2; i <= biggerNum; i++) {
			for (int j = 2; j <= i; j++) {
				int quotient = i / j;
				int rest = i % j;
				if(quotient > 1 && rest == 0) {
					int index = primeNums.indexOf(i);
					if(index != -1) primeNums.remove(index);
				}
			}
		}
		
		int GCF = 1;
		for(Integer num: primeNums) {
			int MCnt = divideCnt(M, num);
			int NCnt = divideCnt(N, num);
			if(MCnt > 0 && NCnt > 0) {
				if(MCnt < NCnt)
					GCF *= (num*MCnt);
				else
					GCF *= (num*NCnt);
			}
		}

		int LCM = GCF * (M / GCF )*(N / GCF );
		System.out.println(GCF);
		System.out.println(LCM);
	}
	
	public static int divideCnt(int num, int dividend) {
		int result = 0;
		int n = num;
		int qoutient = n / dividend;
		int rest = n % dividend;
		while(rest == 0) {
			result += 1;
			n /= dividend;
			qoutient = n / dividend;
			rest = n % dividend;
			
			if(n == dividend) break;
			
		}
		
		return result;
	}
	
}

