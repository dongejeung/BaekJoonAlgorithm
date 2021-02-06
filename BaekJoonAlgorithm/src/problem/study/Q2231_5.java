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
public class Q2231_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 자리수로 끊기에는 String이 더 편함.
		String S = br.readLine();
		int N = Integer.parseInt(S);
		int numLength = S.length();
		
		// 생성자의 계수를 할당
		int[] X = new int[numLength];
		for (int i = 0; i < X.length; i++) {
			if(i == 0) X[i] = 1;
			else X[i] = 0;
		}
		
		int cnt = numLength-1;
		int x = 0; // 구하려는 수
		for (int i = 0; i < X.length; i++) {
			x += X[i] * ( (int)Math.pow(10, cnt));
			cnt--;
		}
		
		int a = 0; // x의 각 자리수의 합
		for (int i = 0; i < X.length; i++) {
			a += X[i];
		}
		
		// 
		if(N == (x + a)) // 이때의 x가 생성자
		
		while(true) {
			if(calGenerator(N, x)) {
				bw.write(Integer.toString(x));
				break;
			} else {
				bw.write("0");
			}
			
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	/*
	public static boolean calGenerator(int N, int X) {
		boolean result = false;
		int sum = X;
		String stringX = Integer.toString(X);
		for (int i = 0; i < stringX.length(); i++) {
			int n = Integer.parseInt(Character.toString(stringX.charAt(i)));
			sum += n; 
		}
		
		if(N == sum) result = true;
		return result;
		
	}
	*/
	
	public static boolean calGenerator(int N, int X) {
		boolean result = false;
		
		return result;
	}
}
