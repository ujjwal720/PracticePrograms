package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class program897 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Split the array
		 */

		int[] x = { 11, 12, 13, 14, 15, 16 };

		List<Integer> ui = new ArrayList<Integer>();

		int sum = 0;

		for (int i = 0; i <= x.length - 1; i++) {

			String[] k = Integer.toString(x[i]).split("");

			for (int j = 0; j <= k.length - 1; j++) {

				int c_d = Integer.parseInt(k[j]);

				ui.add(c_d);

			}

		}

		for (int k = 0; k <= ui.size() - 1; k++) {

			sum = sum + ui.get(k);

		}
		
		System.out.println(sum);

	}

}
