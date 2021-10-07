package problem.code.plus3935;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * 	1. 그냥 정석대로 구할 필욘 없음. ( 꼭 소인수분해를 할 필요는 없을 것 같다는 말)
 * 
 * 	2. 두 수의 대수 비교를 함.
 * 
 * 	3. 둘 중 작은수 만큼의 반복문을 돌림.
 * 
 * 	4. 1~작은수 나누어서 작은수가 1이 될때까지 나눔.
 * 
 * 	5. 큰 수도 같이 나눠줌 둘 다 나누어떨어지는 수는 따로 수집해놓음.
 * 
 * 	6. 두 수를 곱한 후 따로 수집해놓은 수로 한 번 나눔.
 * 
 * 	7. 출력.
 * 
 * 	=======
 * 
 * 	+아 인자로 2가 여러번 들어갈수가 있으니까 몫까지 같이 봐줘야겠네.
 * 	그럼 결국 소인수분해 같이 해야되나.. 
 * 
 * 	+아 결국 소인수분해 유사하게 하긴 해야겠네..
 * 	
 */
public class Q1934 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(stk.nextToken());
		
		int[][] matrix = new int[T][2];
		for (int i = 0; i < T; i++) {
			stk = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(stk.nextToken());
			int B = Integer.parseInt(stk.nextToken());
			matrix[i][0] = A;
			matrix[i][1] = B;
			
		}
		
		for (int i = 0; i < matrix.length; i++) {
			int num1 = matrix[i][0];
			int num2 = matrix[i][1];
			int coFactors = 1;
			
			int bigger = 0;
			int smaller = 0;
			
			if(num1 - num2 < 0) {
				smaller = num1;
				bigger = num2;
			} else {
				bigger = num1;
				smaller = num2;
			}
			
			int size = smaller;	
			// 나누는 수는 2부터 시작.
			for (int k = 2; k < size; k++) {
				int temp = k-1;
				if(smaller % k == 0 && bigger % k == 0) {
					if(smaller / k > 0) {
						if(smaller / k > 0 && bigger / k > 0 ) {
							int factor1 = smaller / k;
							int factor2 = bigger / k;
							
							
							coFactors *= k;
						}
						smaller /= k;
						k = temp;
					}
					
				}
				
				if(smaller == 1)
					break;
			}
				
			
			int ans = (num1 * num2) / coFactors;
			bw.write(ans+"\n");
			
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
