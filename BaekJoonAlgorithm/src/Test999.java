
public class Test999 {
	public static void main(String[] args) {
		System.out.println(factorial(7));
	}
	
	public static int factorial(int N) {
		if(N == 2) return 1;
		return N * factorial(N-1);
	}
	
}
