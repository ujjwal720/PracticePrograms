package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class yt45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> outerList = new ArrayList<>();
		Integer[] r_m = { 1, 1, 1, 2, 1 };
		for (int i = 0; i <= r_m.length - 1; i++) {
			

			for (int j = i; j <= r_m.length - 1; j++) {

				List<Integer> u_m = new ArrayList<Integer>();

				for (int k = i; k <= j; k++) {

					u_m.add(r_m[k]);

				}

				outerList.add(u_m);

			}
			
			

		}
		
		System.out.println(outerList);

	}

}
