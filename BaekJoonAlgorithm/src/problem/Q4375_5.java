package problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q4375_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// EOF 처리 => EOF 입력법이 따로 있다함.
		String input = ""; 
		while((input = br.readLine()) != null){
			bw.write(chkOne(input) +"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static String chkOne(String n) {
		String ans = "";
		BigInteger base = BigInteger.ONE;
		while(true) {
			BigInteger ba[] = base.divideAndRemainder(new BigInteger(n));
			if(ba[0].compareTo(BigInteger.ZERO) > 0 && ba[1].equals(BigInteger.ZERO))
				break;
			base = base.multiply(BigInteger.TEN).add(BigInteger.ONE);
		}
		ans = Integer.toString(base.toString().length());
		return ans;
	}
}
