package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class logicalprograms {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		/*
		 * Translate program
		 */

		String[] s = { "merry:god", "christmas:jul", "and:och", "happy:gott", "new:nytt", "year:ar" };

		List<String> eng = new ArrayList<String>();

		List<String> swe = new ArrayList<String>();

		for (int i = 0; i <= s.length - 1; i++) {

			String[] ro = s[i].split(":");
			eng.add(ro[0]);
			swe.add(ro[1]);

		}

		String words = "merry christmas";

		String[] word1 = words.split(" ");

		for (int j = 0; j <= word1.length - 1; j++) {

			for (int k = 0; k <= eng.size() - 1; k++) {

				if (eng.get(k).equals(word1[j])) {
					
					System.out.print((swe.get(k)));

				}

			}
			
			System.out.print(" ");

		}

	}

}
