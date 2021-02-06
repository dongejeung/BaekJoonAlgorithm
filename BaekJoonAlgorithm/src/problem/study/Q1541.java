package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
 * 	- 가 붙은 숫자의 끝에는 여는 괄호를 추가해야할 것 같다.
 * 	+ 가 붙은 숫자의 끝에는 닫는 괄호를 추가해야할 것 같다.
 * 
 * 	연산자의 갯수는 연산의 회수가 된다.
 * 
 * 	연산의 횟수가 많지 않기에 List 로 처리해도 될 듯
 * 
 * 	연산자의 결합 형태에 따른 연산처리를 해야 함.
 * 
 * 	1. 처음에 + 인 CASE
 * 	1-1. 다음연산자가 - 가 나올 때까지 그냥 연산하면 된다.
 * 	1-2. - 가 나왔다면 그 다음 연산자가 - 이면 그냥 연산하면 되고 + 라면,
 *   첫 - 로 반전된 위치에서 여는 괄호를 시작하고,
 *  , 그 + 연산자에서 반전이 있을 때 그 앞에서 연산자를 닫아준다.
 * 
 * 	2. 처음에 - 인 CASE
 *  ...
 *  
 *  3. 일반식 : 결국 연산자가 앞연산자와 다음 연산자의 반전이 있는 경우가,
 *   괄호를 생성하는 포인트가 된다.
 *   
 *  4. 걍 첫 마이너스가 나올떄 까지는 그냥 연산을 하여 계산한다.
 *  5. 첫 마이너스가 나온 이후에 + 가 나올때까지는 그냥 연산을 한다.
 *  6. ex) -----(++++)-(+)-(++)--
 *  
 */
public class Q1541 {
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
		}
		if(firstMinudIndex > 0) {
			for (int i = 0; i < firstMinudIndex; i++) {
				accum = calOp(accum, ops.charAt(i) ,numList.get(i+1));
			}
		}
		
		for (int i = firstMinudIndex; i < numList.size()-1; i++) {
			accum = calOp(accum, '-' ,numList.get(i+1));
		}
		
		// java에서 사용하는 eval 함수 ex)
		/*
		 * ScriptEngineManager mgr = new ScriptEngineManager(); ScriptEngine engine =
		 * mgr.getEngineByName("JavaScript"); String foo = "40+(2-1)+1";
		 * System.out.println(engine.eval(foo));
		 */

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
