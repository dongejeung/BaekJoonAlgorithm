package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/*
 * 	1. 어차피 횟수는 N^(M) 의 경우의 수가 나올 것 같다.
 * 	2. 수열의 순서의 status 를 저장하는 방식이 가능할 것 같다.
 * 	3. 증가하는 순서의 숫자가 M 에 도달하면 앞 차수의 수를 1 증가시키고, 
 * 	본인은 1로 초기화 되는 식의 작업을 반복할 수 있을 것 같다.
 */
public class Q15651 {
	public static void main(String[] args)	throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		br.close();
		
		int[] sequence = new int[M];
		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = 1;
		}
		
		int n  = N;
		
		printArr(bw, sequence);
		boolean sibal = true;
		if(N == 1 && M == 1) sibal = false;
		//while(!(sequence[0] == N && sequence[sequence.length-1] == N)) {
		while(sibal) {
			// 1 ~ 1 로 시작해서 M ~ M 이 되면 종료
			//if(sequence[0] == N && sequence[sequence.length-1] == N) break;
			
			// 수열의 자리수는 0 ~ sequence.length-1
			// 일단 가장끝을 1씩 증가시켜야 함
			int toBeIncreased = chkNotNPoint(sequence, n);
			sequence[toBeIncreased]++;
			printArr(bw, sequence);
			for (int i = 0; i < sequence.length; i++) {
				
			}
			if(chkAllN(sequence, N)) break;
		}
		
		bw.flush();
		bw.close();
	
	}
	
	public static void printArr(BufferedWriter bw, int[] sequence) throws IOException {
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int z = 0; z < sequence.length; z++) {
			bw.write(Integer.toString(sequence[z])+ " ");
		}
		bw.write("\n");
		//bw.flush();
		//bw.close();
	}
	
	public static boolean equalM(int num, int M) {
		boolean result = false;
		if(num == M) result = true;
		return result;
	}
	
	// 배열의 끝항부터 초항까지 N이 아닌 가장 뒤의 항의 위치를 반환
	public static int chkNotNPoint(int[] sequence, int N) {
		int a = sequence.length -1;
		for (int ii = (sequence.length -1); ii >= 0; ii--) {
			if(sequence[ii] < N) {
				a = ii;
				break;
			} else {
				sequence[ii] = 1;
				a--;
			}
		}
		
		return a;
	}
	
	public static boolean chkAllN(int[] sequence, int N) {
		boolean result = true;
		for (int z = 0; z < sequence.length; z++) {
			if(sequence[z] != N) {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
}
