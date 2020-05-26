package problem;

import java.util.Scanner;

public class Q10951 {
	
	// sc.hasNext()를 통해 입력의 종료를 알림.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = A + B;
			
			System.out.println(sum);
			
		}
	}

}
