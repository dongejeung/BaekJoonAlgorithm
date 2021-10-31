package problem.code.plus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 	15E+a / 28S+b / 19M+c 
 */
public class Q1476 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int E = Integer.parseInt(stk.nextToken());
		int S = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		int MaxE = 15;
		int MaxS = 28;
		int MaxM = 19;
		
		int cnt = 1;
		while(true) {
			if(E == 1 && S == 1 && M == 1) break; 
			E = calYear(E, MaxE);
			S = calYear(S, MaxS);
			M = calYear(M, MaxM);
			
			cnt++;
		}
		
		bw.write(Integer.toString(cnt));
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	
	public static int calYear(int y, int max) {
		y--;
		if(y == 0) y = max;
		return y;
	}
	
}
