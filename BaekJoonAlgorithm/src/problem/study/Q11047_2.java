package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* 
 *	1. 가장 큰 수부터 차례대로 나눈다.
 */
public class Q11047_2 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(stk.nextToken());
		int K = Integer.parseInt(stk.nextToken());
		
		int[] coins = new int[N];
		int[] dividend = new int[N];
		// 큰수부터 차례대로 나누므로 역순으로 삽입한다.
		for (int i = coins.length-1; i >= 0; i--) {
			int coin = Integer.parseInt(br.readLine());
			coins[i] = coin;
			dividend[i] = 0;
		}
		
		br.close();
		
		boolean keepGoingFlag = true;  
		int cnt = 0;
		int startPoint = 0;
		int preQuotient = 0;
		while(keepGoingFlag) {
			int targetNum = K;
			for (int i = startPoint; i < coins.length; i++) {
				int quotient;
				if(preQuotient == 0) {
					quotient = calQuotient(targetNum, coins[i]);
				} else {
					quotient = preQuotient;
				}
				dividend[i] = quotient; 
				
				if(quotient > 0) {
					preQuotient = quotient;
					//dividend[i] = quotient;
					targetNum = calRest(targetNum, coins[i]);
					if(targetNum == 0) {
						for (int j : dividend) {
							cnt += j;
						}
						bw.write(Integer.toString(cnt));
						keepGoingFlag = false;
						bw.flush();
						bw.close();
						break;
					}
				}else {
					break;
				}
			}
			
			if(dividend[startPoint] == 0) {
				startPoint++;
				preQuotient = 0;
			}else {
				preQuotient--;
			}
			cnt = 0;
			
		}
		
		
	}
	
	public static int calQuotient(int divisor, int dividend) {
		int result = divisor / dividend;
		
		return result;
	}
	
	public static int calRest(int divisor, int dividend) {
		int result = divisor % dividend;
		
		return result;
	}
	
}
