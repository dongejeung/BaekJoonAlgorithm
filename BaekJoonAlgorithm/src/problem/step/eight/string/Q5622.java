package problem.step.eight.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
* 1. 데이터 구조에 알파벳 : 시간의 형태로 정의한다.
*/
public class Q5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int increase = 3;
		for (int i = 1; i <= 26; i++) {
			
			char temp = (char)('A'+i-1);
			if(i <= 15) {
				map.put(temp, increase);
				if(i % 3 == 0) {
					increase++;
				}
			}else if(i <= 19) {
				map.put(temp, increase);
				if(i == 19) {
					increase++;
				}
			}else if(i <= 22) {
				map.put(temp, increase);
				if(i == 22) {
					increase++;
				}
			}else {
				map.put(temp, increase);
			}
			
		}
		
		char[] c = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
		
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum += map.get(c[i]);
		}
		
		System.out.println(sum);
		
	}
}
