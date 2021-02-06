package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 	방정식으로 생각해보자
 * 
 * 	자리수 별로 쪼개고 10^(n)형태의 덧셈을 한 것을 하나의 수로 봐야할 듯하다.
 * 	더 줄일 수 있겠지만 연산의 수를 줄이기 위해서 극단적으로 각 자리수가 모두 9일경우는 9*n이 된다.
 * 	=> 결국 대충 근사 짐작으로 보면 모든 각 자리수를 더한수는 그렇게 크지 않다.
 * 
 * 	N = a*10^(n) + b*10^(n-1) + ... + c + (a + b + ... c)
 * 	뭐 이딴 식인데,
 * 
 * 	구조상 생성자의 자리수와 자연수 N 의 자리수는 같다.
 * 	 
 */
public class Q2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 자리수로 끊기에는 String이 더 편함.
		String S = br.readLine();
		int N = Integer.parseInt(S);
		int numLength = S.length();
		
		int [] DecimalSeparatedNumber = new int[numLength];
		// 연산수를 줄이기 위한 첫 방법으로 
		// 생성자의 첫 자리수를 N의 첫 자리수 혹은 그것보다 1 작은 수로 제한한다.
		// 나머지는 일의 자리수부터 연쇄적으로 증가시켜가면서 생성자인 경우 break 한다.
		
		//DecimalSeparatedNumber[0] = Integer.parseInt(Character.toString(S.charAt(0)));
		DecimalSeparatedNumber[0] = S.charAt(0) - '0';
		
		while(true) {
			
		}

		
		
		//DecimalSeparatedNumber[0] = S.charAt(0) - '0'-1;
		
		
	}
	
	public static boolean compareN(int[] Arr, int N) {
		boolean result = false;
		int sum = 0;
		for (int i = 0; i < Arr.length; i++) {
			
		}
		if(sum == N) result = true;
		
		return result;
	}
	
}
