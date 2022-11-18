package problem.code.plus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Comparator;
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
public class Q10972_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		
		StringTokenizer stk2 = new StringTokenizer(br.readLine());
		List<Integer> Pn = new LinkedList<Integer>();
		for(int i = 0; i < N; i++) {
			Pn.add(Integer.parseInt(stk2.nextToken()));
		}
		
		String ans = get_ans(Pn);
		
		bw.write(ans);

		bw.flush();
		br.close();
		bw.close();
	}
	
	public static List<Integer> get_last_list(int N) {
		List<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < N; i++) {
			l.add(N-i);
		}
		return l;
	}
	
	public static List<Integer> chg_last_two(List<Integer> Pn) {
		int N = Pn.size();
		int num1 = Pn.get(N-2);
		int num2 = Pn.get(N-1);
		
		Pn.remove(N-1);
		Pn.remove(N-1);
		
		Pn.add(num2);
		Pn.add(num1);
		
		return Pn;
	}
	
	public static String list_toString(List<Integer> list) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < list.size(); i++) {
			sb.append(Integer.toString(list.get(i)));
			if(i < list.size()-1) sb.append(" ");
		}
		return sb.toString();
	}
	
	
	public static boolean is_reverseOrder(List<Integer> list) {
		boolean rs = false;
		List<Integer> list2 = new LinkedList<Integer>(list);
		Collections.copy(list2, list);
		Collections.sort(list2, Collections.reverseOrder());
		if(list.equals(list2)) rs = true;
		
		return rs;
	}
	
	
	public static String get_ans(List<Integer> Pn) {
		String rs = "";
		
		int N = Pn.size();
		
		// 마지막 배열과 같을 경우 -1 출력.
		List<Integer> last_list = get_last_list(N);
		
		int tail_start = N - 2;
		
		while(true) {
			if(Pn.equals(last_list) || N ==1) {
				rs = "-1";
				break;
			}
			
			List<Integer> head = new LinkedList<Integer>(Pn.subList(0, tail_start));
			List<Integer> tail = new LinkedList<Integer>(Pn.subList(tail_start, N));
			if(is_reverseOrder(tail)) {
				tail_start--;
				continue;
			}
			
			int num1 = Pn.get(tail_start);
			tail.sort(null);
			int num2_index = tail.indexOf(num1) +1;
			int num2 = tail.get(num2_index);
			
			tail.remove(num2_index);
			head.add(num2);
			head.addAll(tail);
			
			rs = list_toString(head);
			break;
		}
		
		return rs;
	}
	
}
