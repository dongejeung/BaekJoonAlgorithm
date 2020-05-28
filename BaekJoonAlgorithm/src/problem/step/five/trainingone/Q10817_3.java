package problem.step.five.trainingone;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10817_3 {

	// 배열 사용
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[3];
		
		// 배열에 정수 3개 담기.
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		// List의 인자간 대소비교 후 정렬하기.
		// 비교순서 [0][1](비교후 재배열) [1][2](재배열) [0][1]
		if((nums[0] - nums[1]) > 0) {
			int a = nums[0];
			int b = nums[1];
			nums[0] = b;
			nums[1] = a;
		}
		
		if((nums[1] - nums[2]) > 0) {
			int a = nums[1];
			int b = nums[2];
			nums[1] = b;
			nums[2] = a;
		}
		
		if((nums[0] - nums[1]) > 0) {
			int a = nums[0];
			int b = nums[1];
			nums[0] = b;
			nums[1] = a;
		}
		
		// 출력하기
		System.out.println(nums[1]);

	}

}
