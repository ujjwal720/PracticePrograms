package Shailesh;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class tgg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * remove common characters and concat
		 */

		String s = "aacdb";

		String s2 = "gafd";

		List<Character> l = new ArrayList<Character>();

		for (int i = 0; i <= s.length() - 1; i++) {

			l.add(s.charAt(i));

		}

		for (int i = 0; i <= s.length() - 1; i++) {

			l.add(s2.charAt(i));

		}

		Set<Character> opl = new LinkedHashSet<Character>(l);
		List<Character> oiu = new ArrayList<Character>(opl);
		List<Character> result = new ArrayList<Character>();

		for (int i = 0; i <= oiu.size() - 1; i++) {

			int count = 0;

			for (int j = 0; j <= l.size() - 1; j++) {

			}

		}

	}

}
