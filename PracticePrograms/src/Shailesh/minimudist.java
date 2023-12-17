package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class minimudist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a_i = { "geeks", "for", "geeks", "contribute", "practice" };
		String a_1 = "geeks";
		String a_2 = "practice";
		int diff = 0;
		int count = 0;
		List<Integer> op = new ArrayList<Integer>();
		for (int i = 0; i <= a_i.length - 1; i++) {

			if (a_i[i].equals(a_1)) {
				count++;

			}
			if (a_i[i].equals(a_2)) {

			}

		}

		if (count == 2) {

			int diffm = op.get(op.size() - 1) - op.get(0);
			System.out.println(diffm);

		}

	}

}
