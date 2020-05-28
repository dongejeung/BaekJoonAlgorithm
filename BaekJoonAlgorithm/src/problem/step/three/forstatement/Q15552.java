package problem.step.three.forstatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Q15552 {
	public static void main(String[] args) {
		/*
		 * 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다.
		 * 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수
		 * 있다는 점이다.
		 * 
		 * C++을 사용하고 있고 cin/cout을 사용하고자 한다면, cin.tie(NULL)과 sync_with_stdio(false)를 둘 다
		 * 적용해 주고, endl 대신 개행문자(\n)를 쓰자. 단, 이렇게 하면 더 이상
		 * scanf/printf/puts/getchar/putchar 등 C의 입출력 방식을 사용하면 안 된다.
		 * 
		 * Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와
		 * BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
		 * 
		 * Python을 사용하고 있다면, input 대신 sys.stdin.readline을 사용할 수 있다. 단, 이때는 맨 끝의 개행문자까지
		 * 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 .rstrip()을 추가로 해 주는 것이 좋다.
		 * 
		 * 또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 
		 * 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
		 * 
		 * 자세한 설명 및 다른 언어의 경우는 이 글에 설명되어 있다.
		 * 
		 * 이 블로그 글에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.
		 * 
		 * ref) ttps://www.acmicpc.net/problem/15552
		 */
		
		/*
		 * BufferReader class 탐색중..
		 * Q15552_ref 파일 참조.
		*/
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
			
			int A = Integer.parseInt(br.readLine());
			for (int i = 0; i < A; i++) {
				String[] nums = br.readLine().split(" ");
				
				int B = Integer.parseInt(nums[0]);
				int C = Integer.parseInt(nums[1]);
				String sum = (B + C) + "";
				bw.write(sum);
				bw.newLine();
			}
			
			br.close();
			
			bw.flush();
			bw.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
