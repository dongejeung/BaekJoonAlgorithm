import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class testCase {

	public static void main(String[] args) {
		
		try {
			
			DecimalFormat form = new DecimalFormat("#.###");
			double a = 40.000; 
			System.out.print(form.format(a));
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
/*
40.000%
57.143%
33.333%
66.667%
55.556%
*/