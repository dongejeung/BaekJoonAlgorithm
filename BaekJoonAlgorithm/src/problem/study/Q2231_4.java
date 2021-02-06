package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2231_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 자리수로 끊기에는 String이 더 편함.
		String S = br.readLine();
		int N = Integer.parseInt(S);
		int numLength = S.length();
		
		int firstSeparatedNum = S.charAt(0) - '0';
		//int generator = (int) ((firstSeparatedNum-1) * Math.pow(10, numLength-1));
		// 연산 횟수를 줄이기 위함
		// initNum 의 자리수를 한정하기 위해 (9 * numLength) 를 이용한다.
		int temp = Integer.toString((9 * numLength)).length();
		int forwardNum = (int)(N / Math.pow(10, temp));
		int backwardNum = N - forwardNum;
		
		String sForwardNum = Integer.toString(forwardNum);
		int sumForwardNum = 0;
		for (int i = 0; i < sForwardNum.length(); i++) {
			sumForwardNum += sForwardNum.charAt(i) + '0';
		}
		
		int a = backwardNum - sumForwardNum;
		
		
		//int lastNum = forwardNum+1 * (int)(N / Math.pow(10, temp));
		int lastNum = (int)((N / Math.pow(10, temp)) * Math.pow(10, temp));
		
		//int generator = N - (9 * numLength);
		int generator = (int)(forwardNum * Math.pow(10, temp)) - sumForwardNum;
		
		if(a < 0 ) {
			bw.write("0");
		}else {
			while(true) {
//			for (int i = 0; i <= a; i++) {
				if(calGenerator(N, generator)) {
					bw.write(Integer.toString(generator));
					break;
				}
				generator++;
				if(lastNum == generator) {
					bw.write("0");
				}
			}
		}
		
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
