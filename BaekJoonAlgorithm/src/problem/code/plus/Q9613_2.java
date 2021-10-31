package problem.code.plus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
/*
 * 	그래 자료형이 걸리는 문제였구나..
 */
public class Q9613_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int  T = Integer.parseInt(stk.nextToken());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer stk2 = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(stk2.nextToken());
			
			long[] nums = new long[n];
			
			for (int j = 0; j < nums.length; j++) {
				nums[j] = Integer.parseInt(stk2.nextToken());
			}
			
			long ans = 0;
			
			// 리스트에서 0주소의 값과 나머지 값들을 gcd 를 구하고 누산한 다음.
			// 리스트에서 첫번째 항목을 뺸다.
			for (int j = 0; j < nums.length-1; j++) {
				for (int j2 = j+1; j2 < nums.length; j2++) {
					long gcd = gcd(nums[j], nums[j2]);
					
					if(nums[j] == 1 || nums[j2] == 1) {
						gcd = 1;
					}
					ans += gcd;
				}
			}
			
			bw.write(ans +"\n");
				
		}
		
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	
	public static long gcd(long a, long b) {
		
		while(b != 0) {
			long r = a % b;
			
			a = b;
			b = r;
		}
		
		return a;
		
	}
}
