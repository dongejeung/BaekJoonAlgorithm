package problem.code.plus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q14500 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		int[][] tet = new int[N][M];
		for (int i = 0; i < N; i++) {
			StringTokenizer stk2 = new StringTokenizer(br.readLine()); 
			for (int j = 0; j < M; j++) {
				tet[i][j] = Integer.parseInt(stk2.nextToken());
				bw.write(Integer.toString(tet[i][j])+" ");
			}
			bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
