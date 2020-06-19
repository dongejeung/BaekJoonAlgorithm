import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class testCase {

	public static void main(String[] args) {
		
		try {
			
			char[] alpabat = new char[26];
			  
			  for(int i=0; i<alpabat.length; i++) {
				alpabat[i] = (char)('A'+i);
				System.out.print(alpabat[i]+" ");
			  }
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}