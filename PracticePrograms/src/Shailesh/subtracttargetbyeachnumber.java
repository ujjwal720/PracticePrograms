package Shailesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class subtracttargetbyeachnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 6, 12 };
		int target = 5;
		List<Integer> x = new ArrayList<Integer>();

		for (int i = 0; i <= a.length - 1; i++) {

			int m = target - a[i];

			x.add(Math.abs(m));

		}

		List<Integer> c = new ArrayList<Integer>(x);
		List<Integer> nearest = new ArrayList<Integer>();
		Collections.sort(c);
		int min = c.get(0);
		for (int j = 0; j <= x.size() - 1; j++) {
			if (min == x.get(j)) {
				nearest.add(a[j]);

			}
		}
		
		System.out.println(nearest);
		

	}

}
