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
public class Q10971_6 {
	static int min = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		
		int[][] W = new int[N][N];
		
		List<Trip> t = new LinkedList<Trip>();
		for (int i = 0; i < W.length; i++) {
			StringTokenizer stk2 = new StringTokenizer(br.readLine());
			for (int j = 0; j < W[i].length; j++) {
				int cost = Integer.parseInt(stk2.nextToken());
				W[i][j] = cost;
				if(i != j && cost > 0) t.add(new Trip(i, j, cost));
			}
		}
		
		for (Trip trip : t) {
			System.out.println(trip.start+" "+trip.end+" "+trip.cost);
			trip.tripTree(trip.start, trip, t, W);
		}
		
		bw.write(Integer.toString(min));

		bw.flush();
		br.close();
		bw.close();
	}
	
	static class Trip {
		private int start;
		private int end;
		private int cost;
		
		Trip(int start, int end, int cost) {
			this.start = start;
			this.end = end;
			this.cost = cost;
		}
		
		boolean chkSameEnd(List<Trip> route) {
			boolean rs = true;
			int end = route.get(0).end;
			for (Trip trip : route) {
				if(end != trip.end) rs = false;
			}
			
			return rs;
		}
		
		void tripTree(int start, Trip trip, List<Trip> route, int[][] W) {
			Trip tt = new Trip(trip.start, trip.end, trip.cost);
			if(chkSameEnd(route)) {
				for (Trip trip2 : route) {
					int costs = tt.cost + trip2.cost +W[trip2.end][start];
					if(min == 0) min = costs;
					if(costs < min) min = costs;
				}
				return;
			}
			
			List<Trip> availRoute = new LinkedList<Trip>();
			for (Trip t : route) {
//				t.cost += trip.cost;
				if(tt.start != t.end) availRoute.add(t);
			}
			
			for (Trip t : availRoute) {
				int costs = t.cost + trip.cost;
				Trip t2 = new Trip(tt.end, t.end, costs);
				tripTree(start, t2, availRoute, W);
			}
		}
		
	}
	
}
