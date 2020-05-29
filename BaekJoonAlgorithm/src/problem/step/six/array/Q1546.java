package problem.step.six.array;

import java.util.Scanner;

public class Q1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		double[] scores = new double[N];
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < scores.length-1; i++) {
			double A = scores[i];
			double B = scores[i+1];
			
			if(A > B ) {
				scores[i] = B;
				scores[i+1] = A;
			}
		}
		
		double maxScore = scores[N-1];
		double sum = 0;
		
		double[] newScores = new double[N];
		for (int i = 0; i < newScores.length; i++) {
			newScores[i] = scores[i] / maxScore * 100;
			sum +=newScores[i];
		}
		
		System.out.println(sum / N );
		
	}

}
