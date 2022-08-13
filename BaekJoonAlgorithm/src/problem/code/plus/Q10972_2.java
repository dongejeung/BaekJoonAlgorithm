package problem.code.plus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 	1. 숫자와, order 가 있다는 것을 생각.
 * 
 * 	2. 주어진 Case 가 역순 정렬이 아니라면, 다음 순열이 존재한다는 뜻.
 *	
 *	3. 아무래도 이차원 배열에 순서대로 만들어 놓고 다음 값을 호출하는게 나을 것 같다.
 *
 *  4. 순열의 경우의 수만큼의 이차원 배열을 생성.
 *	
 *	5. nPr = R(n+1) / R(n -r +1)  
 */
public class Q10972_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		
		StringTokenizer stk2 = new StringTokenizer(br.readLine());
		int[] Pn = new int[N];
		for (int i : Pn) {
			i = Integer.parseInt(stk2.nextToken());
		}
		
		String ans = get_ans(Pn);
		
		bw.write(ans);

		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public static boolean chk_last_Pn(int[] arr) {
		boolean rs = true;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != (arr.length - i)) {
				rs = false;
				break;
			}
			
		}
		return rs;
	}
	
	public static int get_fixed_order(int[] Pn) {
		int rs = 0;
		for (int i = 0; i < Pn.length; i++) {
			if(Pn[i] != (Pn.length - i)) {
				rs = i;
				break;
			}
			
		}
		
		return rs;
	}
	
	
	public static String get_next_Pn(int[] Pn) {
		String rs = "";
		
		// 앞 숫자부터 고정되어 있는 부분을 구한다.
		int fixed_order = get_fixed_order(Pn);
				
		return rs;
	}
	
	
	public static String get_ans(int[] Pn) {
		String rs = "";
		
		if(!chk_last_Pn(Pn)) return "-1";
		
		return get_next_Pn(Pn);
	}
	
}
