package problem.step.four.whilestatement;

import java.util.Scanner;

public class Q1110 {

	// 점화식 패턴이라 보면 됨.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = A;
		int i = 1;
		
		while(true) {
			
			if(B < 10 ) {
				B = 10 * B + B;
			}else {
				int C = B / 10;
				int D = B % 10;
				B = D * 10 + ((C + D)) % 10;
			}
			
			if(A == B) {
				break;
			}else {
				i++;
			}
		}
		System.out.println(i);
		sc.close();
	}

}
