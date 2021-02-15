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
 *  막혀있는 경우만 아니면, 순서쌍 간의 차만 구해도 됨.
 *  막힌경우 
 *  1. 목적지까지 길이 완전 막힘(위, 아래, 좌, 우) => -1 을 출력
 *  2. (최단경로상) x축 혹은 y축 한쪽만 막힘 => 경로수에 지장 없음(대각선 이동 없)
 *  3. (최단경로상) x, y 축 모두 막혀 돌아가야 함
 *  
 *  ===
 *  
 *  4. start => goal 까지의 경로에 0(벽) 이 어떻게 분포되었는지를 파악해야함.
 *  4-1. start > wall > goal or start < wall goal 일 경우
 *  
 *  5. 벽(0)을 단일 벽과 연속된 벽으로 구분할 수도 있을 것 같다.
 *  5-1. 격자의 경우도 불규칙한 연속벽으로 간주할 수도 있을 것 같다.
 *  5-2. 연속된 벽의 경우는 기존 벽과의 위상차가 x, y 1이하이다.
 *  
 *  6. 그냥 start 지점에서 하나하나 시뮬레이션 돌리는 식으로 연산할 수도 있을 것 같다.
 */
public class Q14940_2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		int[] startP = new int[2];
		int[] goalP = new int[2];
		List<int[]> walls = new ArrayList<int[]>();
		
		int[][] nodes = new int[N][M];
		for (int i = 0; i < N; i++) {
			StringTokenizer stk2 = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int num = Integer.parseInt(stk2.nextToken());
				nodes[i][j] = num;
				
				if(num == 2) {
					goalP[0] = i;
					goalP[1] = j;
				}else if(num == 0) {
					int[] temp = new int[2];
					temp[0] = i;
					temp[1] = j;
					walls.add(temp);
				}
				
			}
		}
		
		
	}
	
	// 실제 시뮬레이션 부분
	int calDistance(int[] start, int[] goal, List<int[]> walls) {
		int result = 0;
		// case 1 (최단경로상) 완전뚫림 
		// case 2 (최단경로상) 한쪽뚫림 => 1과 같음
		// case 3 (최단경로상) 막혀서 돔
		// case 4 (최단경로상) 완전막혀 못감
		return result;
	}
	
}
