package Shailesh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class seprateoddplaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabc";
		char[] comp = s.toCharArray();
		List<Character> u = new ArrayList<Character>();
		String result = "";

		for (int i = 0; i <= comp.length - 1; i++) {

			u.add(comp[i]);

		}

		Set<Character> io = new HashSet<Character>(u);
		List<Character> l = new ArrayList<Character>(io);

		for (int j = 0; j <= io.size() - 1; j++) {

			int count = 0;
			String rem = "";

			for (int k = 0; k <= u.size() - 1; k++) {

				if (l.get(j) == u.get(k)) {

					count++;

				}

				else {

					

				}

			}

			String i = l.get(j).toString();
			String c = Integer.toString(count);
			rem = i + c;
			result = result + rem;

		}
		
		System.out.println(result);

	}

}
