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

import problem.Q10971_8.Trip;


public class Q10971_9 {
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

		int min = 0;
		for (int i = 0; i < W.length; i++) {
			
		}
		
		bw.write(Integer.toString(min));

		bw.flush();
		br.close();
		bw.close();
	}
	
		
	public static Trip goTrip(int[][] W) {
		Trip t = new Trip();
		List<Trip> route = new LinkedList<Trip>();
		
			
		return t;
	}
	
	static class Trip {
		private int start;
		private int end;
		private int cost;
		
		Trip() {
			
		}
		
		Trip(int start, int end, int cost) {
			this.start = start;
			this.end = end;
			this.cost = cost;
		}
		
	}
	
}