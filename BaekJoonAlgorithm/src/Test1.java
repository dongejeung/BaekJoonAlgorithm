import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(stk.nextToken());
		int P = Integer.parseInt(stk.nextToken());
		
		int ans = 0;
		
		StringTokenizer stk2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int point = Integer.parseInt(stk2.nextToken());
			if(point < P) ans++;
		}
		
		bw.write(Integer.toString(ans));
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
}
