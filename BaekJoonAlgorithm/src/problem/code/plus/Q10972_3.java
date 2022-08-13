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
 * 	1. 처음에 1, 2, 3 ... n 을 init
 * 
 * 	2. 수열을 두 부분으로 나누어서
 * 	2-1. 고정해놓을 앞 부분
 * 	2-2. 배치를 변경할 뒷 부분으로 분할 한다.
 * 
 * 	3. 2-2 에서 배치를 변경할 뒷부분의 정렬이 역순으로 떨어진다면, 고정해놓을 포인트를 한 자리 옮긴다.
 * 
 * 	4. 처음에는 맨 뒤 두자리가 가변 부분이다.
 * 
 * 	5. 메모리 이슈 시에는 Pn 의 고정부 가변부를 가지고 Case 를 줄여준다.
 * 
 * 	6. 정배열이면 다음 순서에는 자릿수가 하나 올라가고, 올라간 자리수가 1 증가한다고 보면 된다.
 * 	
 */
public class Q10972_3 {
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
			if(arr[i] != arr.length-i -1) {
				rs = false;
				break;
			}
		}
		return rs;
	}
	
	
	public static int factorial(int N) {
		if(N == 2) return 1;
		return N * factorial(N-1);
	}
	
	
	public static int[] chg_last_two(int[] Pn) {
		int num1 = Pn[Pn.length-2];
		int num2 = Pn[Pn.length-1];
		
		Pn[Pn.length-2] = num2;
		Pn[Pn.length-1] = num1;
		
		return Pn;
	}
	
	public static int[] first_arr(int N) {
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
		return arr;
	}
	
	public static int[] get_last_arr(int N) {
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = arr.length - (i+1);
		}
		
		return arr;
	}
	
	
	public static boolean compare_arr(int[] arr, int[] Pn) {
		return arr.equals(Pn);
	}
	
	
	public static boolean next_arr(int[] arr) {
		boolean	rs = false;
		
		
		return rs;
	}
	
	
	public static String get_ans(int[] Pn) {
		String rs = "";
		
		// 후위가 3부터 해야 일정한 패턴을 만들기 쉬움.
		int post_size = 2;
		
		int[] compared_arr = first_arr(Pn.length);
		int[] last_arr = get_last_arr(Pn.length);
		while(true) {
			if(compare_arr(Pn, last_arr)) {
				rs = "-1";
				break;
			}
			
			
			
		}
		
		return rs;
	}
	
}
