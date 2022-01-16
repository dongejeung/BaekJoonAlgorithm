package problem.code.plus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Q1248 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String inputStr = br.readLine();
		
		Queue<Character> q = new LinkedList<>();
		
		for (int i = 0; i < inputStr.length(); i++) {
			q.add(inputStr.charAt(i));
		}
		
		while(N > 0) {
			
			
			N--;
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
