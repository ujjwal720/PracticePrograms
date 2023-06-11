package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class javaprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Number which are present in first array
		 */

		List<Integer> u = new ArrayList<Integer>();

		u.add(5);

		int[] x = { 1, 2, 3, 4, 6 };
		int[] z = { 5, 1, 2, 10, 3, 5 };

		for (int i = 0; i <= x.length - 1; i++) {

			for (int j = 0; j <= z.length - 1; j++) {

				if (x[i] == z[j]) {

					x[i] = -1;
				}

			}

			

		}
		
		
		for (int k = 0; k <= x.length - 1; k++) {

			if (x[k] != -1) {
				
				System.out.println(x[k] + "is not present in array 2");

			}
		}

	}

}
