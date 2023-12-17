package Shailesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ewq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * first element to apper k times
		 */

		int[] l = {1, 7, 4, 3, 4, 8, 7};
		int n = 7;
		int m = 2;
		int max = 0;
		List<Integer> op = new ArrayList<Integer>();
		List<Integer> v = new ArrayList<Integer>();


		for (int i = 0; i <= l.length - 1; i++) {

			op.add(l[i]);

		}
		int flag = 0;
		Set<Integer> up = new LinkedHashSet<Integer>(op);

		List<Integer> opm = new ArrayList<Integer>(up);

		for (int i = 0; i <= opm.size() - 1; i++) {
		
			int count = 0;

			for (int j = 0; j <= op.size() - 1; j++) {

				if (opm.get(i) == op.get(j)) {

					count++;

				}

				if (count == 2) {

					v.add(j);

				}

			}

			

		}
		
		Collections.sort(v);
		int mp=v.get(0);
		System.out.println(l[mp]);
		
		

	}

}