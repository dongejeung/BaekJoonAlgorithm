package problem.step.eight.string;

import java.util.Scanner;

public class Q11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		String[] num = new String[size];
		num = sc.next().split("");
		
		int sum = 0;
		int[] nums = new int[size]; 
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(num[i]);
			sum += nums[i];
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
