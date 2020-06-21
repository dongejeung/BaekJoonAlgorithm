package problem.step.nine.math1;

import java.util.Scanner;

public class Q2869 {
	/*
	 * 1. 값이 반복된다고 보면 됨.
	 * 
	 * 2. +A, -B, +A, -B
	 * 
	 * 3. 아마 추측컨데, V - A => diff (A-B) 로 나누어 떨어질 것이다.
	 * => 이게 잘못 생각한거임.
	 * ==>> 아니다 이건 맞는데,
	 * ==>> 아마 나누기 소수점 계산 이슈가 있으려나? => 비슷한 이슈가 있는 것 같다.
	 * 
	 * ===>>> V % diff 랑 A랑 대소비교를 해야하나.
	 * 
	 * ===>>> 걍 일단 전개해보자.
	 * 
	 * 4. A, A-B, 2A-B, 2A-2B, 3A-2B
	 * 
	 * 5. (A, diff), (A+diff, 2diff), (A+2diff, 3diff)
	 * 
	 * 6. A, A+diff, A+2diff ...
	 * 
	 * 7. 결국 등차수열의 N번째 항이 > V 인 항을 출력하면 되지 싶다.
	 * 
	 * 8. A + N*diff > V => N 
	 * 
	 * 9. N > (V-A) / diff 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		int days = 1;
		int diff = A - B;
		
		int temp = V / diff;
		if(V % diff == 0) {
			days = V / diff + 1;
		}else if(V < temp*diff + A) {
			days = temp - 1;
		}
		
		System.out.println(days);
	}
}
