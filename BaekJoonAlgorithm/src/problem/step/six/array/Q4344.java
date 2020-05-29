package problem.step.six.array;

import java.util.Scanner;

public class Q4344 {
	/*
	 * 2차원 배열을 쓰라고 유도하는 것 같은데..
	 * 
	 * 2차원 배열 선언하고 사용법이 가물하다.
	 * 
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		
		// 배열의 크기 앞에꺼만 지정해서 쓸 수 있네.
		// + 배열의 크기는 정수여야 됨.
		double[][] classScores = new double [C][1];
		
		// 이중 for문으로 배열에 인자 삽입.
		for (int i = 0; i < classScores.length; i++) {
			
			int innerArraySize = sc.nextInt();
			
			double sum = 0;
			// 내부 배열은 다 null로 되어 있음. 초기화 시도.
			// 기본으로 선언시 1이라는 사이즈를 줘서
			// 널로 선언되는 것을 방지한 후,
			// 다시 새로운 크기의 배열을 할당해줌.
			classScores[i] = new double[innerArraySize];

			for (int j = 0; j < innerArraySize; j++) {
				
						
				double temp =sc.nextDouble();
				classScores[i][j] = temp;
				sum += temp;
			}
			
			double avg = sum / innerArraySize;
			
			double cnt = 0;
			for (int j = 0; j < innerArraySize; j++) {
				if(classScores[i][j] > avg) {
					cnt++;
				}
			}
			
			// 소수점 버리고 자리수 맞춰야함.
			// 테스트 케이스로 double => int 캐스팅하면 자릿수 없앨 수 있음.
			// 단, 블락 처리를 잘해야함.
			// 캐스팅도 어떻게 하느냐에 따라 int로 했는데 xx.0 이런 소수점 값이 나오기도 한다.
			double A = (cnt / innerArraySize) * 1000000;
			int B = (int) A;
			A = ((double) B) / 10000;
			System.out.println(A + "%");
			
		}
	}

}
