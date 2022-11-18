package problem.step.three.forstatement;

import java.util.Scanner;

public class Q11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		for (int i = 1; i <= A; i++) {
			int B = sc.nextInt();
			int C = sc.nextInt();
			System.out.println("Case #" + i + ": " + (B + C));
		}
		sc.close();
	}
} 