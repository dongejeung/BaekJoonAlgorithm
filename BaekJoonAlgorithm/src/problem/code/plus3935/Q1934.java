package problem.code.plus3935;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 	1. 그냥 정석대로 구할 필욘 없음.
 * 
 */
public class Q1934 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(stk.nextToken());
		
		int[][] matrix = new int[T][2];
		for (int i = 0; i < T; i++) {
			stk = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(stk.nextToken());
			int B = Integer.parseInt(stk.nextToken());
			matrix[i][0] = A;
			matrix[i][0] = B;
			
			
			
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
