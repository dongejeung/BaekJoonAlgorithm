package problem.step.six.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2562 {
	public static void main(String[] args) {
		
		/*
		 * 자리를 바꾸지 않고 최대값 구하기.
		 * cf) 자꾸 지나치는데 배열은 크기 변경 안됌.
		 *
		 * 1. 배열을 복사한다. (배열의 값 복사는 그냥 하면 안됐던것도 같은데.. reference type..)
		 * 2. 복사한 배열의 최대값을 제일 끝에 위치 시킨다.
		 * 3. 최대값과 원래 배열이 일치하는 곳의 index를 출력한다.
		 * 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[9];
		int[] nums2 = new int[9];
		
		//두 배열에 값은 값 삽입
		for (int i = 0; i < nums.length; i++) {
			int temp = sc.nextInt(); 
			nums[i] = temp;
			nums2[i] = temp;
		}
		// 2번째 배열의 최대값을 최우측에 위치시킴.
		for (int i = 8; i >= 0; i--) {
			if(nums2[8] < nums2[i]) {
				int a = nums2[8];
				int b = nums2[i];
				nums2[8] = b;
				nums2[i] = a;
			}
		}
		
		// 최대값 출력.
		System.out.println(nums2[8]);
		
		// 2번 배열의 최대값과 같은 값이 가진 1번 배열의 인덱스를 찾음.
		// 방 번호는 0 부턴데 순서는 1부터임.
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == nums2[8]) {
				System.out.println(i+1);
			}
		}
		
	}
}
