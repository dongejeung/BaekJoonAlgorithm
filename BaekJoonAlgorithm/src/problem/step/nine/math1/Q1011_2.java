package problem.step.nine.math1;

import java.util.Scanner;
/*
 * 1. 초항과 끝 항은 1로 고정.
 * 
 * 
 * 
 */
public class Q1011_2 {
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
				int shorttestDistance = distance; 
				for(i=0; i < distance; i++) {
					
				}
				
				System.out.println(shorttestDistance);
			}
			
		}
	}
	
}
