package problem.step.ten.math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 아마 나누는 수를 증가시켜 가면서 반복을 하는 것은 맞는데
// 2, 4, 8 등 나누는 수 자체가 어떤 수의 배수인 경우는 제외시켜도 될 듯 하다.
// 전체 범위 리스트에서, 어떤 수의 배수들을 제외하는 형태가 가능할 것 같다.
// 제일 작은 인수는 2임 따라서,
// 어떤 수를 2로 나눴을때의 몫보다 클 수는 없음
// 2^(x) * 3^(y) * 5^(z) (x, y, z >=0) 의 조건이 성립함.

public class Q1929_4 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(stk.nextToken());
		int N = Integer.parseInt(stk.nextToken());
		
		if(M == 1) M = 2;
		// 이상 이하라 +1
		//int[] numList = new int[N-M+1];
		List<Integer> numList = new ArrayList<Integer>();
		int range = (N-M+1);
		for (int i = 0; i < range; i++) {
			numList.add(M+i);
		}
		
		numList.removeIf(n -> (n % 2 == 0));
		numList.removeIf(n -> (n % 3 == 0) && n / 3 > 1);
		numList.removeIf(n -> (n % 5 == 0) && n / 5 > 1);
		numList.removeIf(n -> (n % 7 == 0) && n / 7 > 1);
		numList.removeIf(n -> (n % 11 == 0) && n / 11 > 1);
		numList.removeIf(n -> (n % 13 == 0) && n / 13 > 1);
		
		for (Integer integer : numList) {
			boolean flag = true;
			for (int j = 2; j <= integer; j++) {
				if(integer % j == 0 && (int)Math.floor(integer / j) > 1) {
					flag = false;
					break;
				}
			}
			if(flag) bw.write(Integer.toString(integer)+ '\n');
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
