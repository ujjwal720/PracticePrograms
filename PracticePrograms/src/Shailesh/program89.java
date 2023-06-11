package Shailesh;

public class program89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Find the transistion point
		 */

		int[] a = { 0, 0, 0, 1, 1 };

		for (int i = 0; i <= a.length - 1; i++) {

			int c = a[0];

			if (a[i] != c) {

				System.out.println("Transistion point is at index" + " " + i);

				break;
			}

		}

	}

}
