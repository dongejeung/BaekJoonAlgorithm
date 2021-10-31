package problem.code.plus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
/*
 * 	1. 수의 소수들을 구함.(어차피 2 빼고는 다 홀수다. 입력도 짝수네)
 * 	2. 구한 홀수를 desc 로 정렬.
 * 	3. 해당 수에서 큰 수부터 홀수를 뺀다.
 * 	4. 뺀 나머지 수가 구한 소수리스트에 있는지 확인.
 * 	5. 있으면 정답 출력.
 * 	6. 없으면 더 작은 홀수로 4 반복.
 * 	7. 순회해도 없으면 골드바흐~ 문장 출력. 
 */
public class Q6588 {
	
	public static void main(String[] args) throws Exception  {
		goldbach();
	}
	
	public static void goldbach() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(stk.nextToken());
			
			if (num == 0) break;
			
			List<Integer> pNums = new LinkedList<>();
			pNums = findPNums(num);
			Collections.sort(pNums, Collections.reverseOrder());
			
			int a = 0;
			int b = 0;
			boolean conj = false;
			for (Integer integer : pNums) {
				b = integer;
				a = num - b;
				
				if(pNums.contains(a)) conj = true;
			}
			
			String wrongCaseSentence = "Goldbach's conjecture is wrong.";
			
			String sentence = "";
			if(conj) {
				sentence = Integer.toString(num) +" = "+ Integer.toString(a) +" + "+ Integer.toString(b);
			}else {
				sentence = wrongCaseSentence;
			}
			
			bw.write(sentence +"\n");
			
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static List<Integer> findPNums(int num) {
		List<Integer> pNums = new LinkedList<>();
		
		int limit = (int)(Math.sqrt(num))+1; // 에라토스테네스의 체. 였을거임.
		
		for (int i = 2; i <= limit; i++) {
			int c = divideLimit(num, i, 0);
			if(c > 0) {
				num /= Math.pow(i, c);
				pNums.add(i);
			}
		}
		
		return pNums;
	}
	
	public static int divideLimit(int a, int b, int cnt) {
		int rest = a;
		
		if(a % b != 0) {
			return cnt;
		}
		rest /= b;
		cnt++;
		
		return divideLimit(rest, b, cnt);
	}
	
}
