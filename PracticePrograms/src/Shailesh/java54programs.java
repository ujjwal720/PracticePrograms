package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class java54programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Reverse vowels of string
		 */

		String s = "hello";

		List<Character> ch_t = new ArrayList<Character>();
		String result = "";

		for (int i = 0; i <= s.length() - 1; i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {

				ch_t.add(s.charAt(i));

			}

		}

		int count = ch_t.size() - 1;

		for (int j = 0; j <= s.length() - 1; j++) {

			if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o'
					|| s.charAt(j) == 'u') {

				result = result + ch_t.get(count);

				count--;

			}

			else {

				result = result + s.charAt(j);

			}

		}

		System.out.println(result);

	}

}
