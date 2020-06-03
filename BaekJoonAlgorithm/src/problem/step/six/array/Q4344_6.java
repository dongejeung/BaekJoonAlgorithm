package problem.step.six.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class Q4344_6 {
	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int size = Integer.parseInt(br.readLine());
			
			String[] scores = new String[size];
			String[][] stringScore = new String[size][];
			for (int i = 0; i < size; i++) {
				scores[i] = br.readLine();
				
				stringScore[i] = scores[i].split(" ");
			}
			
			double[][] classScores = new double[size][];
			
			for (int i = 0; i < stringScore.length; i++) {
				int arraySize = Integer.parseInt(stringScore[i][0]);
				classScores[i] = new double[arraySize];
			}
			
			for (int i = 0; i < classScores.length; i++) {
				for (int j = 0; j < classScores[i].length; j++) {
					classScores[i][j] = Double.parseDouble(stringScore[i][j+1]);
				}
			}
			
			double[] results = new double[size];
			for (int i = 0; i < classScores.length; i++) {
				
				
				double sum = 0;
				
				for (int j = 0; j < classScores[i].length; j++) {
					sum += classScores[i][j];
				}
				
				double avg = sum / classScores[i].length;
				
				double cnt = 0;
				for (int j = 0; j < classScores[i].length; j++) {
					if(classScores[i][j] > avg) {
						cnt++;
					}
				}
			
				double A = (cnt / classScores[i].length);
				
				/*
				double A = (cnt / classScores[i].length) * 1000000;
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
				  */
				
				  DecimalFormat form = new DecimalFormat("0.000%");
//				  results[i] = Double.parseDouble(E); 
				  results[i] = A; 
				  
				  System.out.println(form.format(results[i]));
				  
//				  E += "%";
//				  bw.write(E);
//				  bw.write("%");
//				  if(i != size) {
//					  bw.write("\r\n");
//				  }
				
			}
			
			br.close();
			
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			
		}
		
	}

}

