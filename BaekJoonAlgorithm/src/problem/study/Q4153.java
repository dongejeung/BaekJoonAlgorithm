package problem.study;

import java.util.Scanner;

public class Q4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String TC = sc.nextLine();
			String[] sides = TC.split(" ");
			if(sides[0].equals("0")) break;
			
			int[] triangleSides = new int[sides.length];
			for (int i = 0; i < sides.length; i++) {
				triangleSides[i] = Integer.parseInt(sides[i]);
			}
			
			for (int i = 0; i < triangleSides.length-1; i++) {
				if(triangleSides[i] > triangleSides[i+1]) {
					int temp1 = triangleSides[i]; 
					int temp2 = triangleSides[i+1]; 
					triangleSides[i+1] = temp1;
					triangleSides[i] = temp2;
				}
			}
			
			if(Math.pow(triangleSides[2], 2) == Math.pow(triangleSides[0], 2) + Math.pow(triangleSides[1], 2)) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
			
		}
		
		sc.close();
		
	}
}
