package problem.step.seven.function;

public class Q4673 {
	/*
	 * d(75) = 75+7+5 = 87
	 * => d(x) = y
	 * ==>> x는 y의 생성자다.
	 * 
	 * 1. 생성자를 구하는 식
	 * => 은 직관적으로 어려울 것 같음.
	 * 
	 * 2. 1 ~ 10,000 수 중에서 생성자가 있는 경우를 제끼면 될 듯.
	 * 
	 * 3. 좀 더 low depth 로 들어가면 자릿수 계산이 다른 것도 있을 것 같다.
	 *
	*/
	public static void main(String[] args) {
		
		// nums에 1~10000수를 넣어줌. 
		int[] nums = new int[10000];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
		}
		
		// 셀프 number가 아닌 수들을 다 noSelfNum배열에다 넣어줌.
		int[] noSelfNum = new int[10000];
		for (int i = 0; i < 10000; i++) {
			Q4673 t = new Q4673();
			noSelfNum[i] = t.cons(i);
		}
	
		// 배열 nums의 인자 하나를 noSelfNum 배열 전체와 비교해줌.
		// 같은 값 존재시 nums 인자값 -1로 변경.
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < noSelfNum.length; j++) {
				if(nums[i] == noSelfNum[j]) {
					nums[i] = -1;
				}
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != -1) {
				System.out.println(nums[i]);
			}
		}
	}
	
	//생성자를 구하는 함수.
	public int cons(int x) {
		int ans = x;
		
		// 귀찮으니까 string 캐스팅을 이용하자.
		String s = Integer.toString(x);
		
		int[] a = new int[s.length()];
		for (int i = 0; i < a.length; i++) {
			a[i] += s.charAt(i) - '0';
			
			ans += a[i];
		}
		
		return ans;
	}
}
