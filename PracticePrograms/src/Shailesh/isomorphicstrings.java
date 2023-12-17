package Shailesh;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class isomorphicstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * isomorphoc string
		 * 
		 * eggag aggda !! !
		 */

		String s = "paper";
		String l = "title";
		String resultant = "";

		List<String> m = new ArrayList<String>();

		for (int i = 0; i <= s.length() - 1; i++) {

			m.add(Character.toString(s.charAt(i)));

		}

		Set<String> ml = new LinkedHashSet<String>(m);
		List<String> mk = new ArrayList<String>(ml);
		int target1 = 0;
		int target2 = 0;

		for (int i = 0; i <= ml.size() - 1; i++) {

			int countz = 1;

			int count = 0;

			for (int j = 0; j <= m.size() - 1; j++) {

				if (mk.get(i).equals(m.get(j))) {

					count++;

					if (count > 1) {

						target1++;

						String o = "?" + countz;

						m.set(j, o);

						countz++;

					}

				}

			}

		}

		List<String> second = new ArrayList<String>();
		for (int i = 0; i <= s.length() - 1; i++) {

			second.add(Character.toString(l.charAt(i)));

		}

		Set<String> second1 = new LinkedHashSet<String>(second);
		List<String> second2 = new ArrayList<String>(second1);

		for (int i = 0; i <= second2.size() - 1; i++) {

			int count = 0;
			int countz = 1;

			for (int j = 0; j <= second.size() - 1; j++) {

				if (second2.get(i).equals(second.get(j))) {

					count++;

					if (count > 1) {
						target2++;

						String o = "?" + countz;

						second.set(j, o);

						countz++;

					}

				}

			}

		}

		

		int resultant1 = 0;

		for (int i = 0; i <= second.size() - 1; i++) {

			if (second.get(i).equals(m.get(i))) {

				resultant1++;

			}

		}

		if (resultant1 != target1) {
			
			System.out.println("Floowing is not ismorphic");

		}
		
		System.out.println("Floowing is ismorphic");

	}

}
