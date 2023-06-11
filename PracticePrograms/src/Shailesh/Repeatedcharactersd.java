package Shailesh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Repeatedcharactersd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int start=1;
       int end=500;
		List<Integer> x = new ArrayList<Integer>();

		for (int i = start; i <= end; i++) {
			x.add(i);
		}

		for (int j = 0; j <= x.size() - 1; j++) {

			String s = Integer.toString(x.get(j));
			char[] t = s.toCharArray();
			List<Character> z = new ArrayList<Character>();

			for (int k = 0; k<=t.length - 1; k++) {
                  
				z.add(t[k]);
			}
			
			Set<Character> f=new HashSet<Character>(z);
			
			if(f.size()<z.size()) {
				System.out.println(x.get(j));
			}

		}

	}

}
