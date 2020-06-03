package problem.step.six.array;

import java.util.Scanner;

public class Q4344_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		
		// 배열 선언만 해놓기.
		int[][] classScores = new int[C][];
		
		for (int i = 0; i < C; i++) {
			
			int innerArraySize = sc.nextInt();
			System.out.println(i+"번 크기:"+innerArraySize);
			classScores[i] = new int[innerArraySize];
			
			for (int j = 0; j < innerArraySize; j++) {
				int temp = sc.nextInt();
				classScores[i][j] = temp;
				System.out.print(classScores[i][j]+" ");
			}
			System.out.println("");
		}
	}

}

