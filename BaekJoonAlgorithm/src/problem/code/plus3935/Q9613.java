package problem.code.plus3935;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Q9613 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int  T = Integer.parseInt(stk.nextToken());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer stk2 = new StringTokenizer(br.readLine());
			
			String test = "";
			List<Integer> nums = new LinkedList<Integer>();
			while(stk2.hasMoreTokens()) {
				String num = stk2.nextToken();
				nums.add(Integer.parseInt(num));
			}
			nums.remove(0);
			
			// 리스트에서 중복 제거
			HashSet<Integer> arr2 = new HashSet<Integer>(nums);
			
			List<Integer> nums2 = new LinkedList<Integer>(arr2);
			
			
			int ans = 0;
			
			// 리스트에서 0주소의 값과 나머지 값들을 gcd 를 구하고 누산한 다음.
			// 리스트에서 첫번째 항목을 뺸다.
			for (int j = 0; j < nums2.size()-1; j++) {
				for (int j2 = j+1; j2 < nums2.size(); j2++) {
					int gcd = gcd(nums2.get(j), nums2.get(j2));
					if(nums2.get(j) == 1 || nums2.get(j2) == 1) {
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
	
	
	public static int gcd(int a, int b) {
		
		while(b != 0) {
			int r = a % b;
			
			a = b;
			b = r;
		}
		
		return a;
		
	}
}
