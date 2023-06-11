package githubprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class javapractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 23, 45, 789 };
		System.out.println(a.length);

		List<Integer> c = new ArrayList<Integer>();

		for (int i = 0; i <= a.length - 1; i++) {

			String s = Integer.toString(a[i]);

			for (int j = 0; j <= s.length() - 1; j++) {

				int k = Integer.parseInt(Character.toString(s.charAt(j)));

				c.add(k);

			}
		}

		
		Collections.sort(c);

		String l = "";

		for (int k = 0; k <= c.size() - 1; k++) {

			l = l + Integer.toString(c.get(k));

		}

		System.out.println(l);

	}

}
