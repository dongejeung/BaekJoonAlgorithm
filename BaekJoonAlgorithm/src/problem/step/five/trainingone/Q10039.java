package problem.step.five.trainingone;

import java.util.Scanner;

public class Q10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int A = sc.nextInt();
			if(A < 40) {
				A = 40;
			}
			sum += A;
		}
		System.out.println(sum / 5);
		sc.close();
	}

}
