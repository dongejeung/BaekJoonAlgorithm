package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * n >= 2 부터 전개
 * 2 => fibo(0) + fibo(1)
 * 3 => fibo(2) + fibo(1) => fibo(0) + 2*fibo(1)
 * 4 => fibo(3) + fibo(2) => (fibo(0) + 2*fibo(1)) + (fibo(0) + fibo(1))
 * 
 * =====
 * 기본식이 Fn = fn-1 + Fn-2
 * 결국 0, 1 => 1, 2 => 2, 3 => ...
 * 이런식으로 갈 것 같긴 한데..
 * 
 * =====
 * 아니다 전개를 다르게 하는 것이 적절할 듯 
 * 2 => fibo(0) + fibo(1)
 * 3 => fibo(2) + fibo(1) => (fibo(0) + fibo(1)) + fibo(1)
 * 4 => fibo(3) + fibo(2) => (fibo(2) + fibo(1)) + (fibo(0) + fibo(1)) => ((fibo(0) + fibo(1)) + fibo(1)) + (fibo(0) + fibo(1))
 * 
 * =====
 * 
 * n항은 n-1항과 n-2항으로 쪼개진다.
 * n이 1 또는 0이 올때까지 항의 개수는 2^(n)으로 늘어나는 것 같다.
 * 결국 모든 항으 x*fibo(0) + y*fibo(1) 형태까지 쪼개지게 된다.
 * 뭐 여튼 println 을 하는 부분에 fibo(0)의 cnt fibo(1)의 cnt를 더해서 최종 개수들만 리턴해주면 되는데..
 * 그걸 코드로 어떻게 구현할 지 잘 모르겠다..
 * 
 * =====
 * 
 * 사실 걍 테스트 케이스 몇개 돌려보면 나오긴 할 것이다..
 *  
 */
public class Q1003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int TC = Integer.parseInt(br.readLine());
		for (int i = 0; i < TC; i++) {
			int n = Integer.parseInt(br.readLine());
			String cntPair = fibonacci(n);
			
			bw.write(cntPair +"\n");
		}
		
		bw.flush();
	}
		
	public static String fibonacci(int n) {
		String resultStr = "0 0";
		if (n == 0) {
			String[] strArr= resultStr.split(" ");
			int zeroCnt = Integer.parseInt(strArr[0])+1;
			strArr[0] = Integer.toString(zeroCnt);
			resultStr = strArr[0] +" "+ strArr[1]; 
	        return resultStr;
	    } else if (n == 1) {
	    	String[] strArr= resultStr.split(" ");
	    	int oneCnt = Integer.parseInt(strArr[1])+1;
	    	strArr[0] = Integer.toString(oneCnt);
	    	resultStr = strArr[0] +" "+ strArr[1]; 
	        return resultStr;
	    } else {
	    	return fibonacci(n-1) + fibonacci(n-2);
	    }
	}
	
}
