package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/*
 * 	장대의 개수를 공간으로 봐야 하나?
 * 	스택의 구현이라 생각하면 좋을까?
 * 	장대의 최대 공간은 처음에 주어진 수이다.
 * 
 * 	다양한 가능한 경로를 생각해볼 수도 있을 것이다. 
 * 
 * 	하지만 결과로부터 역산을 시도해보는 것도 좋을 것 같다.
 * 	=> 으잉? 의미없네, 장대의 위치만이 바뀌고 연산은 동일한 것 같다.
 * 
 * 	몇 가지 간단한 규칙을 적용해볼 순 있을 것이다.
 * 	장대의 맨 윗만 꺼낸다는 규칙은 Stack 이라는 자료구조를 사용하면 끝난다.
 * 	추가할만한 규칙은 아래있는 원판이 위에 있는 원판보다는 크다는 규칙이다.
 * 	
 */
public class Q11729 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		// 장대를 원판을 놓을 공간으로 가정.
		Stack<Integer> firstSite = new Stack<Integer>();
		for (int i = N; i >= 1; i--) {
			firstSite.push(i);
		}
		
		System.out.println(firstSite);
		
		Stack<Integer> secondSite = new Stack<Integer>();
		Stack<Integer> thirdSite = new Stack<Integer>();
		
	}
}
