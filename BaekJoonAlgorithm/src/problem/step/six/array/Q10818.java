package problem.step.six.array;

import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {
		/*
		* 배열에는 sort내장함수가 없나?
		* 
		* 1. 대소비교는 아마(?) 2개씩 비교하는 과정을 여러번 거치는 것이 베이스였던 듯.
		* sort 함수의 내부나 이런걸로 봐도 A - B (부등호) 0 뭐 이런식의 수식을 볼 수 있음.
		* 
		* 2. [0]번 위치의 인자를 기준으로 [1] ~ ... 의 배열과 비교해서 바꿔치기 하면 어떨까?
		* test1
		* 
		* 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] nums = new int[N];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		// test1 [0] 인자와 나머지 모든 인자를의 대소를 비교해서 바꿔치기 수행.
		// => 위의 식을 적용하면 가장 작은 수가 0번 방에 가게 됨.
		for (int i = 0; i < nums.length; i++) {
			if(nums[0] > nums[i]) {
				int a = nums[0];
				int b = nums[i];
				nums[0] = b;
				nums[i] = a;
			}
		}
		
		// test1을 역순 적용.
		for (int i = N-1; i > 0; i--) {
			if(nums[N-1] < nums[i]) {
				int a = nums[N-1];
				int b = nums[i];
				nums[N-1] = b;
				nums[i] = a;
			}
		}
		
		System.out.print(nums[0] + " ");
		System.out.print(nums[N-1]);
	}

}
