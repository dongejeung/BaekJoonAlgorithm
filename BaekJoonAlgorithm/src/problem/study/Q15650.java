package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * 조합의 개념인 것 같은데.. 
 * 잘 생각이 나질 않는다. ㅋㅋㅋㅋ
 */
public class Q15650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		// 수의 최대수
		int N = Integer.parseInt(stk.nextToken());
		// 수열의 항수
		int M = Integer.parseInt(stk.nextToken());
		
		int startNum = 1;
		int endNum = N;
		
		for (int i = 0; i < M; i++) {
			bw.write(Integer.toString(i+1)+ " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
}
