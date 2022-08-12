package problem.code.plus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * 	조건들을 브래인스토밍 해서 적어놓는 버릇 들이면 괜찮을 듯
 * 
 * 	- P1 / T1 = 특정 상담의 일평균 수입
 * 
 *  - 모든 경우의 수를 다 수행해볼 수도 있고,
 *  
 *  - 특정 패턴을 만족하는 경우만 수행해볼 수도 있을 듯
 *  
 *  - 좌표평면에 x, y 축을 생각해볼 수도 있을 듯 (가로 시간(일) 세로 수입) => 기하적으로 보면 면적으로 치환해서 겹치지 않는 최대 면적을 찾아 볼 수도 있겠다. 
 *  ==>> 가로축 상에서 시간은 서로 간섭을 할 수 없기 때문에 가로축 상에서 0일 부터의 x축 거리와 평균 수입을 계산해볼 수 있겠다.
 *  
 *  샘플 예제를 보면 
 *  T1 : 1 - 3 / 3.3333
 *  T2 : 2 - 6 / 4
 *  T3 : 3 / 10 
 *  
 *  프로그래밍은 수학하고는 다르게 한계적으로 합리적으로 구상 시간과 연산 횟수를 줄이는 것의 절충안을 구하는 게 유리할 경우가 많다.
 *  
 *  1. 겹치지 않는 모든 상담일정의 조합의 경우를 구한다.
 *  2. 1에서 구한 조합의 수입을 계산해 최대값을 계산한다.
 *  
 *  이런 식으로 연산하면 생각보다 간단하게 구현할 수 있다.
 *  (제한 조건이 없는 한)
 *  
 */
public class Q14501 {
	public static int max_profit = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		Cs[] cs_arr = Cs.prepare_counsel_list(N, br);
		nextNode(0, 0, cs_arr);
		
		bw.write(Integer.toString(max_profit));
		
		bw.flush();
		br.close();
		bw.close();
	
	}
	
	public static void nextNode(int s_day, int t_profit, Cs[] csl){
		int scd = csl.length-1;
		if(s_day > scd) {
			return;
		}
		
		// Case1 : 상담을 하지 않고 다음날로 넘어감.
		int s_day1 = s_day;
		if(s_day1+1 <= scd) {
			s_day1 += 1;
			nextNode(s_day1, t_profit, csl);
		}

		// Case2 : 상담을 진행.
		int s_day2 = s_day;
		int e_day = csl[s_day].end_day; 
		if(e_day <= scd) {
			int profit = csl[s_day].profit; 
			t_profit += profit;
			if(t_profit >= max_profit) {
				max_profit = t_profit;
			}			
			nextNode(e_day+1, t_profit, csl);
		}
	}
	
}

class Cs {
	int start_day;
	int end_day;
	int profit;
	static int days;
	
	public Cs(int start_day) {
		this.start_day = start_day;
	}
	
	public Cs(int start_day, int end_day, int profit) {
		this.start_day = start_day;
		this.profit += profit;
	}
	
	public static void set_end_day(Cs cs, int end_day) {
		cs.end_day = end_day;
	}
	
	public static void set_profit(Cs cs, int profit) {
		cs.profit = profit;
	}
	
	public static Cs[] prepare_counsel_list(int N, BufferedReader br) throws IOException{
		Cs[] csArr = new Cs[N];
		for (int i = 0; i < csArr.length; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int Tn = Integer.parseInt(stk.nextToken());
			int Pn = Integer.parseInt(stk.nextToken());
			csArr[i] = new Cs(i);
			
			set_end_day(csArr[i], i+Tn-1);
			set_profit(csArr[i], Pn);
		}
		
		days = csArr.length;
		
		return csArr;
	}
	
}
