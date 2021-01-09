package problem.step.nine.math1;

import java.util.Scanner;
import java.lang.*;

public class Q1011_4 {
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
					int restDistance = distance - (int)Math.pow(rootDistance, 2);
					//int additionalCnt = calRest(0, restDistance, rootDistance);
					int additionalCnt = 0;
					int cnt = 0;
					while(true) {
						cnt++;
						if(restDistance == 0) break;
						int quotient = (int)Math.floor(restDistance / rootDistance);
						if(quotient > 0) {
							additionalCnt += quotient; 
							restDistance -= additionalCnt * rootDistance;
						}
						rootDistance--;
					}
					System.out.println(baseCnt + additionalCnt);
				}
			}
			
		}
		sc.close();
		
	}
	
	public static int calRest(int additionalCnt, int restDistance, int rootDistance) {
		if(restDistance == 0) {
			return additionalCnt;
		}else {
			additionalCnt += (int)Math.floor(restDistance / rootDistance); 
			if(additionalCnt > 0) {
				restDistance -= additionalCnt * rootDistance;
			}
			rootDistance--;
			return calRest(additionalCnt, restDistance, rootDistance);
		}
	}
	
}
