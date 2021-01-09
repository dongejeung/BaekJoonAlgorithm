package problem.step.ten.math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 아마 나누는 수를 증가시켜 가면서 반복을 하는 것은 맞는데
// 2, 4, 8 등 나누는 수 자체가 어떤 수의 배수인 경우는 제외시켜도 될 듯 하다
// 전체 범위 리스트에서, 어떤 수의 배수들을 제외하는 형태가 가능할 것 같다.
public class Q1929 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(stk.nextToken());
		int N = Integer.parseInt(stk.nextToken());
		int range = N - M;
		
		if(M == 1) return;
		
		for (int i = 0; i <= range; i++) {
			for (int j = 2; j <= M; j++) {
				if(M % j == 0 && (int)Math.floor(M / j) > 1) {
					break;
				}
				
			}
			//bw.write(Integer.toString(M)+ "\n");
			M++;
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
