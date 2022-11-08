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
public class Q10971_4 {
	static int min = 0;
	static int init = 0;
	static int cost = 0;
	static int initMin =  0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		
		int[][] W = new int[N][N];
		
		for (int i = 0; i < W.length; i++) {
			StringTokenizer stk2 = new StringTokenizer(br.readLine());
			for (int j = 0; j < W[i].length; j++) {
				W[i][j] = Integer.parseInt(stk2.nextToken()); 
			}
		}
		
		
		for (int i = 0; i < W.length; i++) {
			cost = 0;
			init = i;
			List<Integer> l = get_cities(W.length);
			
			for (Integer j : l) {
				List<Integer> avail_cities = get_cities(W.length);
				avail_cities.remove(i);
				if(avail_cities.contains(j))
					trip(i, j, avail_cities, W);
			}
		}
		
		bw.write(Integer.toString(min));

		bw.flush();
		br.close();
		bw.close();
	}
	
	public static List<Integer> get_cities(int cityCnt) {
		List<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < cityCnt; i++) {
			l.add(i);
		}
		return l;
	}
	
	public static void trip(int dep, int dest, List<Integer> avail_cities, int[][] W) {
			
		cost += W[dep][dest];
		avail_cities.remove(avail_cities.indexOf(dest));
		int N = avail_cities.size();
		if(N == 1) {
			int a = avail_cities.get(0);
			cost += W[dest][a];
			cost += W[a][init];
			if(min == 0) {
				min = cost;
			}
			else if(cost < min) min = cost;
		}
		for (Integer nextCity : avail_cities) {
			trip(dest, nextCity, avail_cities, W);
		}
	}
	
}
