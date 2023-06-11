package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class singlenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] n = { 1, 2, 2, 3, 3, 1, 4 };
		List<Integer> p = Arrays.asList(n);
		int x=0;
		Set<Integer> b = new HashSet<Integer>(p);
		for (int i = 0; i <= b.size() - 1; i++) {
			int count = 0;
			for (int j = 0; j <= p.size() - 1; j++) {
				if (b.contains(p.get(j))) {
					count++;
					x=p.get(j);
					
				}
			}
			
			if(count==1) {
				System.out.println(x);
				break;
			}
			
			
		}
	

	}

}
