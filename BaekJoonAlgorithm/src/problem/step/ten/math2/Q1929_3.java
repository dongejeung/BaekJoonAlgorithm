package problem.step.ten.math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 1. 소수는 일반공식이 밝혀지지 않았음(리만 가설이었나..)
 * 2. 1과 자신 외에 인자가 존재하는 지 여부를 연산해야함
 * 3. 연산횟수와 메모리사용을 최소로 하는 게 좋음
 * 4. 글고 친구가 List는 효율이 안좋댔음
 * 5. 결과값을 메모리에 미리 할당해 놓는게 memorization 인가 그렇댔음
 * 6. M ~ N 범위내에서 2의 배수의 개수, 3의 배수의 개수...
 * 7. 연산의 횟수를 줄이는 것은 대상 배열의 크기를 줄여갈 수 있음(동적으로)
 * 7-1. 내부 연산의 구조나 메모리 재활용 가능한 구조(재귀, 동적) 사용 가능
 * 7-2. 데이터 구조와 연산 종류에 따라서 속도나 메모리 덜 먹는 게 있음 
 * (직접적인 File I/O or 비트 쉬프트 연산등, Low Level 상에서의 로직 묶음을 까보면 그런거 같음)
 * 8. 1씩 증가하는 연속적인 수이기 때문에 중간을 기준으로 반을 나눠볼 수도 있겠다.
 * 9. 어차피 어떻게 소거를 잘하냐인데..
 * 10. 조건부로 배열에 있는 값을 1 같은것으로 변경해보자.
 * 11. 음 소수가 아닌수는 2^(x) * 3^(y) * 5^(z) * ... 이런식으로 소인수분해가 될 것이다.
 * 
 * 12. 걍 배열의 크기를 N으로 잡자 => int numArr[1] = 1 이런식으로 i 와 숫자를 1대1 매핑시켜주자. 
 * 
 * 13. 소수중에 가장 작은 수는 2 이다. 
 * 13-1. 어떤수 N 을 2 로 나누었을 때 나누어 떨어지지 않는다면, 
 * 해당 수는 2를 인자로 가지고 있지 않고,
 * 소주 중에서는 2가 가장 작기 때문에, 
 * N의 인자가 될 가능성이 있는 범위는 N / 2 
 * (에서 버림 반올림 뭐 이런거 필요한가.. 아마 없어도 될 듯도 하다) 
 * 보다 작을 수 밖에 없다.
 * 이런 식으로 나누어 보는 수의 범위를 지속적으로 줄여갈 수 있을 것 같다.
 * 
 * ==>> 뭔가 착각한것 같다. ㅋㅋㅋㅋ
 * 
 * 
 */
public class Q1929_3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(stk.nextToken());
		int N = Integer.parseInt(stk.nextToken());
		
		// 1은 인자가 될 수 없으므로 제낌.
		if(M == 1) M = 2;
		// 이상 이하라 +1
		// 배열에 조건에 지정된 연속된 수를 할당
		int[] numList = new int[N-M+1];
		for (int i = 0; i < numList.length; i++) {
			int num = M+i;
			if(num == 2) {
				bw.write(Integer.toString(num)+ "\n");
			} else if(chkPrimeNum(num) != 0) {
				bw.write(Integer.toString(num)+ "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int chkPrimeNum(int num) {
		
		int resultNum = 0;
		int range = num;
		
		for (int i = 2; i <= range; i++) {
			if(num % i != 0) {
				// 걍 귀찮아서 math 안쓰고 auto Casting 시킴
				range = (int)(num / i +1);
			} else  {
				break;
			}
			
			if(i >= range) {
				resultNum = num;
				break;
			}
			
		}
		
		return resultNum;
		
	}
	
}
