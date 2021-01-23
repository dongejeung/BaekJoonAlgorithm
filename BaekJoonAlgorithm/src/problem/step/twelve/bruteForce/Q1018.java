package problem.step.twelve.bruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/*
 * 1. 가로의 칸의 개수가 짝수냐 홀수냐에 따라서 달라질 것 같다.
 * 2. B 와 W 각각의 개수를 구한다.
 * =====
 * 3. 걍 간단하게 가자.
 * 행이 짝수인 경우와 홀수인 경우에 따라 나뉜다.
 * 
 * 4. 칠하는 종류는 두 가지 이고 규칙에 따르기 때문에, 
 * 좀 더 큰 개수의 색과 더 작은 개수의 색 두개로 나뉜다.
 * 
 * 5. 큰 개수와 작은 개수를 구한다.
 * 
 * 6. 입력된 색의 개수를 각각 구한다.
 * 
 * 7. 칠해야되는 색의 개수와 현재 칠해져 있는 개수를 적절히 비교하여,
 * =====
 * 
 * 8. 아니다 보니까 M, N 이 홀수 or 짝수일 경우의 곱사건은 4 가지인데,
 * 이 중 둘다 홀 수 일 경우만 1차이가 난다. 
 *  
 */
public class Q1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		int recTangle = (N * M);
		int bigNum =0;
		int smallNum = 0;
		if(M % 2 == 1 && N % 2 == 1) {
			bigNum = (recTangle+1) / 2;
			smallNum = bigNum - 1;
		} else {
			bigNum = recTangle /2;
			smallNum = bigNum;
		}
		
		int W = 0;
		int B = 0;
		for (int i = 0; i < N; i++) {
			String row = br.readLine();
			for (int j = 0; j < row.length(); j++) {
				if(row.charAt(j) == 'W') {
					W++;
				} else {
					B++;
				}
			}
		}

		int biggerNum = 0;
		int gap = W-B;
		// 절대값
		if(gap > 0) {
			biggerNum = W;
		}
		else {
			gap = -gap;
			biggerNum = B;
		}
		
		int halfGap;
		if(gap % 2 == 1) halfGap = (gap+1) / 2; 
		else halfGap = gap / 2;
		
		int result = 0;
		if(halfGap % 2 == 1) result = (halfGap+1) / 2; 
		else result = halfGap / 2;
		
		bw.write(Integer.toString(result));
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
