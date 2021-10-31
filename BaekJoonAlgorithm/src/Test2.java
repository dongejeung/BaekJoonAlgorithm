import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String N = br.readLine();
		
		int lang = 4;
		int neeadLang = 4 - N.length();
		String ans = "";
		
		for (int i = 0; i < neeadLang; i++) {
			ans += "0";
		}
		ans += N;
		
		bw.write(ans);
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
}
