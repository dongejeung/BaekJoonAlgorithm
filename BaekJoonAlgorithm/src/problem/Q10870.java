package problem;

import java.util.Scanner;

public class Q10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N == 0) {
			System.out.println(0);
			return;
		}else if(N <= 2) {
			System.out.println(1);
		}else {
		
			// Fn = Fn1 + Fn2
			int Fn = 1;
			int Fn1 = 1;
			int Fn2 = 0;
			for (int i = 0; i < N-3; i++) {
				int n = Fn + Fn1;
				int n1 = Fn;
				int n2 = Fn1;
				Fn = n;
				Fn1 = n1;
				Fn2 = n2;
			}
			
			System.out.println(Fn);
		}
	}
	
}
