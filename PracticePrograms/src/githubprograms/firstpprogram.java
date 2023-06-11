package githubprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class firstpprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String l = "";
		String s = "AAABBBC";
		String[] j = s.split("");
		List<String> e = new ArrayList<String>();
		for (int i = 0; i <= j.length - 1; i++) {
			e.add(j[i]);

		}
		Set<String> m = new HashSet<String>(e);
		List<String> p = new ArrayList<String>(m);

		for (int k = 0; k <= p.size() - 1; k++) {
			int count = 0;
			for (int l1 = 0; l1 <= e.size() - 1; l1++) {
				if (p.get(k).equals(e.get(l1))) {
					count++;
				}
			}

			String c = Integer.toString(count);
			String z = p.get(k) + c;
			l = l + z;

		}

		System.out.println(l);

	}

}
