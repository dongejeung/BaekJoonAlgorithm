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
public class Q10971_2 {
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
		int min_cost = 0;
		
		List<Integer> l = get_cities(W);
		Route R = new Route(l);
		
		return Integer.toString(min_cost);
	}
	
	
	public static List<Integer> get_cities(int[][] W) {
		List<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < W.length; i++) {
			l.add(i);
		}
		return l;
	}
	
	static class Route {
		private static int min_cost;
		private int start_city;
		private int next_city;
		private List<Integer> cities;
		
		public Route(List<Integer> cities) {
			this.cities = cities;
		}
		
		public void get_min(int[][] W) {
			int N = W.length;
			
			List<Integer> cities = this.cities;
			for (Integer first_city : cities) {
				List<Integer> citiesRoute = new LinkedList<Integer>(); 
				Collections.copy(citiesRoute, cities);
				
				
			}
		}
		
	}
	
}


