package Shailesh;

public class fdn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * check number of digit count and value
		 */

		String s = "030";
		String[] lm = s.split("");
		boolean a = false;
		int result = 0;
		for (int i = 0; i <= s.length() - 1; i++) {

			String o = Integer.toString(i);

			int count1 = 0;

			for (int j = 0; j <= s.length() - 1; j++) {

				int count = Integer.parseInt(lm[i]);

				if (lm[j].equals(o)) {

					result++;

				}

			}

		}

		if (result == s.length()) {

			a = true;

		}

		else {

			a = false;

		}

		System.out.println(a);

	}

}
