package Shailesh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class hjh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "geeksforgeeks";
		List<String> act = new ArrayList<String>();
		String resultant = "";

		for (int i = 0; i <= s.length() - 1; i++) {

			act.add(Character.toString(s.charAt(i)));

		}
		Set<String> j_k = new HashSet<String>(act);
		List<String> actm = new ArrayList<String>(j_k);

		for (int i = 0; i <= actm.size() - 1; i++) {

			int count = 0;

			String m = actm.get(i);

			for (int j = 0; j <= act.size() - 1; j++) {

				if (act.get(j).equals(actm.get(i))) {

					count++;

				}

			}

			if (count != 1) {

				s = s.replace(actm.get(i), "?");

			}

		}
		
		System.out.println(s);

		for (int i = 0; i <= act.size() - 1; i++) {

			if (!Character.toString(s.charAt(i)).equals("?")) {

				resultant = resultant + s.charAt(i);

			}

		}
		
		System.out.println(resultant);

	}

}
