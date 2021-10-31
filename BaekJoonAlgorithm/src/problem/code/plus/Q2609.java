package problem.code.plus;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
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
 */
public class Q2609 {
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
		for (int i = 2; i <= (biggerNum / 2 +1); i++) {
			for (int j = 2; j <= i; j++) {
				int quotient = i / j;
				int rest = i % j;
				if(rest != 0 && quotient == 1) {
					primeNums.add(j);
					biggerNum /= j;
				}
			}
		}
		System.out.println(primeNums);
		
//		List<Map<String, Integer>> MFactors = new LinkedList<Map<String, Integer>>();
//		List<Map<String, Integer>> NFactors = new LinkedList<Map<String, Integer>>();
		Map<String, Integer> MFactors = new HashMap<String, Integer>();
		Map<String, Integer> NFactors = new HashMap<String, Integer>();
		
		for (Integer num : primeNums) {
			int qoutientM = M / num;
			int restM = M % num;
			if(restM == 0) {
				int cnt = divideCnt(M, num);
//				Map<String, Integer> factor = new HashMap<String, Integer>();
//				factor.put(num.toString(), cnt);
//				MFactors.add(factor);
				MFactors.put(num.toString(), cnt);
			}
			
			int qoutientN = N / num;
			int restN = N % num;
			if(restN == 0) {
				int cnt = divideCnt(N, num);
//				Map<String, Integer> factor = new HashMap<String, Integer>();
//				factor.put(num.toString(), cnt);
//				NFactors.add(factor);
				NFactors.put(num.toString(), cnt);
			}
		}
		
		int GCF = 0;
		for(Map.Entry<String, Integer> entry : MFactors.entrySet()) {
			for(Map.Entry<String, Integer> entry2 : NFactors.entrySet()) {
				String MKey = entry.getKey();
				String NKey = entry2.getKey();
				if(MKey.equals(NKey)) {
					
				}
			}
		}	
	}
	
	public static int divideCnt(int num, int dividend) {
		int result = 0;
		int n = num;
		int qoutient = n / dividend;
		int rest = n % dividend;
		while(rest == 0 && qoutient > 1 && qoutient != rest) {
			result += 1;
			n /= dividend;
			qoutient = n / dividend;
			rest = n % dividend;
		}
		
		return result;
	}
	
}

