package githubprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class countdistinctelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 1, 2, 5, 9 };
		List<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i <= a.length - 1; i++) {
			b.add(a[i]);
		}

		Set<Integer> u = new HashSet<Integer>(b);
		List<Integer> z = new ArrayList<Integer>(u);

		for (int i = 0; i <= z.size() - 1; i++) {
			int count = 0;

			for (int j = 0; j <= b.size() - 1; j++) {

				if (z.get(i) == b.get(j)) {

					count++;

				}

			}

			if (count == 1) {
				
				System.out.println(z.get(i));

			}

		}

	}

}
