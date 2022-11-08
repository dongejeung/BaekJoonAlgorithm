package problem;

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
public class Q10971_3 {
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
	

	/*
	 *	- List 에 할당해서 갔던 도시는 빼고 후행을 돌린다.
	 *
	 *  - start 지점 i 는 N = W.length 만큼 있다.
	 * 
	 */
	public static String get_ans(int[][] W) {
		
		Route R = new Route(W);
		int ans = R.get_min(W);
		
		return Integer.toString(ans);
	}
	
	
	static class Route {
		private int depart;
		private int dest;
		private List<Integer> cities;
		
		public Route(int[][] W) {
			this.depart = 0;
			this.dest = 0;
			this.cities = get_cities(W.length);
		}
		
		public Route(int dep, int dest, List<Integer> cities) {
			this.depart = dep;
			this.dest = dest;
			this.cities = cities;
		}
		
		private List<Integer> get_cities(int cityCnt) {
			List<Integer> l = new LinkedList<Integer>();
			for (int i = 0; i < cityCnt; i++) {
				l.add(i);
			}
			return l;
		}
		
		public int get_min(int[][] W) {
			
			int min = 0;
			int cost = 0;
			
			int N = W.length;
			for (int i = 0; i < N; i++) {
				int depart = i;
				List<Integer> cities = get_cities(N);
				
				if(min == 0) min = cost;
			}
			
			return min;
			
		}
		
	}
	
}


