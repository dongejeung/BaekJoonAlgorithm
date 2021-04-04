package problem.code.plus3935;

import java.util.Scanner;

/*
 * 	1. 무식하게 할랬더니, 소인수분해 해야할 것 같음.
 * 	
 */
public class Q2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int diff;
		if(M > N) diff = M - N;
		else diff = N - M;
		
		int GCF = 0;
		for (int i = (diff/2 +1); i > 2 ; i--) {
			if(M%i == 0 && N%i == 0) {
				GCF = i;
				break;
			}
		}
		
		int LCM = 0;
		for (int i = (diff/2 +1); i > 2 ; i--) {
			if(M%i == 0 && N%i == 0) {
				LCM = i;
				break;
			}
		}
		
	}
}
