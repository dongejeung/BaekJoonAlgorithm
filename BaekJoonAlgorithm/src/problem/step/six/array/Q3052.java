package problem.step.six.array;

import java.util.Scanner;

public class Q3052 {
	/*
	 * 1. 배열에 할당.
	 * 2. 나머지 배열에 할당.
	 * 3. 나머지 배열의 개수 10개에서 같은 수가 있으면 배열사이즈에서 카운트 빼줌.
	 * ==>> 전수 상호비교해야 할 것 같음.
	 * 0 compare 1~9 > 1 compare 2~8
	 * 
	 * ==>> 위의 식으로 하면 같은 것이 여러 개 있을 때 값이 잘못 나옴.
	 * 1. 같은 값이 있을 경우 해당 값을 기준값 옆으로 바꿔치기 해주고,
	 * 2. 비교 기준점 + 1 & 반복횟수 -1 => cnt 
	 * 안 된다.
	 * 
	 * ==> 배열에서 같은 것을 체크해서,
	 *  해당 인자를 빼고 새로운 배열을 만드는 식으로 풀어봄.
	 *  
	 *  ==>> array로 List를 구현한다고 생각해도 좋을 듯.
	 *  
	 *  배열 선언 방식을 생각해보자.
	 *  아,
	 *  배열 빈 배열로도 선언할 수 있었지...
	 *  
	 *  ===
	 *  
	 *  여튼 나머지가 같은 배열의 방 번호를 얻어올 필요가 있다.
	 *  작은 것부터 하자, 작은 것 부터..
	 *  
	 *  다음과 같이 풀었다.
	 *  
	 *  : 전수 비교를 해서 같은 값이 있으면 해당 배열 인자를 -1로 바꾸어 주었다.
	 *  => 그다음 배열의 크기를 cnt = 10으로 놓고 -1 일 경우 -1 씩 해주었다.
	 *  => 그다음 cnt를 출력한다. 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		int[] rests = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			rests[i] = nums[i] % 42;
		}
		
		for (int i = 0; i < rests.length; i++) {
			
			
			for (int j = i+1; j < rests.length; j++) {
				if(rests[i] == rests[j]) {
					rests[j] = -1;
				}
			}
		}
		
//		System.out.print("[");
//		for (int j = 0; j < rests.length; j++) {
//			System.out.print(rests[j] + " ");
//		}
//		System.out.print("]");
		
		int cnt = 10;
		for (int i = 0; i < rests.length; i++) {
			if(rests[i] == -1) {
				cnt--;
			}
		}
		
		System.out.println(cnt);
	}

}
