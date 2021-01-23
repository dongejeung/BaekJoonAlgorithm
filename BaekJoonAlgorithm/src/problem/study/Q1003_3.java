package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 걍 결과 구현한 것을 보니 피보나치 수열의 n-1, n 항이다.
 */
public class Q1003_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int TC = Integer.parseInt(br.readLine());
		for (int i = 0; i < TC; i++) {
			int N = Integer.parseInt(br.readLine());
			
			if(N == 0) {
				bw.write("1 0\n");
			}else if(N == 1) {
				bw.write("0 1\n");
			}else {
				int cnt0 = 0;
				int cnt1 = 1;
				for (int j = 0; j < N-1; j++) {
					int tmpCnt0 = cnt1;
					int tmpCnt1 = cnt0 + cnt1;
					
					cnt0 = tmpCnt0;
					cnt1 = tmpCnt1;
				}
				
				bw.write(Integer.toString(cnt0)+ " " +Integer.toString(cnt1) +"\n");
			}
			
		}
		
		bw.flush();
	}

}
