package problem.step.six.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4344_5 {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int C = Integer.parseInt(sc.nextLine());
		
//		double[][] classScores = new double [C][0];
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int C = Integer.parseInt(br.readLine());
			
			String[] results = new String[C];
			
			double[][] classScores = new double [C][0];
			
			String flag;
			for (int i = 0; i < C; i++) {
				String line= br.readLine();
				
				String[] lineArray = line.split(" ");
				
				
				// lineArray[0]을 배열의 크기로 지정하고, 나머지 인자 캐스팅 후에 새로운 배열에 삽입.
				int lineIntArraySize = Integer.parseInt(lineArray[0]);
				double[] lineIntArray = new double[lineIntArraySize];
				for (int j = 0; j < lineIntArray.length; j++) {
					lineIntArray[j] = Double.parseDouble(lineArray[j+1]);
				}
				
				double sum = 0;
				
				int innerArraySize = Integer.parseInt(lineArray[0]);
				
				classScores[i] = new double[innerArraySize];
				
				for (int j = 0; j < lineIntArray.length; j++) {
					
					double temp = lineIntArray[j];
					classScores[i][j] = temp;
					sum += temp;
				}
				
				double avg = sum / innerArraySize;
				
				double cnt = 0;
				
				for (int j = 0; j < lineIntArray.length; j++) {
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
			  
			  results[i] = E;
				
			}
			
			br.close();
			
			bw.flush();
			bw.close();
			
			for (int j = 0; j < results.length; j++) {
				System.out.println(results[j]);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}

