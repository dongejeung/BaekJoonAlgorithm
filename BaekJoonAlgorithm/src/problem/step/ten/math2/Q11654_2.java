package problem.step.ten.math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11654_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int factor = 2;
		while(N != 1) {
			if(N == factor) {
				bw.write(Integer.toString(factor)+ '\n');
				break;
			} else if(N % factor == 0) {
				
				bw.write(Integer.toString(factor)+ '\n');
				N /= factor;
			} else {
				factor++;
			}
		}
		
		bw.flush();
		bw.close();
		
	}
}
