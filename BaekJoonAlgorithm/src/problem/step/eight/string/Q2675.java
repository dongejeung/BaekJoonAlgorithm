package problem.step.eight.string;

import java.util.Scanner;

public class Q2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {
			
			int stringSize = sc.nextInt();
			
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < stringSize; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
