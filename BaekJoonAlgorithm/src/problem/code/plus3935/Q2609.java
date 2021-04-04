package problem.code.plus3935;

import java.util.LinkedList;
import java.util.List;
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
		
		List<Integer> MFactors = new LinkedList<Integer>();
		int Mrest = M;
		final int MAX_M_FACTOR = (M/2 +1);
		for (int i = MAX_M_FACTOR; i > 2 ; i--) {
			if(Mrest%i == 0) {
				MFactors.add(i);
				if(Mrest == 1) break;
				else i = MAX_M_FACTOR;
			}
		}
		
		//MFactors.sort(c);
		
		List<Integer> NFactors = new LinkedList<Integer>();
		int Nrest = N;
		final int MAX_N_FACTOR = (N/2 +1);
		for (int i = MAX_N_FACTOR; i > 2 ; i--) {
			if(Nrest%i == 0) {
				NFactors.add(i);
				if(Nrest == 1) break;
				else i = MAX_N_FACTOR;
			}
		}
		
	}
}
