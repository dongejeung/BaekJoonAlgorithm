import java.util.Scanner;

// score, rank, Id, 내는 순서 4가지의 변수가 들어가야함.
public class Test3 {
	//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			System.out.println((A+B)%C);
			System.out.println(((A%C) + (B%C))%C);
			System.out.println((A*B)%C);
			System.out.println(((A%C) * (B%C))%C);
		}

	}

