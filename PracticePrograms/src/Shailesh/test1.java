package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * merge two sorted arrays
		 */

		Integer[] a = { 1, 2, 3 };
		Integer[] b = { 1, 2, 3, 4 };

		List<Integer> d = new ArrayList<Integer>();

		for (int i = 0; i <= a.length - 1; i++) {

			d.add(a[i]);

		}

		for (int k = 0; k <= b.length - 1; k++) {

			d.add(b[k]);

		}System.out.println(d);
		
		

	}

}
