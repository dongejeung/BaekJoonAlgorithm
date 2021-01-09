package problem.step.ten.math2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		
		List<Integer> numList = new ArrayList<Integer>();
		for (int i = M; i <= N; i++) {
			numList.add(i);
		}
		
		List<Integer> primeNumList = new ArrayList<Integer>();
		for (Integer integer : numList) {
			for (int j = 2; j <= integer; j++) {
				if(integer == 1) {
					break;
				} else if(j == integer) {
					primeNumList.add(integer);
				} else if(integer % j == 0) {
					break;
				}
			}
		}
		
		if(primeNumList.size() == 0) {
			System.out.println(-1);
			return;
		}
		
		int sum = 0;
		for (Integer integer : primeNumList) {
			sum += integer;
		}
		
		System.out.println(sum);
		System.out.println(primeNumList.get(0));
		
	}
}
