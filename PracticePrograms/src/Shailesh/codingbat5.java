package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class codingbat5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Shuffle the array program
		 */

		int[] k = { 1, 2, 3, 4, 4, 3, 2, 1 };
		int len = k.length / 2;
		List<Integer> a = new ArrayList<Integer>();
		int count = 0;
		int count1 = (len - 1) + 1;
		for (int i = 1; i <= len; i++) {

			a.add(k[count]);
			a.add(k[count1]);
			count++;
			count1++;

		}

		System.out.println(a);

	}

}
