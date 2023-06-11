package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class decipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "72olle";
		String k = "";
		String result = "";
		for (int i = 0; i <= s.length() - 1; i++) {

			if (Character.isDigit(s.charAt(i))) {
				k = k + s.charAt(i);
			}

		}

		int albhabet = Integer.parseInt(k);

		char c = (char) albhabet;

		result = result + c;

		for (int j = 0; j <= s.length() - 1; j++) {

			if (Character.isLetter(s.charAt(j))) {

				result = result + s.charAt(j);
			}

		}

		char first = result.charAt(1);
		char last = result.charAt(result.length() - 1);

		List<Character> m = new ArrayList<Character>();

		for (int i = 0; i <= result.length() - 1; i++) {

			m.add(result.charAt(i));

		}

		m.set(1, last);
		m.set(m.size() - 1, first);

		System.out.println(m);

		String reult = "";

		for (int l = 0; l <= m.size() - 1; l++) {

			reult = reult + m.get(l);

		}

		System.out.println(reult);

	}

}
