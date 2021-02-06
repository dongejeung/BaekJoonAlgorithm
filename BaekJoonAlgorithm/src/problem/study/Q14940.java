package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 	2차원 배열을 써보자
 * 	1. 적절한 자료형을 사용하는 것이 막막하다.
 * 	2. 막힌 공간 때문에 순서쌍 간의 거리를 구하는 것은 의미가 없고,
 * 	3. 순서쌍까지 x, y 좌표를 하나씩 줄여줘야되는데, 
 * 	4. 미로처럼 막힌 공간이 있을 수 있다.
 * 	5. 즉 3면이 0 으로 둘러쌓인 곳의 좌표를 따로 저장해야 할 수 있을 것 같다. 
 * 	6. 스타팅 포인트 기준으로, x, y 축 열이 모두 0 으로 막힌 경우에는 갈 수 없어 -1 이다.
 */
public class Q14940 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		int[][] map = new int[N][];
		
		/*
		 * 	각 x, y 좌표를 이차원 배열에 할당,
		 * 	값이 2인 경우와 0인 경우는 따로 좌표쌍을 저장
		 */
		int destination[] = new int[2];
		for (int i = 0; i < map.length; i++) {
			StringTokenizer innerStk = new StringTokenizer(br.readLine());
			for (int j = 0; j < map[i].length; j++) {
				int num = Integer.parseInt(stk.nextToken());
				if(num == 2) {
					destination[0] = i;
					destination[1] = j;
				}else {
					map[i][j] = num;
				}
			}
		}
		
	}
}
