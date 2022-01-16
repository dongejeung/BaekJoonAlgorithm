package problem.code.plus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q10845 {
		static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		static Queue<String> q = new LinkedList<String>();
		static String lastVal = null;
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		
		
		for (int i = 0; i < N; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			queueCommand(stk);
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void queueCommand(StringTokenizer stk) throws IOException {
		
		String command = stk.nextToken();
		String addened = null;
		if(stk.hasMoreTokens()) addened = stk.nextToken(); 
		
		switch (command) {
		case "push":
			lastVal = addened;
			q.offer(addened);
//			bw.write(addened);
//			bw.write("\n");
			break;
		case "pop":
			if(q.isEmpty()) bw.write("-1");
			else bw.write(q.poll());
			bw.write("\n");
			break;
		case "size":
			bw.write(Integer.toString(q.size()));
			bw.write("\n");
			break;
		case "empty":
			if(q.isEmpty()) bw.write(Integer.toString(1));
			else bw.write(Integer.toString(0));
			bw.write("\n");
			break;
		case "front":
			if(q.isEmpty()) bw.write("-1");  
			else bw.write(q.peek());
			bw.write("\n");
			break;
		case "back":
			if(q.isEmpty()) bw.write("-1");  
			else bw.write(lastVal);
			bw.write("\n");
			break;
		default:
			break;
		}
	}
	
	
	
}
