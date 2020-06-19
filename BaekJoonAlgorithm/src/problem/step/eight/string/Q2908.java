package problem.step.eight.string;

import java.util.Scanner;

/*
 * 1. String으로 받음.
 * 
 * 2. 역으로 뒤집음.
 * 
 * 3. 대소 비교.
 * 
 * 4. 출력.
*/
public class Q2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		Q2908 Q = new Q2908();
		int ra = Q.reverse(a);
		int rb = Q.reverse(b);
		
		if(ra > rb) {
			System.out.println(ra);
		}else {
			System.out.println(rb);
		}
	}
	
	public int reverse(String s) {
		
		char[] A = new char[s.length()];
		for (int i = 0; i < A.length; i++) {
			A[i] = s.charAt(i);
		}
		
		String rs = "";
		for (int i = A.length-1; i >= 0; i--) {
			rs += A[i];
		}
		int ans = Integer.parseInt(rs);
		
		return ans;
	}
}
