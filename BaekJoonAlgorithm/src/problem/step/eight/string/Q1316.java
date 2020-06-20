package problem.step.eight.string;

import java.util.Scanner;

public class Q1316 {
	/*
	 * 1. 문자열에서 특정 문자의 firstIndex, lastIndex 를 구한다.
	 * 2. 해당 문자열 사이에 다른 문자열이 끼어 있다면, 그룹문자가 아니다.
	 * 3. for 문으로 문자내의 char를 모두 순회한다.
	 * 3. 입력 받은 문자의 개수 N에서 N-- 로 카운트를 줄여준다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = N;
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				boolean isGroupString = true;
				char indexChar = s.charAt(j);
				int startIndex = s.indexOf(indexChar);
				int lastIndex = s.lastIndexOf(indexChar);
				
				for (int k = startIndex; k <= lastIndex; k++) {
					if(indexChar != s.charAt(k)) {
						isGroupString = false;
						break;
					}
				}
				if(!isGroupString) {
					cnt--;
					break;
				}
				
			}
			
		}
		
		System.out.println(cnt);
	}
}
