package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class codingprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4 };
		List<Integer> j = new ArrayList<Integer>();
		/*
		 * o/p-2,4,6.8,5
		 */
		int max = 0;
		int min = 0;
		if (a.length < b.length) {
			max = a.length - 1;
			min = a.length - 1;

		}

		else {
			max = a.length - 1;
			min = b.length - 1;
		}

		for (int i = 0; i <= max; i++) {

			j.add(a[i] + b[i]);

		}

		if (a.length != b.length) {
            
			
			j.add()
		}

	}

}
