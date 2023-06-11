package Shailesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class codin12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Automation
		 */

		String[] i_o = { "Mary", "John", "Emma" };
		int[] heights = { 180, 165, 170 };
		List<Integer> ui = new ArrayList<Integer>();
		List<Integer> uo = new ArrayList<Integer>();
		List<String> uom = new ArrayList<String>();
		for (int i = 0; i <= heights.length - 1; i++) {

			ui.add(heights[i]);
			uo.add(heights[i]);

		}

		Collections.sort(uo);

		for (int j = uo.size() - 1; j >= 0; j--) {

			int l = uo.get(j);

			for (int k = 0; k <= ui.size() - 1; k++) {

				if (l == ui.get(k)) {
					
					uom.add(i_o[k]);

				}

			}

		}
		
		System.out.println(uom);

	}

}
