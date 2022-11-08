import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Tester2 {
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.addAll(Arrays.asList(0, 1, 2, 3));
		
		Trip t = new Trip(l);
		for (int i = 0; i < l.size(); i++) {
			t.trip(i, l);
		}
		
	}
	
	
	static class Trip {
		private int dep;
		private int dest;
		private static List<Integer> t;
		
		Trip() {
		}
		Trip(List<Integer> l) {
			this.t = l;
		}
		
		static List<Integer> aa(List<Integer> l, int d) {
			List<Integer> ll = new LinkedList<Integer>();
			ll.addAll(l);
			ll.remove(ll.indexOf(d));
			return ll;
		}
		
		public static void trip(int dep, List<Integer> route) {
			if(route.size() == 1) {
				System.out.println(route);
				return;
			}
			List<Integer> l = new LinkedList<Integer>();
			l.addAll(route);
			for (Integer integer : route) {
				l.remove(l.indexOf(integer));
				Trip t = new Trip();
				t.trip(integer, l);
			}
			
			
		}
		
	}
	
}
	