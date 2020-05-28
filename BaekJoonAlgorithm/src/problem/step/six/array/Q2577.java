package problem.step.six.array;

import java.util.Scanner;

public class Q2577 {

	public static void main(String[] args) {
		
		/*
		 * String 으로 바꿔서 하면 편할 것 같긴 한데,
		 * 그냥 숫자로 다뤄보도록 하자.
		 * 
		 *  1. 일단 자리수를 구해보자.
		 *  
		 *  2. 자리수별로 쪼개려면 10^(n)으로 나누고 마지막엔 나머지를 써야함.
		 *  
		 *  ==> 아 이럴 필요없구나..
		 *
		 *  1. 방 10개짜리 배열을 만든다.
		 *  
		 *  2. 10으로 나눈 것의 나머지를 카운트해서 해당 자리수에 카운트를 증가시킨다. 
		*/		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int mul = A * B * C;
		
		int[] nums = new int[10];
		
		// 각 숫자별 방번호 만들어주고, 0으로 초기화.
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 0;
		}
		
		while(mul != 0) {
			nums[mul % 10]++;
			mul /= 10;
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
