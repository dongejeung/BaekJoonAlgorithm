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
 * 	1. 전체의 합에서 두 키를 추출한 값을 뺴서 100이 나오면 정답.
 * 
 *  2. 다수 정답의 경우 신경쓸 거 없음.
 */
public class Q2309 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int sumHeight = 0;
		List<Integer> heightList = new LinkedList<Integer>(); 
		for (int i = 0; i < 9; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int ht = Integer.parseInt(stk.nextToken());
			heightList.add(ht);
			sumHeight += ht;
		}
		
		int rest = sumHeight - 100;
		
		/*
		 	순서쌍을 어떤식으로 만들 수 있을지 고려해야 한다.
		 	0, 1(2,3,4,5,6,7..)
		 	1, 2(3,4,5,6,7..)
		*/
		
		for (int i = 0; i < heightList.size(); i++) {
			for (int j = i+1; j < heightList.size(); j++) {
				// 제외할 두 수를 찾는 판별식
				if(convict(heightList.get(i), heightList.get(j), rest)) {
					heightList.remove(j);
					heightList.remove(i);
					printList(heightList, bw);
					break;
				}
			}
		}
		
				
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	public static void printList(List<Integer> List, BufferedWriter bw) throws Exception {
		Collections.sort(List);
		for (Integer integer : List) {
			bw.write(Integer.toString(integer) +"\n");
		}
	}
	
	public static boolean convict(int a, int b, int c) {
		if(c == a + b) return true;
		else return false;
	}
}
