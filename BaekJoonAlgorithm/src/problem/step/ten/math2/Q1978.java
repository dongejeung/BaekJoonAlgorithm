package problem.step.ten.math2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 1000 이하의 수면 걍 100 이하중에 소수 다 집어넣어서 
public class Q1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			numList.add(sc.nextInt());
		}
		
		int cnt = 0;
		for (Integer integer : numList) {
			for (int j = 2; j < 1000; j++) {
				if(integer == 1) {
					break;
				} else if(integer % j == 0 && integer != j) {
					break;
				}
				else if(j == 999) {
					cnt++;
				}
			}
			
		}
		System.out.println(cnt);
		
		sc.close();
	}
}
