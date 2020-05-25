package problem;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1065 {
	public static void main(String[] args) {
		//  Q1065 X의 자리수가 등차수열을 이룰 때(한수), N이 주어졌을 때 N보다 작은 한수의 개수를 출력하라.
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		
		if(b==1000) {
			System.out.println(144);
		}else if (b<100 && b >= 1) {
			System.out.println(b);
		}else if(b >= 100 && b < 1000) {
			ArrayList isometric = new ArrayList();
			for (int i = 100; i <= b; i++) {
				int a = i;
				// 자리수 추출.
				int num3 =  a/100;;
				a -= num3*100;
				int num2 =  a/10;
				a -= num2*10;
				int num1 = a;
				
				//등차 추출.
				int p2 = num3 - num2;
				int p1 = num2 - num1;
				if(p2 == p1) {
					isometric.add(i);
				}				
			}
			System.out.println(isometric.size()+99);
		}		
	}
}
