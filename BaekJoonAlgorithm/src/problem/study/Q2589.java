package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 	1. 끝 점들의 위치를 파악해보자.
 * 	1-1. 본인의 위치 중심으로 상하좌우중 3면이 바다 혹은 지도의 밖이면 끝점이다.
 * 	1-2. 지도의 밖(지도의 밖과 바다가 붙어 있으면 지도의 밖으로 간주해도 될 듯 하다.)이 포함된 경우는
 * 	2면만 막혀 있어도 끝점이다.
 * 	
 */
public class Q2589 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(stk.nextToken());
		int x = Integer.parseInt(stk.nextToken());
		
		int[][] map = new int[y][x];
		for (int i = 0; i < y; i++) {
			StringTokenizer stk2 = new StringTokenizer(br.readLine());
			String s = stk2.nextToken();
			for (int j = 0; j < x; j++) {
				char c = s.charAt(j);
				int result = 0;
				if(c == 'L') result = 1;
				map[i][j] =  result;
			}
		}
		
	}
}
