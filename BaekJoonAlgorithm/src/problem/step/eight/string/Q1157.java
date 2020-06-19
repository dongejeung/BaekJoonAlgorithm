package problem.step.eight.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 맵을 사용해보자.
 * 
 * 1. 맵에 대문자 A ~ Z 까지의 알파벳을 넣고, 값으로 int(횟수)를 0으로 초기화한다.
 *
 * 2. 콘솔로부터 입력받은 문자를 한자씩 빼서, key값과 일치하는 경우 해당 value를 1씩 증가시켜준다.
 * 
 * 2-1. 소문자의 경우 대문자로 변환한다.
 * (내장함수 toUpperCase로 모두 바꿈.)
 * 
 * ...
*/
public class Q1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s = "";
//		while(sc.hasNext()) {
//			s += sc.next();
//		}
//		s = s.toUpperCase(); 
		String s = sc.next().toUpperCase();
		if(s.length() == 1) {
			System.out.println(s);
		} else {
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for (int i = 0; i < s.length(); i++) {
				
				char a = s.charAt(i);
				if(!map.containsKey(a)) {
					map.put(a, 1);
				} else {
					int priorVal = map.get(a);
					int postVal = ++priorVal;
					map.replace(a, postVal);
				}
			}
			
			int[] cnt = new int[map.size()];
			int k = 0;
			Iterator<Character> keys = map.keySet().iterator();
			while(keys.hasNext()) {
				char key = keys.next();
				cnt[k] = map.get(key);
				k++;
			}
			
//		int max;
//		for (int i = 0; i < cnt.length-1; i++) {
//			if(cnt[i] > cnt[i+1]) {
//				int a = cnt[i];
//				int b = cnt[i+1];
//				cnt[i] = b;
//				cnt[i+1] = a;
//			}
//		}
			
			// 배열 정렬하기 내장함수?
			Arrays.sort(cnt);
			
			int max = cnt.length - 1;
			if(cnt[max] == cnt[max-1]) {
				System.out.println("?");
			} else {
				Iterator<Character> kes = map.keySet().iterator();
				while(kes.hasNext()) {
					char key = kes.next();
					if(map.get(key) == cnt[max]) {
						System.out.println(key);
					}
				}
			}
			
		}
		
		
	}
	
}
