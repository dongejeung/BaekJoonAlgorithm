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
			// 셋째 자리 반올림 처리.
			if(A % 10 >= 5) {
				A +=10;
			}
			
			// 수식 계산만으로는 괜찮았겠지만, .000 같은 것을 처리하기 위해 String 처리를 해보겠다.
			int B = (int) A / 10;
			String D = Integer.toString(B);
			
			// char 를 사용한 배열로 특정 위치에 . 삽입하기 시도.
			int leng = D.length()+1;
			// 일부러 char 배열형태로 사용해봄.
			// char 타입 range 배열에 
			// char 사용시 ''(single quotation 사용해야함.)
			char[] range = new char[leng];
			for (int j = 0; j < leng; j++) {
				if(j < 2) {
//					range[j] = D.charAt(j);
					System.out.print( D.charAt(j));
				}else if(j == 2) {
//					range[j] = '.';
					System.out.print(".");
				} else {
//					range[j] = D.charAt(j-1);
					System.out.print(D.charAt(j-1));
				}
			}
			System.out.println("%");
			
			/*
			 * String E = ""; for (int j = 0; j < range.length; j++) { E += range[j]; } E +=
			 * "%";
			 * 
			 * System.out.println(E);
			 */
			
//			A = ((double) B) / 1000;
//			System.out.println(A + "%");
//			cf) char[] 형태로 선언했을 시 맨 끝에 공백이 있으면 for 문으로 String에 할당해 주더라도,
//			나중에 "%" 같은 것이 안붙고 그럼.
//			디버깅으로 순차적으로 돌릴 때는 괜찮은데.. 
//			한꺼번에 그냥 실행시키면, 맨 마지막 값이 출력이 안된다.
//			백준 검산에서는 런타임 에러라고 뜬다.. 
//			뭔가 비동기 같은 에러가 나는 것인가..
//			논리식 로직은 맞는 것 같은데..
//			뭔가 성능 이슈같은 것인가?
//			현재로써는 원인 파악하기가 좀 힘들 것 같은데..
//			복제 파일을 하나 만들고, 수정 혹은 refactoring 해야겠다.
//			흠 네바퀴 돈 다음에.. 엔터를 한 번 더 치면 도네..
//			아무래도 지금 내 판단으로는, 1. 성능이슈. 2. 로직의 난잡함.
//			뭐 이런 이유가 아닐까 한다.
		}
	}

}

