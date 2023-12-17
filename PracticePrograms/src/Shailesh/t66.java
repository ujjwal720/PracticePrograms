package Shailesh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class t66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "";

		List<Character> hl = new ArrayList<Character>();
		List<Character> l = new ArrayList<Character>();
		for (int i = 0; i <= s.length() - 1; i++) {

			l.add(s.charAt(i));

		}

		Set<Character> io = new LinkedHashSet<Character>(l);
		List<Character> opl = new ArrayList<Character>(io);

		for (int i = 0; i <= opl.size() - 1; i++) {
			String resultant = "";
			char t = opl.get(i);

			int count = 0;

			for (int j = 0; j <= l.size() - 1; j++) {

				if (opl.get(i) == l.get(j)) {

					count++;

					if (count == 1) {

						hl.add(j, opl.get(i));

					}

					else {

						for (int k = 0; k < count; k++) {
							
							int m=j+k;

							hl.add(j + k, opl.get(i));

						}

					}

				}

				else {

					hl.add('?');

				}

			}
			
		

		}
		
		System.out.println(hl);
		
		

	}

}
