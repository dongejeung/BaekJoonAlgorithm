package problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q3058 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			
		}
		
		get_less(0, 0);
	}
	
	public static int get_less(int num1, int num2) {
		int rs = num1;
		if(num1 - num2 > 0) rs = num2;
		
		return rs;
	}
	
}



