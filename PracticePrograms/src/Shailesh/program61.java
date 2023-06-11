package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class program61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abc2d324d5x";
		int x = 0;
		String ints = "";
		int sum = 0;
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i <= s.length() - 1; i++) {

			if (Character.isDigit(s.charAt(i))) {

				ints = ints + s.charAt(i);

			}

			else {
				if (!ints.isEmpty()) {
					x = Integer.parseInt(ints);
					res.add(x);
					x = 0;
					ints = "";
				}

			}

		}

		if (Character.isDigit(s.charAt(s.length() - 1))) {
			x = Integer.parseInt(ints);
			res.add(x);
			x = 0;
			
		}
		System.out.println(res);

	}

}
