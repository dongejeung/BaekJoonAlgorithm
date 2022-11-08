package problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.StringTokenizer;


/*
 * 	1. 도시들 사이에는 길이 있음.
 * 
 * 	2. 한 번 갔던 도시는 다시 갈 수 없음.
 * 
 * 	3. W[i][j] => from i to j
 * 
 * 	4. 자기 자신한테 가는 것과, 갈 수 없는 곳은 0 
 * 
 * 	5. start 지점도 도시 N 개 만큼 있음.
 * 	
 */
public class Q10971 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		
		int[][] W = new int[N][N];
		
		// init route W
		for (int i = 0; i < W.length; i++) {
			StringTokenizer stk2 = new StringTokenizer(br.readLine());
			for (int j = 0; j < W[i].length; j++) {
				W[i][j] = Integer.parseInt(stk2.nextToken()); 
			}
		}
		
		String ans = get_ans(W);
		bw.write(ans);

		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public static String get_ans(int[][] W) {
		int min_cost = 0;
		for (int i = 0; i < W.length; i++) {
			
			int cost = 0;
			for (int j = 0; j < W.length; j++) {
				if(W[i][j] == 0) continue;
				cost += W[i][j];
			}
			
			if(min_cost == 0) min_cost = cost;
			else if(cost < min_cost) min_cost = cost;
		}
		
		return Integer.toString(min_cost);
	}
	
}
