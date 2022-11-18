package problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q4375 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = ""; // EOF 처리
		while((input = br.readLine()) != "" && !input.isEmpty()) {
			int n = Integer.parseInt(input);
			for(int i=1; true; i++) {
				long l = n*i;
				if(chkOne(l)) {
					String lStr = Long.toString(l);
					System.out.println(lStr);
					bw.write(lStr.length() +"\n");
					break;
				}
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static boolean chkOne(long n) {
		boolean ans = true;
		String nStr = Long.toString(n);
		for (int i = 0; i < nStr.length(); i++) {
			if(nStr.charAt(i) != '1') {
				ans = false;
				break;
			}
		}
		return ans;
	}
}
