package problem.step.six.array;

import java.util.Scanner;

public class Q3052 {
	/*
	 * 1. 배열에 할당.
	 * 2. 나머지 배열에 할당.
	 * 3. 나머지 배열의 개수 10개에서 같은 수가 있으면 배열사이즈에서 카운트 빼줌.
	 * ==>> 전수 상호비교해야 할 것 같음.
	 * 0 compare 1~9 > 1 compare 2~8
	 * 
	 * ==>> 위의 식으로 하면 같은 것이 여러 개 있을 때 값이 잘못 나옴.
	 * 1. 같은 값이 있을 경우 해당 값을 기준값 옆으로 바꿔치기 해주고,
	 * 2. 비교 기준점 + 1 & 반복횟수 -1 => cnt 
	 * 안 된다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		int[] rests = new int[10];
		
		for (int i = 0; i < rests.length; i++) {
			rests[i] = nums[i] % 42;
		}
		
		int cnt = 10;
		
		for (int i = 0; i < rests.length; i++) {
			
			int A = 0;
			int B = 0;
			
			for (int j = i+1; j < cnt; j++) {
				A = rests[i];
				B = rests[j];
				if(A == B ) {
					cnt--;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
