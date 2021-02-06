package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 	N - X = a(자리수의 합)
 * 	X = N - a;
 */
public class Q2231_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 자리수로 끊기에는 String이 더 편함.
		String S = br.readLine();
		int N = Integer.parseInt(S);
		int numLength = S.length();
		int initNum = Integer.parseInt(Character.toString(S.charAt(0))) * (int)Math.pow(10, numLength-1) - (numLength - 1) * 9;
		
		while(true) {
			int accumGen = calGenerator(N, initNum);
			if(N == accumGen) {
				bw.write(Integer.toString(initNum));
				break;
			} else 
			if(accumGen > N + 9){
				bw.write("0");
				break;
			} 
			initNum++;
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	public static int calGenerator(int N, int X) {
		int sum = X;
		String stringX = Integer.toString(X);
		for (int i = 0; i < stringX.length(); i++) {
			int n = Integer.parseInt(Character.toString(stringX.charAt(i)));
			sum += n; 
		}
		
		return sum;
		
	}
	
}
