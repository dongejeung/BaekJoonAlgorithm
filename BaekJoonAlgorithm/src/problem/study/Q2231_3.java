package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2231_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 자리수로 끊기에는 String이 더 편함.
		String S = br.readLine();
		int N = Integer.parseInt(S);
		int numLength = S.length();
		
		int last = N % 10;
		
		
		/*
		 * while(true) { if(calGenerator(N, generator)) {
		 * bw.write(Integer.toString(generator)); break; } generator++; if(lastNum ==
		 * generator) { bw.write("0"); } }
		 */
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	public static boolean calGenerator(int N, int num) {
		boolean result = false;
		int sum = num;
		String stringNum = Integer.toString(num);
		for (int i = 0; i < stringNum.length(); i++) {
			sum += stringNum.charAt(i) - '0'; 
		}
		
		if(N == sum) result = true;
		return result;
		
	}
	
}
