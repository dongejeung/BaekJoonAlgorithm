package problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

public class Q4375_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// EOF 처리
		String input = ""; 
		while((input = br.readLine()) != "" && !input.isEmpty()) {
//			bw.write(Integer.toString(chkOne(input)) +"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int chkOne(String n) {
		int nn = Integer.parseInt(n);
		int ans = 0;
		StringBuffer sb = new StringBuffer("1");
		// 사실상 소수만 인수가 될 수 있을 거 같긴 한데..
		while(true) {
			break;
		}
		return ans;
	}	
	public static List<Integer> factorization(String n) {
		List<Integer> primes = new LinkedList<Integer>();
		long sample = 11111111111L;
		return null;
	}
}
