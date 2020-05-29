package problem.step.six.array;

import java.util.Scanner;

public class Q8958 {
	/*
	 * 범위를 나눠서 n! 의 합을 구해야할 듯.
	 * 
	 * 1. 배열의 방 번호가 기준점.
	 * 2. 첫 번째 O 등장 시기가 첫 범위의 시작점.
	 * 3. 범위의 끝 지점은 X 등장 시기의 앞 번호.(혹은 배열의 끝)
	 * 4. 새로운 배열을 만들까 했지만, 범위를 구할때마다 sum += n!을 하면 될 듯.
	 * >> 아 얼빠지게도 + 데 뭔 !이냐.. ㅋㅋㅋㅋ
	 * 
	 * cf) n!의 경우 반복문이나, 재귀문을 통해서 가능할 듯.
	 * ...
	 *  
	 * ==>> 아, 간단한 관계식으로도 구현할 수 있을 것 같다.
	 * 
	 * ==>> 아 놔, 이거 string 내장함수 사용하면 쉬웠을지도 모르겠네..
	 * indexOf 같은거..
	 * 
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int x = 0;
		int sum = 0;
		
		String[] answers = new String[N];
		
		for (int i = 0; i < answers.length; i++) {
			answers[i] = sc.next();
		}
		
		for (int i = 0; i < answers.length; i++) {
			
			int distance = answers[i].length();
			for (int j = 0; j < distance; j++) {
				if(answers[i].substring(j, j+1).equals("O")) {
					x++;
					if(j == distance-1 
							&& answers[i].substring(distance-1, distance).equals("O")) {
						int y = 0;
						for (int k = 0; k < x; k++) {
							y++;
							sum += y;
						}
						x = 0;
					}

				}else if(answers[i].substring(j, j+1).equals("X")) {
					int y = 0;
					for (int k = 0; k < x; k++) {
						y++;
						sum += y;
					}
					x = 0;
				} 				
			}
			
			System.out.println(sum);
			sum = 0;
		}
		
	}

}

