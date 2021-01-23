package problem.study;

public class programmersJimgumbridge {

	public static void main(String[] args) {
		
	}
	
    public static int solution(int[] stones, int k) {
        int answer = 0;
        while(true) {
            int zeroCnt = 0;
            for(int i = 0; i < stones.length; i++) {
                if(stones[i] != 0) stones[i] -= 1;
                for(int j = 0; j < (stones.length - k + 1); j++) {
                    
                }
            }
            if(zeroCnt == k) break;
        }
        return answer;
    }
    
}
