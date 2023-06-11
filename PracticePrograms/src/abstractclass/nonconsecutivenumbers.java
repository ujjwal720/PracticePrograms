package abstractclass;

import java.util.ArrayList;
import java.util.List;

public class nonconsecutivenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 6, 7, 8, 15, 16 };
		List<Integer> c = new ArrayList<Integer>();

		for (int i = 0; i < a.length - 1; i++) {

			int x = a[i];
			int z = a[i + 1];
			int next = a[i] + 1;

			if (z != next) {
				
				c.add(a[i+1]);

			}

		}
		
		System.out.println(c);
	}

}
