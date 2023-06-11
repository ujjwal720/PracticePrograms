package githubprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class javaprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number to check");
		Scanner s = new Scanner(System.in);

		int xm = s.nextInt();
		int result = xm + xm;
		String result2 = Integer.toString(xm);
		String result3 = Integer.toString(result);
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();
		if (result2.length() == result3.length()) {

			for (int i = 0; i <= result2.length() - 1; i++) {

				String l = Character.toString(result2.charAt(i));

				int t = Integer.parseInt(l);

				x.add(t);
			}

			for (int j = 0; j <= result3.length() - 1; j++) {

				String lm = Character.toString(result3.charAt(j));

				int tm = Integer.parseInt(lm);

				y.add(tm);
			}

			Collections.sort(x);
			Collections.sort(y);

			int count = 0;

			for (int k = 0; k <= result2.length() - 1; k++) {

				if (x.get(k) == y.get(k)) {

					count++;
				}

			}

			if (count == result2.length()) {

				System.out.println("The fllowing is an double number");
			}

			else {

				System.out.println("Folowing is not double number");
			}

		}

		else {

			System.out.println("Result is false");
		}

	}

}
