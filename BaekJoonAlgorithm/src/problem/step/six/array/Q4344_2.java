package problem.step.six.array;

import java.util.Scanner;

public class Q4344_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		
		double[][] classScores = new double [C][0];
		
		for (int i = 0; i < classScores.length; i++) {
			
			int innerArraySize = sc.nextInt();
			
			double sum = 0;
			classScores[i] = new double[innerArraySize];

			for (int j = 0; j < innerArraySize; j++) {
				
						
				double temp =sc.nextDouble();
				classScores[i][j] = temp;
				sum += temp;
			}
			
			double avg = sum / innerArraySize;
			
			double cnt = 0;
			for (int j = 0; j < innerArraySize; j++) {
				if(classScores[i][j] > avg) {
					cnt++;
				}
			}
			
			double A = (cnt / innerArraySize) * 1000000;
			if(A % 10 >= 5) {
				A +=10;
			}
			
			int B = (int) A / 10;
			String D = Integer.toString(B);
			
			int leng = D.length()+1;
			char[] range = new char[leng];
			for (int j = 0; j < leng; j++) {
				if(j < 2) {
					range[j] = D.charAt(j);
				}else if(j == 2) {
					range[j] = '.';
				} else {
					range[j] = D.charAt(j-1);
				}
			}
			
		  String E = ""; 
		  for (int j = 0; j < range.length; j++) { 
			  E += range[j]; 
		  } 
		  E += "%";
		  
		  System.out.println(E);
			 
		}
	}

}

