package Shailesh;

public class codingbat4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean result = codingbat4.xyBalance("yaaxbb");
		System.out.println(result);

	}
	/*
	 * xyx is balenced if y contain after x
	 */

	public static boolean xyBalance(String str) {

		boolean flag = false;
		int lm = 0;

		for (int i = str.length() - 1; i >= 0; i--) {

			if (str.charAt(i) == 'y') {

				for (int j = i - 1; j >= 0; j--) {

					if (str.charAt(j) == 'x') {

						flag = true;
						lm = 1;
						break;

					}

				}

			}

			if (str.charAt(i) == 'x') {

				for (int k = i - 1; k >= 0; k--) {

					if (str.charAt(k) == 'y') {

						flag = false;
						lm = 1;
						break;

					}

				}

			}

			if (lm == 1) {
				
				break;

			}
		}

		return flag;

	}
}
