package problem.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N <= 1) {
			System.out.println(N);
		}else {
		
			int cnt = N -1;
			List<Integer> numList = new ArrayList<Integer>();
			numList.add(0);
			numList.add(1);
			for (int i = 0; i < cnt; i++) {
				numList.add(calNextNum(numList.get(i), numList.get(i+1)));
			}
			
			System.out.println(numList.get(N));
		}
		sc.close();
	}
	
	public static int calNextNum(int fn1, int fn2) {
		int sum = 0;
		sum = fn1 + fn2;
		
		return sum;
	}
	
}
