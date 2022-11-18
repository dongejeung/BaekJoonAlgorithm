package problem.step.one.inputoutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10430 {
	// refactoring이나 다른 해법 필요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int C = A * B;
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		int i = 0;
		while(B/10 != 0) {
			int temp = B%10;
			number.add(i, temp);
			
			B = B/10;
			i++;
			if(B/10 == 0) {
				number.add(i, B);
			}
		}
		
		for (int j = 0; j < number.size(); j++) {
			
			System.out.println(A * (number.get(j)));
		}
		
		System.out.println(C);
		
		sc.close();
	}

}
