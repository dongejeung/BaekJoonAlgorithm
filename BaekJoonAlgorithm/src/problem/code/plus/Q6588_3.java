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
public class Q6588_3 {
	
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
			
			int startNum = num -1;
			
			boolean conj = false;
			
			String sentence = "";
			
			for (int i = startNum; i > 2; i = i - 2) {
				if(judgePNum(i)) {
					int b = i;
					int a = num - b;
					
					if(a > 1 && judgePNum(a)) {
						sentence = Integer.toString(num) +" = "+ Integer.toString(a) +" + "+ Integer.toString(b) +"\n";
						break;
					}
					
				} else {
					sentence = "Goldbach's conjecture is wrong.\n";
				}
				
			}
			bw.write(sentence);
			
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static boolean judgePNum(int num) {
		int limit = (int)(Math.sqrt(num))+1;
		boolean flag = true;
		
		for (int i = 2; i <= limit; i++) {
			boolean continueFlag = divideNoRest(num, i);
			if(!continueFlag) {
				flag = false;
				break;
			}
			
		}
		
		return flag;
	}
	
	public static boolean divideNoRest(int a, int b) {
		if(a % b == 0) {
			return false;
		}
		return true;
	}
	
}
