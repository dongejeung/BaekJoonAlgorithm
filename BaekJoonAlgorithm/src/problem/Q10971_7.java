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
public class Q10971_7 {
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
				if(i != j && cost > 0) {
					t.add(new Trip(i, j, cost));
				}
			}
		}

		for (Trip trip : t) {
			trip.goTrip(trip.start, trip, t, W);
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
		
		List<Trip> filterHaveBeen(Trip trip, List<Trip> tl){
			List<Trip> filteredRoute = new LinkedList<Trip>();
			for (Trip t : tl) {
				if(trip.start != t.end)
					filteredRoute.add(t);
			}
				
			return filteredRoute;
		}
		
		void goTrip(int start, Trip trip, List<Trip> route, int[][] W) {
			if(chkSameEnd(route)) {
				for (Trip trip2 : route) {
					if(W[trip2.end][start] != 0) {
						int costs = trip.cost + trip2.cost +W[trip2.end][start];
						if(min == 0) min = costs;
						if(costs < min) min = costs;
					}
				}
				return;
			}
			
			List<Trip> filteredRoute = filterHaveBeen(trip, route);
//			filteredRoute.addAll(route);
//			for (Trip t : filteredRoute) {
//				if(trip.start == t.end)
//					filteredRoute.remove(filteredRoute.indexOf(t.end));
//			}
			
			for (Trip t : filteredRoute) {
				if(trip.start != t.end) {
					int costs = trip.cost + t.cost;
					Trip nextTrip = new Trip(trip.end, t.end, costs);
					goTrip(start, nextTrip, filteredRoute, W);
				}
			}
		}
		
	}
	
}
