package Practice;

import java.util.ArrayList;
import java.util.List;

public class substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Ujjwal";
		/*
		 * U Uj Ujj Ujjw ujjwal jjwal jwal
		 */
		List<List<Integer>> rm = new ArrayList<>();
		for (int i = 0; i <= s.length() - 1; i++) {

			for (int j = i; j <= s.length() - 1; j++) {
				String h = "";
				for (int k = i; k <= j; k++) {
					h = h + s.charAt(k);
				}
				System.out.println(h);
			}
		}

	}

}
