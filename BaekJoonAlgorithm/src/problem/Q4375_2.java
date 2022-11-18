package problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q4375_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// EOF 처리
		String input = ""; 
		while((input = br.readLine()) != "" && !input.isEmpty()) {
//			long n = Long.parseLong(input);
			bw.write(Integer.toString(chkOne(input)) +"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int chkOne(String n) {
		long nn = Long.parseLong(n);
		int ans = 0;
		StringBuffer sb = new StringBuffer("1");
		while(true) {
			String s = sb.toString();
			long a = Long.parseLong(s);
			if(a % nn == 0) {
				ans = s.length();
				break;
			}
			sb.append("1");
		}
		return ans;
	}
}
