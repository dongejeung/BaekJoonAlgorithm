package problem.step.six.array;

import java.util.Scanner;

public class Q4344_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int C = Integer.parseInt(sc.nextLine());
		
		// 배열 선언만 해놓기.
		int[][] classScores = new int[C][];
		
		for (int i = 0; sc.hasNextLine(); i++) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		
		while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }    
        sc.close();

	}

}

