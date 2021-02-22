package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * 	1. 일단 환승역들을 구해서 출력해보자.
 */
public class Q2021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int stationCnt = Integer.parseInt(stk.nextToken());
		int lineCnt = Integer.parseInt(stk.nextToken());
		int[][] lines = new int[lineCnt][];
		
		for (int i = 0; i < lines.length; i++) {
			StringTokenizer stk2 = new StringTokenizer(br.readLine());
			int size = stk2.countTokens()-1;
			
			lines[i] = new int[size];
			for(int j = 0; j < lines[i].length; j++) {
				int stNum = Integer.parseInt(stk2.nextToken());
				lines[i][j] = stNum;
			}
		}
		
		StringTokenizer stk3 = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(stk3.nextToken());
		int end = Integer.parseInt(stk3.nextToken());
		
		/*
		 * 	환승역을 구해서 몇호선 몇호선을 통과하는지를 구하고 싶다.
		 */
		ArrayList<ArrayList<Integer>> hwanSengs = new ArrayList<ArrayList<Integer>>(); 
		
		System.out.println(hwanSengs);
	}
	
	List<Integer> findHwan(int[] first, int[] second, List<Integer> hwan) {
		
		return hwan;
	}
	
}
