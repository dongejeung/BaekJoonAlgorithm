package problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2452 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(stk.nextToken());
		int N = Integer.parseInt(stk.nextToken());
		
		int[][] excel = new int[M][N];
		for (int i = 0; i < M; i++) {
			StringTokenizer stk2 = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				excel[i][j] = Integer.parseInt(stk2.nextToken());
				System.out.print(excel[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}
	
}
