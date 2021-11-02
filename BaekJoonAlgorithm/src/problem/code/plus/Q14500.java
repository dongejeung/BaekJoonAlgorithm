package problem.code.plus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/*
 * 	1. 폴리오미노가 점유하는 공간을 배열로써 표현
 *  2. 회전시 일어나는 변화 로직 삽입.(예전에 테트리스 구현해볼때 3차원배열로 표현하기도 했었음.)
 *  => 회전을 표현하는 방식이 재밌을 수 있겠다.
 *  3. 전수조사.
 */
public class Q14500 {
		static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		static int[][] field;
	public static void main(String[] args) throws Exception {
		
		field = creafield();
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int[][] creafield() throws Exception {
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		int[][] tet = new int[N][M];
		for (int i = 0; i < N; i++) {
			StringTokenizer stk2 = new StringTokenizer(br.readLine()); 
			for (int j = 0; j < M; j++) {
				tet[i][j] = Integer.parseInt(stk2.nextToken());
			}
		}
		return tet;
	}
}
