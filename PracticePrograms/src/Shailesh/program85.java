package Shailesh;

public class program85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Anshuman number
		 */
		int v = 0;
		int x = 50;
		String l = "";
		String m = "";

		if (x % 5 == 0) {

			v = x / 5;

		} else {

			System.out.println("It is not anshuman number");

		}

		for (int i = 1; i <= v; i++) {

			String k = "5+";

			l = l + k;
		}

		for (int j = 0; j <= l.length() - 2; j++) {

			m = m + l.charAt(j);
		}

		System.out.println(m);

	}

}
