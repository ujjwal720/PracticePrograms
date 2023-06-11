package abstractclass;

import java.util.ArrayList;
import java.util.List;

public class logical2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Keeping the special characters in the same place
		 * 
		 */

		String s = "Wel@come";
		int x = 0;
		char[] k = s.toCharArray();
		int y = 0;

		List<Character> m = new ArrayList<Character>();
		List<Character> chars = new ArrayList<Character>();

		for (int i = 0; i <= k.length - 1; i++) {

			if (!Character.isLetter(k[i])) {

				m.add(k[i]);

			} else {

				chars.add(k[i]);
			}
		}

		String output = "";

		y = chars.size() - 1;

		for (int j = 0; j <= k.length - 1; j++) {

			if (Character.isLetter(k[j])) {

				output = output + chars.get(y);
				y--;

			}

			else {

				output = output + m.get(x);

				x++;

			}

		

		}

		System.out.println(output);

	}

}
