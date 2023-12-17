package Practice;

public class gf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Array contain next to 2 somewhere
		 */

		int[] lm = { 1, 2, 1, 2 };
		gf.havetwo(lm);
	}

	public static void havetwo(int[] a) {
		int flag = 0;
		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] == 2) {

				if (a[i] == 2 && i == a.length - 1) {

					flag = 0;
					break;

				}

				if (a[i] == a[i + 1]) {

					flag = 1;

					System.out.println("It is an true");

					break;

				}

				else {

					i = i + 1;

				}

			}

		}
		if (flag == 1) {

			System.out.println("The following is there always");

		}

		else {

			System.out.println("The following is not there");

		}

	}

}
