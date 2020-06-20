package problem.step.eight.string;

import java.util.Scanner;

public class Q2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		String[] s = new String[8];
		
		s[0] = "c=";
		s[1] = "c-";
		s[2] = "dz=";
		s[3] = "d-";
		s[4] = "lj";
		s[5] = "nj";
		s[6] = "s=";
		s[7] = "z=";
		
		for (int i = 0; i < s.length; i++) {
			input = input.replaceAll(s[i], "a");
		}
		
		System.out.println(input.length());
	}
}
