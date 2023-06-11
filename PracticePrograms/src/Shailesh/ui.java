package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class ui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = { "cat", "bt", "hat", "tree" };

		int resuu = 0;

		String resulatant = "atach";

		char[] result2 = resulatant.toCharArray();

		List<String> lm = new ArrayList<String>();

		for (int i = 0; i <= s.length - 1; i++) {

			List<Character> op = new ArrayList<Character>();

			int count = 0;

			String res = s[i];

			int leu = res.length();

			for (int j = 0; j <= res.length() - 1; j++) {

				for (int k = 0; k <= result2.length - 1; k++) {

					char u = res.charAt(j);
					char p = result2[k];

					if (res.charAt(j) == result2[k]) {

						op.add(result2[k]);

						count++;

					}

				}

			}

			if (count == leu) {

				for (int m = 0; m <= op.size() - 1; m++) {

					for (int n = 0; n <= result2.length - 1; n++) {

						char q = op.get(m);
						char h = result2[n];

						if (op.get(m) == result2[n]) {

							resuu++;

						}

					}

				}

				if (resuu == res.length()) {

					lm.add(res);

				}

			}

		}

	}

}
