package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1003_2 {
	int zeroCnt = 0;
	int oneCnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int TC = Integer.parseInt(br.readLine());
		for (int i = 0; i < TC; i++) {
			int n = Integer.parseInt(br.readLine());
			Q1003_2 q1003 = new Q1003_2();
			fibonacci(n, q1003);
		
			bw.write(Integer.toString(q1003.zeroCnt)+ " " +Integer.toString(q1003.oneCnt) +"\n");
		}
		
		bw.flush();
	}
		
	private static int fibonacci(int n, Q1003_2 q) {
	    if (n == 0) {
	    	q.zeroCnt++;
	        return 0;
	    } else if (n == 1) {
	    	q.oneCnt++;
	        return 1;
	    } else {
	        return fibonacci(n-1, q) + fibonacci(n-2, q);
	    }
	}
	
}
