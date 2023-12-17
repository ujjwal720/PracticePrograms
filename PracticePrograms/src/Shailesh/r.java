package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * first negative integer
		 */

		List<Integer> r_m = new ArrayList<Integer>();
		int[] t_y = { -8, 2, 3, -6, 10 };
		int target = 2;
		for (int i = 0; i <= t_y.length - 1 - 1; i++) {

			int count = 0;

			List<Integer> l = new ArrayList<Integer>();

			for (int j = i; j <= t_y.length - 1; j++) {

				if (count == 2) {
					
					break;

				}
				
				count++;
				
				l.add(t_y[j]);
				
				

			}
			
			System.out.println(l);

		}

	}

}
