package problem.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
 *	1. 특정 좌표에서 이동 가능한 좌표를 뽑아보자. 	
 *	2. 상: y -1, 하: y +1, 좌: x -1, 우: x +1 
 *
 *	3. 두 좌표까지의 최단거리를 구하려면 돌아가면 안된다.
 *	3-1. 기본적으로는 갈림길이 나타난다면, 
 *	목적 좌표까지의 방향과 반대방향으로 가면 안된다.
 *
 * 	4. 길이 하나밖에 없으면 걍 시간을 더해버리고, 지나간 경로를 없는 셈 쳐도 됨.
 * 	5. 분기가 생긴다면 분기가 생긴 위치에서 트리? 같이 포인트를 생성해줄 수도 있을 듯 하다.
 * 	
 *  6. 흠 기하적인 도형의 형태로 구현할 수 있을까? 재밌겠다.
 *  
 *  7. interSection 의 타입을 가지고 볼 수도 있겠다.
 *  7-1. 0(사방이막힘), 1(길하나), 2(오는길 가는길)
 *  7-2. 3
 *  7-3. case 시뮬레이션을 머릿속으로 돌려보니 해당 문제에서는 의미없는 접근이다.
 *  
 *  8. 자자 한번 왔던길은 시간을 +1 하고, 지나갔던 길은 막힌 벽으로 바뀌는 셈이다.
 *  
 *  9. 아하 끄트머리 분기에서 길이가 긴 선분을 선택하면 되겠구나
 *  
 *  10. 꼭지 지점은 3면이 벽으로 둘러쌓인 좌표다.
 *  
 *  11. 꼭지점 사이를 막는 벽의 선분이 있는 경우 
 *  11-1. 공간의 바깥과, 벽으로 공간의 영역이 나뉠수도 있을 것 같다.\
 *  11-2. 특정 도형의..
 *  
 *  12. 스타트지점은 꼭지점이다.
 *  13. 꼭지점은 이동가능경로가 하나이기 때문에, 다음경로로 이동을 해주고, 
 *  13-1. 꼭지점은 벽으로 바꾼다.
 *  13-2. 이동한 경로의 숫자를 1씩 더해준다.
 */
public class Q2589_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int Y = Integer.parseInt(stk.nextToken());
		int X = Integer.parseInt(stk.nextToken());
		
		int[][] map = new int[Y][X];
		for (int i = 0; i < Y; i++) {
			StringTokenizer stk2 = new StringTokenizer(br.readLine());
			String s = stk2.nextToken();
			for (int j = 0; j < X; j++) {
				char c = s.charAt(j);
				int result = 0;
				if(c == 'L') result = 1;
				map[i][j] =  result;
			}
		}
		
		// 꼭지점 구하기.
		List<int[]> edges = new ArrayList<int[]>();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				int[] test= canMove(j, i, X-1, Y-1, map);
				int[] arr = {i, j};
				if(test[4] == 1) edges.add(arr);
			}
		}
		
		for (int[] is : edges) {
			int y = is[0];
			int x = is[1];
			
			/*
			 *  0: 상, 1: 하, 2: 좌, 3: 우
			 */
			while(true) {

				
				  for (int i = 0; i < map.length; i++) {
					  for (int j = 0; j < map[i].length;j++) { 
						  System.out.print(map[i][j]); 
					  } 
					  System.out.println(); 
				  }
				  System.out.println();
				 
				
				int[] test = canMove(x, y, X-1, Y-1, map);
				if(test[4] == 1) {
					int moveP = 0;
					for (int z = 0; z < test.length; z++) {
						if(test[z] == 1) {
							moveP = z;
							break;
						}
					}
					
					int preNum = map[y][x]; 
					map[y][x] = 0;
					
					switch (moveP) {
					case 0:
						y--;
						break;
					case 1:
						y++;
						break;
					case 2:
						x--;
						break;
					case 3: 
						x++;
						break;
					default:
						break;
					}
					
					is[0] = y; 
					is[1] = x;
					
					if(map[y][x] > preNum+1) {
						
					}else {
						map[y][x] += preNum;
					}
				} else {
					break;
				}
				
			}
			
		}
		
		// 새 꼭지점 구하기.
		List<int[]> newEdges = new ArrayList<int[]>();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				int[] arr = {i, j};
				if(map[i][j] > 1) newEdges.add(arr);
			}
		}
		
		int[][] newMap = new int[Y][X];
		for (int i = 0; i < newMap.length; i++) {
			for (int j = 0; j < newMap[i].length; j++) {
				newMap[i][j] = 0;
			}
		}
		for (int[] is : newEdges) {
			int y = is[0];
			int x = is[1];
			
			newMap[y][x] = map[y][x];
		}
		
		System.out.println(newMap);
		/*
		 * if(test[4] > 1) { map[y][x]--; int preNum = map[y][x]; int[] test2 =
		 * canMove(x, y, X-1, Y-1, map); List<Integer> sam = new ArrayList<Integer>();
		 * for (int i = 0; i < 4; i++) { if(test2[i] == 1) { switch(i) { case 0:
		 * sam.add(map[y-1][x]); break; case 1: sam.add(map[y+1][x]); break; case 2:
		 * sam.add(map[y][x-1]); break; case 3: sam.add(map[y][x+1]); break; default: }
		 * } } Collections.sort(sam); for (int num : sam) { System.out.print(num+ " ");
		 * } System.out.println(); }
		 */
		
	}
	
	static int[] canMove(int x, int y, int maxX, int maxY, int[][] map) {
		// result 는 상하좌우 + 분기의 개수 순서
		int[] result = {0, 0, 0, 0, 0};
		if(map[y][x] == 0) {
			return result;
		}
		
		int interSection = 0;
		if(x == 0 || map[y][x-1] == 0) {
		}else {
			result[2] = 1;
			interSection++;
		}
		if(x == maxX || map[y][x+1] == 0) {
		}else {
			result[3] = 1;
			interSection++;
		}
		if(y == 0 || map[y-1][x] == 0) {
		}else {
			result[0] = 1;
			interSection++;
		}
		if(y == maxY || map[y+1][x] == 0) {
		}else {
			result[1] = 1;
			interSection++;
		}
		result[4] = interSection;
		
		return result;
	}
	
}
