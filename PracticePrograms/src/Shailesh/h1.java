package Shailesh;

public class h1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * swap by only one time
		 */

		String s = "geeks";
		String s2 = "keegs";
		int count = 0;
		String result1 = "";
		String result2 = "";
		String res1 = "";
		String res2 = "";
		for (int i = 0; i <= s.length() - 1; i++) {

			if (s.charAt(i) != s2.charAt(i)) {

				result1 = result1 + s.charAt(i);
				result2 = result2 + s2.charAt(i);

			}

		}

		if (result1.length() == 2 || result2.length() == 2) {

			StringBuilder u = new StringBuilder(result1);
			StringBuilder m = new StringBuilder(result2);
			res1 = u.reverse().toString();
			res2 = m.toString();

		}

		if (res1.equals(res2)) {

			System.out.println("The following is meta string");

		}

		else {
			
			System.out.println("The following is not an meta string");

		}

	}

}
