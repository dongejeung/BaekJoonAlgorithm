package problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 	1. 태그는 형태를 그대로 유지한다.
 * 	2. 첫 문자열이 < 인경우 태그로,
 * 	아닌 경우 그냥 문자열로 취급.
 * 	3. 태그의 경우 <, > 의 인덱스 등을 통해 open tag 와 close 태그를 따로 저장해둘 수 있다.
 * 	4. 문자열의 경우 공백 구분이기 때문에 split 등을 사용한다.
 * 	5. split으로 뒤집은 문자열 각각을 배열로 취급해 배열의 뒤집기하여 할당한다.
 * 	6. 출력 
 */
public class Q17413 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sentence = br.readLine();
		String result = "";
		if(sentence.contains("<")) {
			int openTagStart = sentence.indexOf("<");
			int openTagEnd = sentence.indexOf(">");
			String openTag = sentence.substring(openTagStart, openTagEnd+1);
			
			int closeTagStart = sentence.lastIndexOf("<");
			int closeTagEnd = sentence.lastIndexOf(">");
			String closeTag = sentence.substring(closeTagStart, closeTagEnd+1);
			
			String innerWords = reverseWords(sentence.substring(openTagEnd+1, closeTagStart));
			
			result = openTag+innerWords+closeTag;
		}else {
			result = reverseWords(sentence);
		}
		bw.write(result);
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static String reverseWords(String sentence) {
		String[] words = sentence.split(" ");
		String resultSentence = "";
		for (int i = 0; i < words.length; i++) {
			String innerTemp = "";
			for (int j = words[i].length()-1; j >= 0; j--) {
				innerTemp += words[i].charAt(j);
			}
			resultSentence += innerTemp+ " ";
		}
		resultSentence = resultSentence.substring(0, resultSentence.length()-1);
		return resultSentence;
	}
	
}
