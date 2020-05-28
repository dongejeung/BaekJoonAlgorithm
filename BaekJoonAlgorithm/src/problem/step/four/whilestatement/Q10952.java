package problem.step.four.whilestatement;

import java.util.Scanner;

public class Q10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 조건식에 A, B는 0 초과기 때문에 0만 입력받아도 멈추면 됌.
		// sc.nexInt() 사용시 첫 입력을 넘어감.
		// break 문 사용이나 blean flag 사용 가능.
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = A + B;

			if(A == 0 && B == 0) {
				break;
			}
			
			System.out.println(sum);
			
		}
	}

}
