package problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;


/*
 * 	1. 모든 경우의 수는 0, 1, 2, 3 => N! 이다.  
 * 	
 */
public class Q10971_5 {
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
		
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		List<Integer> ll = new ArrayList<Integer>(4);
		List<Integer> lll = new ArrayList<Integer>();
		
		for (Integer i : ll) {
			
		}
		
		
		
//		bw.write(Integer.toString(min));

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
	
	class Trip {
		private List<Integer> route;
		public Trip(List<Integer> route) {
			this.route = route;
		}
	}
	
}
