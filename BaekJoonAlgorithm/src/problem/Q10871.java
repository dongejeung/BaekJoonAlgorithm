package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		List<Integer> nums = new ArrayList<Integer>(); 
		
		for (int i = 0; i < N; i++) {
			int tempNum = sc.nextInt();
			if(tempNum < X) {
				nums.add(tempNum);
				System.out.print(tempNum + " ");
			}
		}
		
	}

}
