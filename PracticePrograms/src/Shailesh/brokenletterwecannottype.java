package Shailesh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class brokenletterwecannottype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> o = new ArrayList<Integer>();
		o.add(1);
		o.add(1);
		o.add(2);
		o.add(3);
		o.add(7);
		o.add(2);
		o.add(3);
		o.add(3);
		

		Map<Integer, Integer> l = new HashMap<Integer, Integer>();
		

        
		for (int i = 0; i <= o.size() - 1; i++) {
			
			

			if (l.containsKey(o.get(i))) {
				
				l.put(o.get(i),o.get(i)+1);
				
				

			}
			
			else {
				
				l.put(o.get(i), 1);
			}

		}
		
		System.out.println(l);

	}

}
