package problem.step.eight.string;

import java.util.Scanner;

public class Q10809 {
	/*
	 * 1. 콘솔에서 입력받은 문자열을 배열에다 넣는다.
	 * => 아 string이라 이미 배열인가?
	 * 
	 * 2. a ~ z 까지의 문자와 매칭되는 배열 생성.
	 * (알파벳 26개)
	 * 
	 * 3. string.indexOf(string) 함수를 통해 해당 알고리즘 구현. 
	 *  	
	 * ===
	 * 
	 * 귀찮고, 소모적이라서, 2번은 검색을 참조했다.
	 * 
	 * cf)
	 * for(int i=0; i<alpabat.length; i++) {
				alpabat[i] = (char)('a'+i);
				System.out.print(alpabat[i]+" ");
			  }
	 * 
	 * 이런식으로 하면 됌.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		// 2.
		char[] alpabat = new char[26];
		for(int i=0; i<alpabat.length; i++) {
			// char에 int 연산이 되네? 왜? ㅋㅋㅋㅋ
			alpabat[i] = (char)('a'+i);
		}
		
		for (int i = 0; i < alpabat.length; i++) {
			System.out.print(s.indexOf(alpabat[i]) + " ");
		}
		sc.close();
	}
}
