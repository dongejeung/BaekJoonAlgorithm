package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Q1541_2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String sentence = br.readLine();
		
		// 연산자들만 순서대로 수집해서 StringBuffer 담음.
		StringBuffer ops = new StringBuffer();
		for (int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if(c == '-' || c == '+') ops.append(c);
		}
		
		int firstMinudIndex = ops.indexOf("-");
		
		String fixedSentence = sentence.replace("-", "+");
		String[] arr = fixedSentence.split("\\+"); 
		
		List<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			numList.add(Integer.parseInt(arr[i]));
		}
		
		int accum = numList.get(0);
		if(firstMinudIndex == -1) {
			for (int i = 0; i < numList.size()-1; i++) {
				accum = calOp(accum, '+' ,numList.get(i+1));
			}
		}else {
			if(firstMinudIndex > 0) {
				for (int i = 0; i < firstMinudIndex; i++) {
					accum = calOp(accum, ops.charAt(i) ,numList.get(i+1));
				}
			}
			
			for (int i = firstMinudIndex; i < numList.size()-1; i++) {
				accum = calOp(accum, '-' ,numList.get(i+1));
			}
		}
		
		bw.write(Integer.toString(accum));
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	public static List<Integer> chkOpReversal(List<Character> operators) {
		List<Integer> reversalPoints = new ArrayList<Integer>();
		char firstOp = operators.get(0);
		
		int point = 0;
		
		return reversalPoints;
	}
	
	public static int calOp(int pre, char op, int after) {
		int result = 0;
		if(op == '+') {
			result = pre + after;
		}else {
			result = pre - after;
		}
		return result;
	}
	
}
