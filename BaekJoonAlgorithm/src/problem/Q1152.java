package problem;

import java.util.Scanner;

public class Q1152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		scan.close();
		sentence = sentence.trim();
		String [] sentenceCount = sentence.split(" ");
		if (sentence.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(sentenceCount.length);
		}		
	}
}
