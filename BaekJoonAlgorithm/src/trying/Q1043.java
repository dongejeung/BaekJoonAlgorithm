package trying;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class Q1043 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		StringTokenizer stk2 = new StringTokenizer(br.readLine());
		
		stk2.nextToken();
		List<Integer> truthPeople = new ArrayList<Integer>();
		while(stk2.hasMoreElements()) {
			truthPeople.add((Integer.parseInt(stk2.nextToken())));
		}
		
		// 구라칠 수 있는 횟수.
		int ans = 0;
		// 파티의 수
		List<List<Integer>> partyTonight = new ArrayList<List<Integer>>();
		for (int i = 0; i < M; i++) {
			StringTokenizer stk3 = new StringTokenizer(br.readLine());
			
			stk3.nextToken();
			List<Integer> party = new ArrayList<Integer>();
			List<Integer> partyPeople = new ArrayList<Integer>();
			while(stk3.hasMoreTokens()) {
				int num = Integer.parseInt(stk3.nextToken());
				party.add(num);
				partyPeople.add(num);
			}
			
			partyTonight.add(party);
			
			boolean truthInParty = false;
			for (Integer person : partyPeople) {
				if(truthPeople.contains(person)) {
					truthInParty = true;
				}
			}
			
			if(truthInParty) {
				for (Integer person : partyPeople) {
					if(!truthPeople.contains(person)) {
						truthPeople.add(person);
					}
				}
			}
			
		}
		
		for (List<Integer> p : partyTonight) {
			boolean heyMaMa = true;
			
			for (Integer a : p) {
				if(truthPeople.contains(a)) heyMaMa = false;
			}
			
			if(heyMaMa) ans++;
		}
		
		if(N == 1) ans = 0;
		if(truthPeople.isEmpty()) ans = M;
		
		bw.write(Integer.toString(ans));
		
		br.close();
		bw.flush();
		bw.close();
	}
}
