package problem.step.ten.math2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		//List<Integer> primeFactorList = new ArrayList<Integer>();
		int factor = 2;
		while(true) {
			if(N == factor) {
				//primeFactorList.add(factor);
				System.out.println(factor);
				break;
			} else if(N % factor == 0) {
				//int quotient = N / factor;
				//for(int i = 0; i < quotient; i++) {
					//primeFactorList.add(factor);
					System.out.println(factor);
				//}
				//N /= quotient * factor;
				N /= factor;
			} else {
				factor++;
			}
		}
		
		/*
		 * for (Integer integer : primeFactorList) { System.out.println(integer); }
		 */
		
	}
}
