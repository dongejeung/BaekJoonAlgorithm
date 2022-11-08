import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.addAll(Arrays.asList(0, 1, 2, 3));
		for (Integer init : l) {
//			Trip t = new Trip(l, init);
		}
		
	}
	
	static class Trip {
		private List<Integer> route;
		Trip(List<Integer> route, int dep) {
			if(route.size() == 0) return;
			for (Integer r : route) {
				dep = r;
				List<Integer> route2 = new LinkedList<Integer>();
				route2.addAll(route);
				
				route2.remove(r);
				System.out.println(route2);
				new Trip(route2, dep);
			}
		}
	}
	
}
	