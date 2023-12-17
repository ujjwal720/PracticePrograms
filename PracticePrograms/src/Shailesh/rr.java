package Shailesh;

public class rr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * remove consecutive character
		 */

		String s = "aabcc";
		/*
		 * o/p ab
		 */

		String result = "";

		char[] ip = s.toCharArray();

		for (int i = 0; i <= ip.length - 1; i++) {

			if (ip[i] != '?') {

				for (int j = i; j <= ip.length - 1; j++) {

					try {

						if (ip[i] == ip[j + 1]) {

							ip[j + 1] = '?';

						}

						else {

							break;

						}
					} catch (Exception e) {

					}

				}
			}

		}

		for (int i = 0; i <= ip.length - 1; i++) {

			if (ip[i] != '?') {
				result = result + ip[i];

			}
			
			

		}
		System.out.println(result);

	}

}
