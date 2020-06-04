package problem.step.eight.string;

import java.util.Scanner;

public class Q11654 {
	public static void main(String[] args) {
		// 그냥 캐스팅 없이 해버리면 될 것 같기도 한데..
		// 예제 코드를 보면 무식하게 유도하는 것 같기도 하다.
		// 캐스팅 삑내면 될 것 같기도 한다..
		
		// byte로 캐스팅해주면 되는 듯.
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		byte[] b = a.getBytes();
		System.out.println(b[0]);
		
	}
}
