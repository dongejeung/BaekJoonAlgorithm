package problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 	직각삼각형의 기울기를 봐야할 듯.
 * 	
 * 	1. 건물과 건물 사이의 길이가 밑변.
 * 	2. 건물 높이와 건물 높이 위상차가 높이.
 * 	3. 6 6 3 5 7 같은 케이스에서 6 6 은 걸릴지 안걸릴지 헷갈리는 데 모르겠네..
 * 	(사실 신경 안써도 될 것 같기도 하다.)
 * 
 * 	4. 기준점을 기준으로 본인보다 낮은 건물의 연속 개수를 구하면 될 듯.
 * 	5. 기준건물 이상의 높이인 건물이 있으면 그 사이가 거리임.
 * 	
 * 	
 */
public class Q1027 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		
		int[] buildings = new int[N];
		StringTokenizer stk2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < buildings.length; i++) {
			buildings[i] = Integer.parseInt(stk2.nextToken());
		}

		
		
	}
	
}
