package Shailesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findmissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a = { 1, 2, 3, 3, 5 };

		List<Integer> b = Arrays.asList(a);

		List<Integer> c = new ArrayList<Integer>(b);

		Collections.sort(c);

		int small = c.get(0);

		int large = c.get(c.size() - 1);

		List<Integer> io = new ArrayList<>();

		for (int i = small; i <= large; i++) {

			io.add(i);
		}

		for (int j = 0; j <= c.size() - 1; j++) {
			if (c.get(j) != io.get(j)) {

				System.out.println("This is an missing number" + " " + io.get(j));
				break;
			}

		}

	}

}
