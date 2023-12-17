package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] u = { 1, 2, 4, 1 };
		a2 a = new a2();
		a.lm(u);

	}

	public void lm(int[] a) {

		List<Integer> l_m = new ArrayList<Integer>();
		int x = 0;
		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] == 4) {

				x = i;
				break;

			}

		}

		if (x != 0) {

			for (int i = 0; i <= x - 1; i++) {

				l_m.add(a[i]);

			}

		}

		else {

			System.out.println("It do not have any four for sure");

		}
		
		System.out.println(l_m);

	}

}
