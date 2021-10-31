import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

// score, rank, Id, 내는 순서 4가지의 변수가 들어가야함.
public class Test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(stk.nextToken()) * 2;
		int M = Integer.parseInt(stk.nextToken());
		
		String[][] dataSet = new String[N][];
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
}
