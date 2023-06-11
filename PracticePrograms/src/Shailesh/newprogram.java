package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class newprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int limit1 = 2;
		int limit2 = 5;
		List<Integer> x = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] > limit1 && a[i] < limit2) {
				x.add(a[i]);
			}

			
		}
		
		for (int j = 0; j <= x.size() - 1; j++) {
			sum = sum + x.get(j);

		}

		System.out.println(sum);

	}

}
