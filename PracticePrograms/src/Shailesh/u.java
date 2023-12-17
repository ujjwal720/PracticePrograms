package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class u {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 
		 * Alternate positive and negative number
		 */

		int[] a = { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
		List<Integer> o = new ArrayList<Integer>();
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		int length = 0;

		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] >= 0) {

				o.add(a[i]);

			}

			else {

				l.add(a[i]);

			}

		}

		if (o.size() >= l.size()) {

			length = o.size();

		}

		else {

			length = l.size();

		}

		for (int i = 0; i <= length - 1; i++) {

			try {

				result.add(o.get(i));
				result.add(l.get(i));

			}

			catch (Exception e) {

			}

		}

		System.out.println(result);

	}

}
