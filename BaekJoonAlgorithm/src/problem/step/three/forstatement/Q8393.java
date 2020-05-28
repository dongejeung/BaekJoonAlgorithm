package problem.step.three.forstatement;

import java.util.Scanner;

public class Q8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < A; i++) {
			sum += i+1;
		}
		System.out.println(sum);
	}
}
