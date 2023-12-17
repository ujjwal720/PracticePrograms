package Shailesh;

public class yter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * descrption of string
		 */

		String[] englishAlphabets = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
				"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

		String jk = "ujjwal";

		int l = 26;

		String[] klm = jk.split("");

		String resultant = "";

		for (int i = 0; i <= klm.length - 1; i++) {

			for (int j = 0; j <= englishAlphabets.length - 1; j++) {

				if (klm[i].equals(englishAlphabets[j])) {

					int p = 25 - j;

					String words = englishAlphabets[p];
					
					resultant =resultant+words;

				}

			}

		}
		
		System.out.println(resultant);

	}

}
