package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// 소인수분해 필요
public class Q1037 {
	private static int[] divisorArr;
	public static void main(String[] args) throws IOException{
		solveProblem();
	}
	
	public static void setDivisorArr() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		divisorArr = new int[N];
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		for(int i=0; i < divisorArr.length; i++) {
			divisorArr[i] = Integer.parseInt(stk.nextToken());
		}
		
		br.close();
	}
	
	public static void solveProblem() throws IOException {
		setDivisorArr();
		int ans = 1;
		
		Arrays.sort(divisorArr);

		List<Integer> factors = new LinkedList<Integer>();
		for (int i = 2; i < divisorArr[divisorArr.length -1]; i++) {
			int max_cnt = 0;

			for(int j = 0; j < divisorArr.length; j++) {
				int num = divisorArr[j];
				int cnt = 0;

				while(true) {
					if(num % i == 0 && num / i > 0) {
						divisorArr[j] = num / i;
						cnt++;
						
						if(max_cnt < cnt)
							max_cnt = cnt;
					}else if(divisorArr[j] == 1 || num % i != 0)
						break;
				}
				
			}
			factors.add(i*max_cnt);
		}
		
		for (int i = 0; i < factors.size(); i++) {
			ans *= factors.get(i);
		}
		System.out.println(ans);
	}
	
	public static List<Integer> factorization() {
		
		for (int i = 0; i < divisorArr.length-1; i++) {
			
		}
		
		return null;
	}
}
