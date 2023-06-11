package Shailesh;

public class questions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Angram check
		 */
		int count = 0;
		String s1 = "listen";
		String s2 = "sileno";
		char[] kl = s1.toCharArray();

		if (s1.length() == s2.length()) {

			for (int i = 0; i <= s1.length() - 1; i++) {

				if (kl[i] != '@') {

					for (int j = 0; j <= s1.length() - 1; j++) {

						if (kl[i] == s2.charAt(j)) {

							kl[i] = '@';

						}

					}
				}

			}

			for (int i = 0; i <= kl.length - 1; i++) {

				if (kl[i] == '@') {

					count++;
				}
			}

			if (count == s1.length()) {

				System.out.println("The string are angram");
			}

			else {
				
				System.out.println("The string are not angram");

			}

		}
		
		else {
			
			System.out.println("Do not copare as length is not smae");
		}

	}

}
