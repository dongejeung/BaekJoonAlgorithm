package problem.step.nine.math1;

import java.util.Scanner;
import java.lang.*;

public class Q1011_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 수
		int T = sc.nextInt();
		
		int[] cases = new int[T];
		
		for (int i = 0; i < cases.length; i++) {
			int distance = 0;
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			distance = end - start;
			
			if(distance <= 3) {
				System.out.println(distance);
			}else {
				int rootDistance = (int)Math.floor(Math.sqrt(distance));
				int baseCnt = 2 * rootDistance - 1;  
				if(distance == Math.pow(rootDistance, 2)){
					System.out.println(baseCnt);
				} else {
					
					int additionalCnt = 0;
					
					int restDistance = distance - (int)Math.pow(rootDistance, 2);
					int quotient = (int)Math.floor(restDistance / rootDistance);
					additionalCnt += quotient;
					if(restDistance % rootDistance > 0) additionalCnt++;
					
					System.out.println(baseCnt + additionalCnt);
				}
			}
			
		}
		sc.close();
		
	}
	
}
